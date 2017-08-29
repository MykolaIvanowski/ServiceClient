package rest.com.epam.lab.serviceimpl;


import model.Letter;
import rest.com.epam.lab.service.MailService;
import rest.com.epam.lab.utils.Parser;
import rest.com.epam.lab.utils.ResponseHandler;


import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/service")
public class MailServiceImpl implements MailService {

    private Parser<Letter> parser = new Parser<Letter>();

    @Override
    public Response getAllLetters() {

        return ResponseHandler.getAllLetters();
    }

    @Override
    public Response getLetterByEmail(String email) {

        return ResponseHandler.getLetterByEmail(email);
    }

    @Override
    public Response getLetterBySubject(String subject) {

        return ResponseHandler.getLetterBySubject(subject);
    }

    @Override
    public Response send(String letter) {

        return ResponseHandler.sendLetter(parser.parseTo(letter, Letter.class));
    }

    @Override
    public Response deleteLetter(int id) {

        return ResponseHandler.removeLetter(id);
    }
}
