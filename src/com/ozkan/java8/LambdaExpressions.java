package com.ozkan.java8;

//interface Merhaba{
//    public String soyle(String mesaj);
//
//}
interface Merhabalar{
    void soyle();
}
public class LambdaExpressions {
    public void mesaj(){
        System.out.println("Merhaba Dünya");
    }
    public static void main(String[] args) {

//        Merhaba m = (mesaj)->{
//            return "Merhaba, " +mesaj;
//        };
//        System.out.println(m.soyle("özkan"));

        LambdaExpressions merhabamesaji= new LambdaExpressions();
        Merhabalar merhabalar= merhabamesaji::mesaj;
        merhabalar.soyle();
    }
}
