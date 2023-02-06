package com.ozkan.javaBasicPrograms;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {

    public static void main(String[] args) {
        //Using the Math.random() Method *****************
        System.out.println("1 st Random Number " +Math.random());
        int min = 200;
        int max = 400;
        System.out.println("Random value of type double between "+min+" to "+max+ ":");
        double a = Math.random()*(max-min+1)+min;
        System.out.println(a);
        System.out.println("Random value of type int between "+min+" to "+max+ ":");
        int b = (int)(Math.random()*(max-min+1)+min);
        System.out.println(b);

        //Using the Random Class **************************
        Random random = new Random();
        int x = random.nextInt(50);
        double y = random.nextDouble();
        float f  = random.nextFloat();
        long l  = random.nextLong();
        boolean t = random.nextBoolean();

        System.out.println("Randomly Generated Integers Values");
        System.out.println(x);
        System.out.println(y);
        System.out.println(f);
        System.out.println(l);
        System.out.println(t);


        //Using the ThreadLocalRandom Class ******************
        int intThread = ThreadLocalRandom.current().nextInt();
        double doubleThread = ThreadLocalRandom.current().nextDouble();
        boolean booleanThread = ThreadLocalRandom.current().nextBoolean();

        System.out.println("Randomly Generated Integer Values:");
        System.out.println(intThread);
        System.out.println(doubleThread);
        System.out.println(booleanThread);

        //Random Number Generation in Java 8 ******************
        randomInts(5);
        randomInts(9, 50, 90);
    }

    private static void randomInts(int i) {
        System.out.println("Randomly Generated Integer Values:");
        Random random  = new Random();
        random.ints(i).forEach(System.out::println);
    }
    public static void randomInts(int num, int origin, int bound){
        Random random1 = new Random();
        random1.ints(num, origin, bound).forEach(System.out::println);
    }

}
