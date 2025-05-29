package CarFactory;

import CarFactory.Car;

public abstract class DrivingMode extends Car {
    protected Car decoratedCar;
    public DrivingMode(Car car) {
        super(car.getBrand(), car.getModel(), car.getMaxSpeed(), car.getHorsePower(), car.getAcceleration(),
                car.getYearOfProduction(), car.getLength(), car.getWidth(), car.getColor(), car.getIsStarted(), car.getTransmission());
        this.decoratedCar = car;
    }
    public abstract void activate();

}

