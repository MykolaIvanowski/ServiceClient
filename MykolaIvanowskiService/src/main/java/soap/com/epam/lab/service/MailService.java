package soap.com.epam.lab.service;
import model.Letter;
import soap.com.epam.lab.modelweb.Response;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface MailService {

    @WebMethod
    Response getLetterByMail(String mail);
    @WebMethod
    Response getLetterBySubject(String subject);
    @WebMethod
    Response addLetter(Letter letter);
    @WebMethod
    Response<Letter> getAllLetters();
    @WebMethod
    Response removeLetter( @WebParam(name="id") int id );
}
