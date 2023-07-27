package com.example.skypro.algoritms.AlgorithmsPart2;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        //                              0,1,2,3,4, 5, 6, 7, 8,  9
        List<Integer> numbers = List.of(2,4,6,7,12,25,26,40,100,250);
        System.out.println(numbers.get(4));
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) == 12){
                System.out.println(i);
                break;
            }
        }
    }
}
