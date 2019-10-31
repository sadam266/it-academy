package our;

public class Motorcycle extends Vehicle {

    public Motorcycle() {
        this.fuelTankCapacity = 5;
    }

    void drive() {
        fuelTankCapacity -= 2;
        System.out.println("I'm a car");
    }
}
