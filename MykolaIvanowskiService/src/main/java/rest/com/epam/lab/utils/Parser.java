package rest.com.epam.lab.utils;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Collection;
import java.util.List;

public class Parser<T> {

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public T parseTo(String json, Class<T> dataClass) {

        return gson.fromJson(json, dataClass);
    }

    public String convertToString(T obj) {

        return gson.toJson(obj, String.class);
    }

    public String convertToList(List<T> collection) {

        return gson.toJson(collection);
    }
}
