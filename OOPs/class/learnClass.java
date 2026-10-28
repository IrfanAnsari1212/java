public class learnClass {
    public static void main(String[] args){


        Student s1 = new Student();
        Student s2 = new Student();


        s1.name = "irfan";
        s1.age = 26;
        s1.rollNumber = 28;
        s1.collage = "BBDIT";





        s2.name = "Rijwan";
        s2.age = 20;
        s2.rollNumber = 110;
        s2.collage = "THPSIC";



        s1.markattaindence();
        s2.markattaindence();



        s1.print();
        s2.print();

    
    }
}

class Student {
    String name;
    int age;
    int rollNumber;
    String collage;

    void markattaindence(){
        System.out.println("Attaindance marked by" + name);
    }

    void print(){
        System.out.println(name + "," + age + "," +rollNumber + "," + collage );
    }
}
