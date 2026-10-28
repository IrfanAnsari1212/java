package abstraction;

public class abs {
    public static void main(String[] args) {
        Car ec = new ElectricCar();
        ec.start();
        ec.accelarate();
        ec.brake();

        Car fc = new fuelCar();
        fc.start();
        fc.accelarate();
        fc.brake();
    }

}

interface Car {
    void start();

    void accelarate();

    void brake();
}

class fuelCar implements Car {
    @Override
    public void start() {
        System.out.println("fuel car started");
    }

    @Override
    public void accelarate() {
        System.out.println("fuel car accelareted");

    }

    @Override
    public void brake() {
        System.out.println("fuel car stopeed");

    }
}

class ElectricCar implements Car {
    @Override
    public void start() {
        System.out.println("electric car started");

    }

    @Override
    public void accelarate() {
        System.out.println("electric car accelarated");

    }

    @Override
    public void brake() {
        System.out.println("electric car  stopped");

    }
}
