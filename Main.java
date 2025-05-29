package CarFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory cf = new CarFactory();
        Car Mark2 = cf.getToyotaMark2();
        Mark2.startTheCar();
        Mark2.flashTheHeadlights();
        Mark2.getInfo();
        Car sportMark2 = new SportMode(Mark2);
        sportMark2.startTheCar();
        ((SportMode)sportMark2).activate();
        }
    }
