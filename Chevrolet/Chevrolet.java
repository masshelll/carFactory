package CarFactory.Chevrolet;

import CarFactory.Car;

public class Chevrolet extends Car {
    public Chevrolet(String model, int maxSpeed, int horsePower, double acceleration,
                      int yearOfProduction, int length, int width, String color) {
        super("Chevrolet", model, maxSpeed, horsePower, acceleration,
                yearOfProduction, length, width, color, false, 0);
    }
}
