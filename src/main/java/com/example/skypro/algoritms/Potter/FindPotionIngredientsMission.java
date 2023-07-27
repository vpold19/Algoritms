package com.example.skypro.algoritms.Potter;

import java.util.List;

public class FindPotionIngredientsMission {
    private final Brewery brewery;

    public FindPotionIngredientsMission(Brewery brewery) {
        this.brewery = brewery;
    }

//    public void printPotionIngredients(List<Potion> potions, Potion needle) {
//        int iteration = 1;
//        for (int i = 0; i < potions.size(); i++) {
//            final Potion first = potions.get(i);
//            for (int j = i + 1; j < potions.size(); j++) {
//                final Potion second = potions.get(j);
//                Potion mix = brewery.mix(first, second);
//                if (mix.equals(needle)) {
//                    System.out.println(iteration + ". " + first + " + " + second + " " + mix);
//                    return;
//                }
//                iteration++;
//            }
//        }
//        System.out.println("Potion not found");
//    }
}
