package String;

public class St3 {
       public static void main(String[] args) {
        String s1 = "Ja" + "va"; // Java
        String s2 = "Java";

        System.out.println(s1 == s2); // true 

        String s3 = "Hello";
        String s4 = s3 + " World";
        String s5 = "Hello World";

        System.out.println(s4 == s5); // false

        String s6 = "Hello";
        String s7 = s6;

        System.out.println(s6 == s7); // true

        String s8 = "Hello";
        s8 = "World";

        System.out.println(s8); // World

        String s9 = new String("Hello");
        String s10 = "Hello";

        System.out.println(s9 == s10); // false
    }
 
}




/*
Excellent. This code demonstrates five important String concepts in Java. Let's understand why each output occurs, especially the difference between compile-time concatenation and runtime concatenation.
1. Compile-time String concatenation
String s1 = "Ja" + "va";
String s2 = "Java";

System.out.println(s1 == s2); // true


Why?

Both "Ja" and "va" are String literals. Java can evaluate their concatenation at compile time.

So the compiler effectively treats:
String s1 = "Ja" + "va";


as:
String s1 = "Java";


Both references point to the same pooled String object.
Output: true
2. Runtime String concatenation
String s3 = "Hello";
String s4 = s3 + " World";
String s5 = "Hello World";

System.out.println(s4 == s5); // false


Why?

Here, s3 is a variable, not a compile-time constant.

Java cannot resolve s3 + " World" as a constant expression at compile time.

The concatenation happens at runtime, creating a separate String object.
- s4 points to the runtime-created String object.
- s5 points to the String Pool object.
Different references, so == returns false.
Output: false
Important: Modern Java compilers may use StringConcatFactory invokedynamic for runtime concatenation rather than literally creating a StringBuilder in every case. The key point is that the resulting String is not automatically interned.
3. Reference assignment
String s6 = "Hello";
String s7 = s6;

System.out.println(s6 == s7); // true


Why?

You are not creating a new String object.

You are copying the reference from s6 into s7.

Both references point to the same object.
Output: true
4. String immutability
String s8 = "Hello";
s8 = "World";

System.out.println(s8); // World


Why?

This is a very important concept.

Strings in Java are immutable.

Immutable means once a String object is created, its content cannot be changed.

When you write:
s8 = "World";


You are not modifying "Hello".

Instead, you're assigning a different reference to s8.
Before reassignment
s8

"Hello"



After reassignment
s8

"World"

"Hello"

Original object unchanged



Output: World
5. Using the new keyword
String s9 = new String("Hello");
String s10 = "Hello";

System.out.println(s9 == s10); // false


Why?
- s9 references a separately created String object on the heap.
- s10 references the String Pool object.
Their contents are the same, but their references are different.
Output: false

6. Complete output
true
false
true
World
false


7. Test your understanding — interview level


*/