package ingeritance;

public class Ducati extends Motorbike {
    protected Ducati(String color) {
        super(315, color);
    }

    void drive() {
        System.out.println("I'm a Ducati");
    }
}
