package Generics;

public class Genericsmethods {
    public static void main(String[] args) {

        display(100);
        display("hello");
        display(10.5);

    }

    public static <T> void display(T value) {

        // public static <T> void display(T value)

        /*
         * The <T> before the return type declares a method-level type parameter.
         * 
         * Java infers the type from the argument:
         * - display(100) → T is Integer.
         * - display("Hello") → T is String.
         * - display(10.5) → T is Double.
         * Notice that Java uses wrapper classes for generic type arguments. You cannot
         * write Box<int>; use Box<Integer>.
         * 
         */

        System.out.println(value);
    }
}