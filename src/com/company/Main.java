package com.company;

import com.sun.source.tree.IfTree;

public class Main {


    public static void main(String[] args) {
        String redBeautifulFlowers = "красные красивые цветы";
        final int NUMOFFLOWERS = 7;
        String word = "Erzat";
        System.out.println(redBeautifulFlowers + NUMOFFLOWERS);
        System.out.println(word + redBeautifulFlowers + NUMOFFLOWERS);

        int numberOfFlowers = 21;

        if (numberOfFlowers > 0) {
            System.out.println("число положительный");
        } else {
            System.out.println("число орицательный");
        }


    }
}