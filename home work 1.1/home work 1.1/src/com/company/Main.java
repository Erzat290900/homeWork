package com.company;

import com.sun.source.tree.IfTree;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("введите ваше имя");
        String string = s.nextLine();
        System.out.println("вы вели"+string);


    }
}