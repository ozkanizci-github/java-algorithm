package com.ozkan.java8;

interface MerhabaInterface{
    default void mesaj(String kullaniciAdi){
        System.out.println("Hello " +kullaniciAdi);
    }
    default void soyle(String soz){
        System.out.println("word to say : " +soz);
    }
}

public class DefaultMethods implements MerhabaInterface{
    public static void main(String[] args) {

        DefaultMethods df = new DefaultMethods();
        df.mesaj("ozkan");
        df.soyle("Özkan will have the last word");


    }

}
