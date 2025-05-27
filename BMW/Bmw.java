package CarFactory.BMW;

import CarFactory.Car;

public class Bmw extends Car {
    public Bmw(String model, int maxSpeed, int horsePower, double acceleration,
                      int yearOfProduction, int length, int width, String color) {
        super("Bmw", model, maxSpeed, horsePower, acceleration,
                yearOfProduction, length, width, color, false, 0);
    }
}
