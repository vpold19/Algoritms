package com.example.skypro.algoritms.hashcode;

import java.util.HashMap;
import java.util.Map;

public class DemoHahMapApplication {
    public static void main(String[] args) {
        Map<User, String> result = new HashMap<>();


        result.put(new User(1, "Roman"), "Roman");
        result.put(new User(2, "Max"), "Max");

        assert result != null;
    }
}
