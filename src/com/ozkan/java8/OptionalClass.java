package com.ozkan.java8;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args){

        Optional<String> kullanici= Optional.of("Burak");
        Optional<String> kullanici2= Optional.empty();
        Optional<String> kullanici3= Optional.ofNullable("ozkan");

        if (kullanici.isPresent()) {
            System.out.println("Değer bulunmakta");
        } else {
            System.out.println("Değer bulunamıyor.");
        }

        kullanici.ifPresent(g -> System.out.println("Kullanıcı Adı Var."));
        kullanici2.ifPresent(g->System.out.println("Kullanıcı adı var"));
        kullanici3.ifPresent(g->System.out.println("Kullanıcı ozkan"));




     }
}
