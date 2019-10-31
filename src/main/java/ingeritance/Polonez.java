package ingeritance;

public class Polonez extends Car {
    protected Polonez( String color) {
        super(25, color);
    }

    void drive() {
        System.out.println("I'm a polonez car");
    }
}
