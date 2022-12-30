package com.ozkan.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        //Listeleme
        Arrays.asList("özkan","Mehmet","Erman").stream().forEach(System.out::println);

        //Filtreleme
//        List<String> degerler = Arrays.asList("özkan","Mehmet","java");
//        List<String> sonuc = degerler.stream()
//                .filter(degerler-> !"java".equals(degerler))
//                .collect(Collectors.toList());
//        sonuc.stream(forEach)(System.out::print);

        List<Integer> sayi= Arrays.asList(5,2,7,1);

        List<Integer> toplananSayi= sayi.stream().map( i -> i+2).distinct().collect(Collectors.toList());
         toplananSayi.stream().forEach(System.out::println);



    }
}
