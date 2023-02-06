package com.ozkan.javaBasicPrograms.factorial;

public class FactorialExample1 {
    public static void main(String[] args) {
        int i = 1;
        int fact = 1;
        int number  = 5 ;
        for (i = 1; i<=number; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of 5 : "+number+ " is " +fact);
    }
}
