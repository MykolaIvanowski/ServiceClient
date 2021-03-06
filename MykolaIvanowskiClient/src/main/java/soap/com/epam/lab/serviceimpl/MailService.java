
package soap.com.epam.lab.serviceimpl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import soap.com.epam.lab.service.Letter;
import soap.com.epam.lab.service.ObjectFactory;
import soap.com.epam.lab.service.Response;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MailService", targetNamespace = "http://service.lab.epam.com.soap/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MailService {


    /**
     * 
     * @return
     *     returns main.java.soap.com.epam.lab.service.Response
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.lab.epam.com.soap/MailService/getAllLettersRequest", output = "http://service.lab.epam.com.soap/MailService/getAllLettersResponse")
    public Response getAllLetters();

    /**
     * 
     * @param id
     * @return
     *     returns main.java.soap.com.epam.lab.service.Response
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.lab.epam.com.soap/MailService/removeLetterRequest", output = "http://service.lab.epam.com.soap/MailService/removeLetterResponse")
    public Response removeLetter(
        @WebParam(name = "id", partName = "id")
        int id);

    /**
     * 
     * @param arg0
     * @return
     *     returns main.java.soap.com.epam.lab.service.Response
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.lab.epam.com.soap/MailService/addLetterRequest", output = "http://service.lab.epam.com.soap/MailService/addLetterResponse")
    public Response addLetter(
        @WebParam(name = "arg0", partName = "arg0")
        Letter arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns main.java.soap.com.epam.lab.service.Response
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.lab.epam.com.soap/MailService/getLetterByMailRequest", output = "http://service.lab.epam.com.soap/MailService/getLetterByMailResponse")
    public Response getLetterByMail(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns main.java.soap.com.epam.lab.service.Response
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.lab.epam.com.soap/MailService/getLetterBySubjectRequest", output = "http://service.lab.epam.com.soap/MailService/getLetterBySubjectResponse")
    public Response getLetterBySubject(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);
}
