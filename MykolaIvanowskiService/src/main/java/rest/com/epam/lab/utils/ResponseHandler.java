package rest.com.epam.lab.utils;
import dao.LetterDAO;
import model.Letter;
import javax.ws.rs.core.Response;

public class ResponseHandler {
    private static Parser parser = new Parser();
    private static String SENT = "letter was sent";
    private static String REMOVED = "letter was removed";
    private static LetterDAO letter = new LetterDAO();


    public static Response getAllLetters() {
        return Response.status(200).entity(parser.convertToList(letter.getAll())).build();
    }

    public static Response sendLetter(Letter lett) {
        letter.addLetter(lett);
        return Response.status(200).entity(SENT).build();

    }

    public static Response removeLetter(int id) {
        letter.removeLetter(id);
        return Response.status(200).entity(REMOVED).build();
    }

    public static Response getLetterByEmail(String email) {
        try {
            return Response.status(200).
                    entity(parser.convertToString(letter.
                                    getLetterByMail(email))).build();
        } catch (Exception ex){
            return Response.status(204).build();
        }
    }

    public static Response getLetterBySubject(String subject) {
       try {
           return Response.status(200).
                   entity(parser.
                           convertToString(letter.
                                   getLetterBySubject(subject))).build();
       }catch (Exception ex){
          return Response.status(204).build();
       }
    }
}
