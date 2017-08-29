package rest.com.epam.lab.helper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Letter;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.CollectionType;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

public class Parser<T> {
    private Letter letter ;
    Gson parse = new GsonBuilder().setPrettyPrinting().create();

    public Letter parseToLetter(String string ){

            letter  = parse.fromJson(string, Letter.class);

        return letter;
    }

    public String convertToJSON(Letter letter){
        String json = parse.toJson(letter);
        return json;
    }

    public List<T> parseToList(String json, Class <T> data) {

        ObjectMapper objectMapper = new ObjectMapper();
        CollectionType type = objectMapper.getTypeFactory().constructCollectionType(List.class, data);
        try {
            return objectMapper.readValue(json, type);
        } catch (IOException e) {
            e.printStackTrace();
        };
        return null;
    }
}
