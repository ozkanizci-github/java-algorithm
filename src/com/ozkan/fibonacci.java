package com.ozkan;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç adet fibonaci girmek istiyorsunuz : ");
        int sayi = sc.nextInt();
        int number1 = 0;
        int number2 = 1;
        int number3 = number1+number2;

        System.out.println("Fibonacci sayıları");
        System.out.println(number1+ " " +number2+ "");
        while (sayi>0){
            System.out.println(number3+ " ");
            sayi--;
            number1=number2;
            number2=number3;
            number3 = number1+number2;
        }

    }
}
