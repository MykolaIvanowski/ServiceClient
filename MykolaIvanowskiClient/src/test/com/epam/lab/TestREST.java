package com.epam.lab;


import com.epam.lab.helper.Source;
import com.epam.lab.loggers.Log;

import com.sun.jersey.api.client.ClientResponse;
import model.Letter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.reporters.TestHTMLReporter;
import rest.com.epam.lab.helper.Parser;
import rest.com.epam.lab.web.LetterClient;



import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;


@Listeners(TestHTMLReporter.class)
public class TestREST {

    private LetterClient letterClient;

    private ClientResponse response;
    private Parser<Letter> parser = new Parser<Letter>();

    @BeforeClass
    public  void start() {
        Log.infoLog("setting up remote web service");
        letterClient = new LetterClient();
        Log.infoLog("connection to remote web service successful");
    }

    @Test
    public void getAllTest() {
        response = letterClient.getRequest(Source.URL + "/letter");
        String jsonEntity = response.getEntity(String.class);
        List<Letter> letters =  parser.parseToList(jsonEntity, Letter.class);
        assertNotNull(letters);
        Log.infoLog("List of letters was get successfully");
    }

    @Test
    public void sendLetterTest() {
        Letter letter = new Letter(11,"this is subject eleven", "this is mail eleven", "this is body eleven");
        response = letterClient.postRequest(Source.URL + "/sendLetter", letter);
        assertEquals(response.getEntity(String.class), "Letter send");
        Log.infoLog( "letter send successful");
    }

    @Test
    public void getLetterBySubjectTest() {
        String subject = "this is subject five";
        String url = Source.URL + "/getLetterBySubject/" + subject;
        response = letterClient.getRequest(url);
        System.out.println(response.getType());
        String jsonEntity = response.getEntity(String.class);
        Letter letter =  parser.parseToLetter(jsonEntity);
        assertEquals(letter.getSubject(), subject);
        Log.infoLog("successful get by subject");
    }

    @Test
    public void getLetterByEmailTest() {
        String email = "this is mail four";
        response = letterClient.getRequest(Source.URL + "/letter/getLetterByEmail/" + email);
        String jsonEntity = response.getEntity(String.class);
        Letter letter =  parser.parseToLetter(jsonEntity);
        assertEquals(letter.getMailTo(), email);
        Log.infoLog("successful get by mail");
    }

    @Test
    public void removeLetterTest() {
        response = letterClient.deleteRequest(Source.URL + "/removeLetter", 4);
        assertEquals(response.getEntity(String.class), "Letter removed");
        Log.infoLog( "letter removed successful");
    }
}
