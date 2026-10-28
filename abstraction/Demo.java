package abstraction;

public class Demo {
    public static void main(String[] args) {

        EC e = new EC();
        FuelCar fc = new FuelCar();
        e.Start();
        e.accelarate();
        e.breaking();


        fc.Start();
        fc.accelarate();
        fc.breaking();

        
    }
}

abstract class Car {
    void Start() {
        System.out.println("car start");
    }

    abstract void accelarate();

    abstract void breaking();
}

class EC extends Car {
    @Override 
    void accelarate() {
        System.out.println("EC car accelarate");

    }
    @Override 
    void breaking() {
        System.out.println("EC car breaking");
    }

}

class FuelCar extends Car {
    @Override 
    void accelarate() {
        System.out.println("fuel car accelarate");

    }
     @Override 
    void breaking() {
        System.out.println("Fuel  car breaking");
    }

}