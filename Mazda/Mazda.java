package CarFactory.Mazda;

import CarFactory.Car;

public class Mazda extends Car {
    public Mazda(String model, int maxSpeed, int horsePower, double acceleration,
                      int yearOfProduction, int length, int width, String color) {
        super("Mazda", model, maxSpeed, horsePower, acceleration,
                yearOfProduction, length, width, color, false, 0);
    }
}
