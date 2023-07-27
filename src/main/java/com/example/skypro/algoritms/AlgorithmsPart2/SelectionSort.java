package com.example.skypro.algoritms.AlgorithmsPart2;

import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,8,41,59,100,250,2,5,7);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.size(); i++) {
            Integer element = numbers.get(i);
            if(max< element){
                max= element;
            }
        }
        System.out.println(max);
    }
    
}
