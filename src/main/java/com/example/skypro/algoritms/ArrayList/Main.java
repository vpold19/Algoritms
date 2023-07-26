package com.example.skypro.algoritms.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(10);
        list.add(250);
        list.add(36);
        //list.add(8);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.contains(250));
    }
}
