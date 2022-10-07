package ClassesAndMethods.Task7.com.company.vehicles;

import ClassesAndMethods.Task7.com.company.details.Engine;
import ClassesAndMethods.Task7.com.company.professions.Driver;

public class Car {
    private String mark, carClass;
    int weight;
    private Driver driver;
    private Engine engine;

    public Car(String mark, String carClass, int weight, Driver driver, Engine engine) {
        this.mark = mark;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("�������");
    }

    public void stop() {
        System.out.println("���������������");
    }

    public void turnRight() {
        System.out.println("������������ �������");
    }

    public void turnLeft() {
        System.out.println("������������ ������");
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark = " + mark + '\'' +
                ", carClass = " + carClass + '\'' +
                ", weight = " + weight + '\'' +
                ", driver = " + driver +
                ", engine = " + engine +
                '}';
    }

    public static void main(String[] args) {
        Driver bmwDriver = new Driver("������ �.�.", 50);
        Engine bmwEngine = new Engine("Italy", 480);
        Car car = new Car("BMW", "C", 5000, bmwDriver, bmwEngine);

        Driver lorryDriver = new Driver("������ �.�.", 45);
        Engine lorryEngine = new Engine("America", 700);
        Lorry lorry = new Lorry("��������", "D", 8000, lorryDriver, lorryEngine, 70);

        Driver sportDriver = new Driver("������� �.�.", 30);
        Engine sportEngine = new Engine("Italy", 900);
        SportCar sportCar = new SportCar("SportCar", "C", 4000, sportDriver, sportEngine, 300);

        System.out.println(car);
        System.out.println(lorry);
        System.out.println(sportCar);


        lorry.start();
        sportCar.stop();
    }
}
