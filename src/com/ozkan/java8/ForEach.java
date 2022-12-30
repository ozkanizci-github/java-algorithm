package com.ozkan.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> listem =new ArrayList<>(Arrays.asList("A","B","C","D","E"));

        listem.forEach(System.out::println);

                listem.forEach(item->{
                    if ("C".equals(item)){
                        System.out.println(item);
                    }
                });

        //Lamda
        listem.forEach(item->System.out.println(item));

        //method referans
        listem.forEach(System.out::println);

        //fiter
        listem.stream().filter(s -> s.contains("B")).forEach(System.out::println);
    }

}
