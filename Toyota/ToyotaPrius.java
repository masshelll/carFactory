package CarFactory.Toyota;

import CarFactory.ElectricCar;

public class ToyotaPrius extends Toyota implements ElectricCar {
    public ToyotaPrius(){
        super("Prius", 180, 152, 7,
                2024, 4600, 1780, "White");
    }
    @Override
    public void chargeBattery() {
        System.out.println("Батарея заряжается");
    }
}
