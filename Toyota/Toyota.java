package CarFactory.Toyota;

import CarFactory.Car;

public class Toyota extends Car {
    public Toyota(String model, int maxSpeed, int horsePower, double acceleration,
                  int yearOfProduction, int length, int width, String color) {
        super("Toyota", model, maxSpeed, horsePower, acceleration,
                yearOfProduction, length, width, color, false, 0);
    }
}
