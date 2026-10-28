package constructor;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();

    }

}

class Student {
    String name;
    int age;
    int rollNumber;
    String collagename;

    Student(String name, int age, int rollNumber, String collagename) {

    };

    Student() {

        System.out.println("Constructor called");
        name = "irfan";
        age = 26;
        rollNumber = 28;
        collagename = "BBDIT";

    }

    void markattaindence() {
        System.out.println("Attaindance marked by" + name);
    }
}
