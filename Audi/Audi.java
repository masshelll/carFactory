package CarFactory.Audi;

import CarFactory.Car;

public class Audi extends Car {
    public Audi(String model, int maxSpeed, int horsePower, double acceleration,
                      int yearOfProduction, int length, int width, String color) {
        super("Audi", model, maxSpeed, horsePower, acceleration,
                yearOfProduction, length, width, color, false, 0);
    }
}
