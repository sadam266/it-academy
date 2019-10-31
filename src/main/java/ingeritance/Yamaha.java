package ingeritance;

public class Yamaha extends Motorbike {
    protected Yamaha(String color) {
        super(350, color);
    }

    void drive() {
        System.out.println("I'm Yamaha");
    }
}
