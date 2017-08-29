package dao;

import model.Letter;
import testvalue.MailValue;

import java.util.ArrayList;
import java.util.List;

public class LetterDAO {
    private List<Letter> letters = new ArrayList<Letter>();
    private Letter letter = new Letter();
    String[] arrayCountLetter = {"one","two", "three","four", "five"};

    public LetterDAO() {
        initialisedLetters();
    }
    public void addLetter(Letter letter ){

        letters.add(letter);
    }
    public List<Letter> getAll(){
        return letters;
    }
    public  void removeLetter(int id){

        letters.remove(id);
    }

    public Letter getLetterBySubject( String subject ) throws Exception{
        for (Letter letter : letters) {
            if(letter.getSubject().equals(subject)){
                return letter;
            }
        }
        throw new Exception("not fount letter");
    }

    public Letter getLetterByMail(String mail) throws Exception{
        for (Letter letter : letters) {
            if(letter.getEmail().equals(mail)){
                return letter;
            }
        }
        throw new Exception("not fount letter");
    }

    private Letter initialisedLetter( int id,String mail, String subject,String body){
        letter = new Letter();
        letter.setBody(body);
        letter.setId(id);
        letter.setEmail(mail);
        letter.setSubject(subject);
        return letter;
    }

    private void initialisedLetters(){
        for(int i =0; i < 5;  i++){
            letters.add(initialisedLetter(MailValue.MAIL_ID+i,
                    MailValue.MAIL_RESPONDENT+arrayCountLetter[i],
                    MailValue.MAIL_SUBJECT+arrayCountLetter[i],
                    MailValue.MAIL_BODY+arrayCountLetter[i]));
        }
    }
}
