package org.example;

import com.google.gson.Gson;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> name = new LinkedHashMap<>();
        name.put("name", "Dmytro");
        name.put("lastName", "Kaplun");
        System.out.println(new Gson().toJson(name));
    }

}