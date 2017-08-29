package com.epam.lab;

import com.epam.lab.loggers.Log;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import org.testng.reporters.TestHTMLReporter;
import soap.com.epam.lab.service.Letter;
import soap.com.epam.lab.service.Summary;
import soap.com.epam.lab.serviceimpl.MailService;
import soap.com.epam.lab.serviceimpl.MailServiceImplService;
import soap.com.epam.lab.service.Response;

import java.lang.reflect.Method;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;


@Listeners({TestHTMLReporter.class})
public class TestSOAP {
    private static MailService mailService;

    @BeforeClass
    public static void start() {
        Log.infoLog("start mail service");
        mailService = new MailServiceImplService().getMailServiceImplPort();
    }

    @Test
    public void getAllLettersTest() {
        Response<Letter> response = mailService.getAllLetters();
        Log.infoLog(" request get  all letters  ");
        assertNotNull(response);
        Log.infoLog(response.getSummarySuccess().getSuccessMessage());
    }

    @Test
    public void getLetterByEmailTest() {
        Response<Letter> response = mailService.getLetterByMail("this is mail one");
        assertEquals(response.getSummarySuccess()
                .getSuccessMessage(), Summary.GET_BY_EMAIL);
        Log.infoLog(response.getSummarySuccess()
                .getSuccessMessage());
    }

    @Test
    public void getLetterBySubjectTest() {
        Response<Letter> response = mailService.getLetterBySubject("this is subject two");
        assertEquals(response.getSummarySuccess().
                getSuccessMessage(), Summary.GET_BY_SUBJECT);
        Log.infoLog(response.getSummarySuccess().getSuccessMessage());
    }

    @Test
    public void sendLetterTest() {
        Response response = mailService.
                addLetter(new Letter(10,"subject ten",
                        "mail ten", "message in body ten"));
        assertEquals(response.getSummarySuccess()
                .getSuccessMessage(), Summary.SEND);
        Log.infoLog(response
                .getSummarySuccess().getSuccessMessage());
    }

    @Test
    public void removeLetterTest() {
        Response<Letter> response = mailService.removeLetter(2);
        assertEquals(response.getSummarySuccess()
                .getSuccessMessage(), Summary.DELETE);
        Log.infoLog(response
                .getSummarySuccess().getSuccessMessage());
    }

    @Test
    public void removeLetterFailTest() {
        Response<Letter> response = mailService.removeLetter(15);
        assertNotEquals(response.getSummaryFault().getErrorMessage(), Summary.DELETE, "NOT Equals");
        Log.infoLog(response.getSummaryFault().getErrorMessage());
    }

    @AfterMethod
    public void afterMethod(ITestResult result, Method method) {
        if (result.getStatus() == ITestResult.FAILURE) {
            Log.errorLog("failed " + method + "\n");
        }
    }
}
