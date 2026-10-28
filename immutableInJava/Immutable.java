package immutableInJava;

public class Immutable {
    public static void main(String[] args) {
        // rukes to immuteable in java

        // marks class as final
        // marks variables as private and final
        // no setters

        Collage collage = new Collage("BBDIT","GHAziabaad");


        Student s1 = new Student(27, "irfan", collage);

        System.out.println(s1.getCollage().name);
        s1.getCollage().name="THPSIC";

System.out.println(s1.getCollage().name);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}

final class Student {
    private final int age;
    private final String name;
    private final Collage collage;

    Student(int age, String name, Collage collage) {
        this.age = age;
        this.name = name;
        this.collage = collage;
    }

    // getters

    public int getAge(){
        return  this.age;
    }
    public String getName() {
        return this.name;
    }
    public Collage getCollage(){
        return  this.collage;
    }

     
}

// mutable classs

class Collage{
    String name;
    String address;
 
    Collage(String name, String address){
        this.name=name;
        this.address=address;
    }
    
    
}