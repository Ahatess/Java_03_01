package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("Iveskite skaiciu");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2 == 0){
            System.out.println("Skaicius yra lyginis");
        }else {
            System.out.println("Skaicius yra nelyginis");
        }
    }
}
