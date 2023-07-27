package com.example.skypro.algoritms.AlgorithmsPart2;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        //                              0,1,2,3,4, 5, 6, 7, 8,  9
        List<Integer> numbers = List.of(2,4,6,7,12,25,26,40,100,250);
        /* Бинарный поиск по шагам
        2,4,6,7,12,|25,26,40,100,250
                    25,26,40,|100,250
                    25,26,|40
                           40
         */
        System.out.println(Collections.binarySearch(numbers, 40));

    }
}
