package String;

public class St4 {
   public static void main(String[] args) {
    String s = "";
    for(int i = 0; i<5; i++){
        s += i;
        System.out.println(s);
    }
   } 
}
/*
Your understanding is correct. This example demonstrates one of the biggest disadvantages of using String for repeated modifications: String immutability creates multiple String objects during concatenation.

Let's break it down.
1. What happens during execution?
Your code:
public class Demo3 {
    public static void main(String[] args) {
        String s = "";

        for(int i = 0; i < 5; i++) {
            s += i;
            System.out.println(s);
        }
    }
}


Output:
0
01
012
0123
01234


2. Understanding the object creation
Remember: Strings are immutable. Once created, their contents cannot be changed.

When you write:
s += i;


Java effectively performs:
s = s + i;


A new String is created containing the old value plus the new character.
Iteration 1
i = 0
"" + 0

"0"


Iteration 2
i = 1
"0" + 1

"01"


Iteration 3
i = 2
"01" + 2

"012"


Iteration 4
i = 3
"012" + 3

"0123"


Iteration 5
i = 4
"0123" + 4

"01234"


Each iteration creates a new result String. The previous String remains unchanged, and if nothing else references it, it becomes eligible for garbage collection.
3. Why is this a performance problem?
Imagine you have a loop running 10,000 times.

Every iteration creates a new String result and copies the existing content into it.

For repeated concatenation, the total copying can grow quadratically:
\[
1+2+3+\cdots+n = \frac{n(n+1)}{2}
\]

That's why repeated String concatenation can be inefficient.
4. Solution: StringBuilder
Java provides StringBuilder for mutable strings.
public class Demo3 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 5; i++) {
            sb.append(i);
            System.out.println(sb);
        }
    }
}


Output remains:
0
01
012
0123
01234


The difference:
String	StringBuilder
Immutable	Mutable
Creates a new result on concatenation	Modifies its existing character sequence
Less suitable for repeated modifications	Ideal for repeated modifications
Thread-safe due to immutability	Not thread-safe

There is also StringBuffer, which is synchronized and suitable when synchronized mutable string operations are needed.

5. Interview challenge
Consider this code:
StringBuilder sb = new StringBuilder("Java");

String s1 = sb.toString();
sb.append(" Developer");

String s2 = sb.toString();

System.out.println(s1);
System.out.println(s2);
System.out.println(s1 == s2);


What will be the output?

Java / Java Developer / false

Java Developer / Java Developer / true

Java / Java Developer / true

Java Developer / Java / false

Check answerCorrect!

Correct answer: A.

toString() produces a String snapshot. Later modifications to the StringBuilder do not modify the earlier String. The two snapshots are different String objects.


This is a useful bridge to understanding String, StringBuilder, StringBuffer, and object references in Java.


*/