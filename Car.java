package CarFactory;



public class Car extends CarFactory {
    private String brand;
    private String model;
    private int maxSpeed;
    private int horsePower;
    private double acceleration;
    private int yearOfProduction;
    private int length;
    private int width;
    private String color;
    private boolean isStarted;
    private int transmission;

    public Car(String brand, String model, int maxSpeed, int horsePower, double acceleration, int yearOfProduction, int length, int width, String color, boolean isStarted, int transmission) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.horsePower = horsePower;
        this.acceleration = acceleration;
        this.yearOfProduction = yearOfProduction;
        this.length = length;
        this.width = width;
        this.color = color;
        this.isStarted = false;
        this.transmission = 0;
    }
    public Car() {}


//    public static void main(String[] args) {
//
//        Car ford = new Car(13, 115, 50000000, 47, "red");
//    }

    public void startTheCar() {
        if (!isStarted){
            isStarted = true;
            System.out.println(getModel() + " заведена");
        }else{
            System.out.println(getModel() + " уже заведена");
        }
    }

    public void revUp() {
        if (isStarted && transmission > 0) {
            System.out.println(getModel() + " втопил тапочку");
        }else{
            System.out.println("сначала заведите и вкючите передачу");
        }
    }

    public void slowDown() {
        if (isStarted && transmission > 0) {
            System.out.println(getModel() + " тормозит");
        }else{
            System.out.println(getModel() + " не заведена");
        }
    }

    public void changeGear() {
        if (isStarted){
            transmission += 1;
            System.out.println("переключена передача");
        }else{
            System.out.println(getModel() + " не заведена");
        }
    }

    public void flashTheHeadlights() {
        if (isStarted) {
            System.out.println(getModel() + " мигает фарами");
        }
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public int getHorsePower() { return horsePower; }
    public double getAcceleration() { return acceleration; }
    public int getYearOfProduction() {
        return yearOfProduction;
    }
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public String getColor() {
        return color;
    }
    public boolean getIsStarted() {
        return isStarted;
    }
    public int getTransmission() {
        return transmission;
    }

    public void getInfo() {
        System.out.println("=== Характеристики автомобиля ===\n" +
                "Марка: " + getBrand() + "\n" +
                "Модель: " + getModel()+ "\n" +
                "Макс. скорость: " + getMaxSpeed() + " км/ч\n" +
                "Мощность: " + getHorsePower() + " л.с.\n" +
                "Разгон: " + getAcceleration() + " c \n" +
                "Размеры: " + getLength() + " x " + getWidth() + " м\n" +
                "Год выпуска: " + getYearOfProduction() + "\n" +
                "Цвет: " + getColor());
    }
}