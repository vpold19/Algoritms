package com.example.skypro.algoritms.AlgorithmsPart2;

import java.util.List;

public class Complexity {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 5, 7, 8, 41, 59, 100, 250, 350);

        //Увеличение от 1 до 10
        /*
        1. 1 * 2 = 2   2 меньше 10
        2. 2 * 2 = 4   4 меньше 10
        3. 4 * 2 = 8   8 меньше 10
        4. 8 * 2 = 16  16 больше 10

        Значит, надо 4 шага, чтобы добраться от 1 до 10
        log(16) = 4
         */

        //Увеличение от 10 до 1
        /*
        1. 10 / 2 = 5  5 больше 1
        2. 5 / 2 = 3   3 больше 1
        3. 3 / 2 = 2   2 больше 1
        4. 2 / 2 = 1   1 равно 1

        Значит, надо 4 шага, чтобы добраться от 10 до 1
        log(10) - 4
         */
        //Логарифм
        /*

         */
        //n log(n)
        //
        for(int i = 0; i<10;i++){// Линейная сложность N or O(N)
            for (int j = 0;j<10;j++){// Линейная сложность
            }
        }
        for(int i = 0; i<10;i=i/2){// Логарифмичнская сложность
            for (int j = 0;j<10;j++){//Линейная сложность
            }
        }
    }
}