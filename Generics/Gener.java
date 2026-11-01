package Generics;

import java.util.ArrayList;

public class Gener {

    public static void main(String[] args) {
        // ArrayList list = new ArrayList();// for generics new ArrayList<>();
        // list.add(100);
        // list.add("hello");
        // list.add(10.5);


        // Integer num = (Integer) list.get(0);

        // System.out.println(num);// even thought its give the real output , but what if i try to list.get(1)?
        //     Integer num2 = (Integer) list.get(1);
        // System.out.println(num2);//Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap') at Generics.Gener.main(Gener.java:17)
   
    




         ArrayList <Integer> list = new ArrayList<>();
         list.add(100);
         list.add(147);

         //list.add("hello");//compile time error (the method add(Integer) int the type ArrayList<Integer> is not applicable for the argument String )
        
         Integer num = list.get(0);
         System.out.println(num);
    }

    
}
