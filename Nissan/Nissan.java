package CarFactory.Nissan;

import CarFactory.Car;

public class Nissan extends Car {
    public Nissan(String model, int maxSpeed, int horsePower, double acceleration,
                  int yearOfProduction, int length, int width, String color) {
        super("Nissan", model, maxSpeed, horsePower, acceleration,
                yearOfProduction, length, width, color, false, 0);
    }
}
