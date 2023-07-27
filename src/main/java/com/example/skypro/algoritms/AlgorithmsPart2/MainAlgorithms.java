package com.example.skypro.algoritms.AlgorithmsPart2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainAlgorithms {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();//Динамический массив
        List<Integer> linkedList = new LinkedList<>();//Связный список

        //Получения элемента по списку
        arrayList.get(2);//константная сложность
        linkedList.get(2);//Линейная сложность

        //Вставка в начало
        arrayList.add(0, 2);//Линейная сложность
        linkedList.add(0, 2);//константная сложность

        //Перебор всех комбинаций элементов
        for (int i = 0; i < arrayList.size(); i++) { // Квадратная сложность
            for (int j = 0; j < arrayList.size(); j++) {
                System.out.println(arrayList.get(i) + " -- " + arrayList.get(j));
            }
        }

        //Печать всех элементов
        for (int i = 0; i < arrayList.size(); i++) { //Линейная сложность
            System.out.println(arrayList.get(i));
        }

        //Печать всех элементов
        for (int i = 0; i < linkedList.size(); i++) { // Квадратная сложность
            System.out.println(linkedList.get(i));
        }
    }
}
