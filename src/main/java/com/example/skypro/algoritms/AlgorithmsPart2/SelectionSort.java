package com.example.skypro.algoritms.AlgorithmsPart2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 8, 41, 59, 100, 250, 2, 5, 7, 350));

        //sort(numbers);
        Collections.sort(numbers);


        System.out.println(numbers);
    }

    private static void sort(List<Integer> numbers) {
        for (int idxCurr = numbers.size() - 1; idxCurr >= 0; idxCurr--) {
            int max = Integer.MIN_VALUE;
            int idxMax = 0;
            for (int i = 0; i <= idxCurr; i++) {
                final Integer element = numbers.get(i);
                if (max < element) {
                    max = element;
                    idxMax = i;
                }
            }
            int tmp = numbers.get(idxCurr);
            numbers.set(idxCurr, max);
            numbers.set(idxMax, tmp);
        }
    }

}
