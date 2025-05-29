package CarFactory;

public class SportMode extends DrivingMode{
    public SportMode(Car car) {
        super(car);
    }

    @Override
    public void activate() {
        System.out.println("Спортивный режим активирован");
    }
}
