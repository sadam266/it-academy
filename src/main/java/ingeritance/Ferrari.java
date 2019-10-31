package ingeritance;

public class Ferrari extends Car {
    protected Ferrari(String color) {
        super(305, color);
    }

    void drive() {
        System.out.println("I'm a Ferrari");
    }
}
