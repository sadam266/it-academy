package ingeritance;

public abstract class Vehicle {
    private static int vehiclesProduced = 0;

    private final int numberOfWheels;
    private final int maxSpeed;
    private String color;

    public static int getVehiclesProduced() {
        return vehiclesProduced;
    }

    abstract void drive();

    protected Vehicle(int numberOfWheels, int maxSpeed, String color) {
        vehiclesProduced++;
        this.numberOfWheels = numberOfWheels;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
