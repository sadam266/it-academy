package our;

//subclass/derived class of a vehicle
public class Car extends Vehicle {

    public Car() {
        this.fuelTankCapacity = 10;
    }

    void drive() {
        System.out.println("I'm a car");
    }
}
