package encapsulationAndInheritance;

public class encap {
    public static void main(String[] args) {
        bankAccount account = new bankAccount();
        account.deposit(1000);
        account.withdraw(500);
        System.out.println(account.getBalance());
        System.out.println("Transaction completed");
        Student s1 = new Student("irfan", 28, "bbdit", 28);

        System.out.println(s1);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("College: " + s1.getCollage());
        System.out.println("Roll Number: " + s1.getRollNumber());
    }
}

class bankAccount {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

}

class Student {
    private String name;
    private int age;
    private String collageName;
    private int rollNumber;

    Student(String name, int age, String collageName, int rollNumber) {
        this.name = name;
        this.age = age;
        this.collageName = collageName;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollage() {
        return collageName;
    }

    public void setCollage(String collageName) {
        this.collageName = collageName;
    }

    public int getAge() {
        return age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
