package CarFactory.Dodge;

import CarFactory.Car;

public class Dodge extends Car {
    public Dodge(String model, int maxSpeed, int horsePower, double acceleration,
                      int yearOfProduction, int length, int width, String color) {
        super(" Dodge", model, maxSpeed, horsePower, acceleration,
                yearOfProduction, length, width, color, false, 0);
    }
}
