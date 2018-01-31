package com.company;
import uzdaviniai.LyginisNelyginis;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Iveskite skaiciu");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        LyginisNelyginis objektas = new LyginisNelyginis();

        objektas.setA(a);

        System.out.println("Ivesta skaicius: " + objektas.getA());
        objektas.skaiciuok();

    }
}
