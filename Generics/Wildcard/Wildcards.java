package Generics.Wildcard;

public class Wildcards {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.setValue(12);
        System.out.println(b1.getValue());

        Box<Double> b2 = new Box<>();
        b2.setValue(10.0);
        System.out.println(b2.getValue());


        Box<String> b3 = new Box<>();
        b3.setValue("hello ji");
        System.out.println(b3.getValue());

    }
}

class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
