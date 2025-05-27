package CarFactory.Mitsubishi;

import CarFactory.Car;

public class Mitsubishi extends Car {
    public Mitsubishi(String model, int maxSpeed, int horsePower, double acceleration,
                  int yearOfProduction, int length, int width, String color) {
        super("Mitsubishi", model, maxSpeed, horsePower, acceleration,
                yearOfProduction, length, width, color, false, 0);
    }
}
