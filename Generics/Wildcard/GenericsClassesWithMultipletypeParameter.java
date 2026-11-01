package Generics.Wildcard;

public class GenericsClassesWithMultipletypeParameter {
    public static void main(String[] args) {
        Employee<Integer, String> e1 = new Employee<>(101, "Irfan");
        e1.display();
    }
}
class Employee<K, V> {
    K id;
    V name;


    Employee (K id, V name){
        this.id = id;
        this.name=name;
    }

    void display(){
        System.out.println("ID: " + id);
        System.out.println("Name:" + name );
    }



}