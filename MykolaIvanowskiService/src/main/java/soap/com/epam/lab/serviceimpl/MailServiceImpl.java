package soap.com.epam.lab.serviceimpl;
import model.Letter;
import soap.com.epam.lab.modelweb.SummarySuccess;
import dao.LetterDAO;
import soap.com.epam.lab.modelweb.Response;
import soap.com.epam.lab.service.MailService;
import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "soap.com.epam.lab.service.MailService")
public class MailServiceImpl implements MailService{
    LetterDAO letterDAO = new LetterDAO();
    private List<Letter> letters;

    public Response getLetterByMail(String mail) {
        try{
            return Response.success(SummarySuccess.GET_BY_EMAIL,letterDAO.getLetterByMail(mail));
        }catch (Exception ex){
            return Response.fault(ex.getMessage());
        }
    }

    public Response getLetterBySubject(String subject) {
        try{
            return Response.success(SummarySuccess.GET_BY_SUBJECT,letterDAO.getLetterBySubject(subject));
        }catch (Exception ex){
            return Response.fault(ex.getMessage());
        }
    }

    public Response<Letter> getAllLetters() {
        try{
            return Response.success(SummarySuccess.GET_ALL,letters = letterDAO.getAll());
        }catch (Exception ex){
            return Response.fault(ex.getMessage());
        }
    }

    public Response addLetter(Letter letter) {
        try{
            letterDAO.addLetter(letter);
            return Response.success(SummarySuccess.SEND );
        }catch (Exception ex){
            return Response.fault(ex.getMessage());
        }
    }

    public Response removeLetter(int id) {
        try{
            letterDAO.removeLetter(id);
            return Response.success(SummarySuccess.DELETE );
        }catch (Exception ex){
            return Response.fault(ex.getMessage());
        }
    }
}
