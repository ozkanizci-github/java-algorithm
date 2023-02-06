package com.ozkan.javaBasicPrograms.armstrongNumber;

public class ArmstrongNumberExample2 {
    public static void main(String[] args) {
        int temp, birler, onlar, yuzler , toplam;
        int i = 153;
            temp=i;

            birler = temp%10;
            temp/=10;

            onlar = temp%10;
            temp/=10;

            yuzler = temp%10;
            temp/=10;

            toplam = (birler*birler*birler)+(onlar*onlar*onlar)+(yuzler*yuzler*yuzler);
            if(toplam==i){
                System.out.println(i+ " Bir Armstrang sayıdır.");

        }
    }
}
