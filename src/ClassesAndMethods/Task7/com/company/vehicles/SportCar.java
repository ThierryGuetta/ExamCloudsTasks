package ClassesAndMethods.Task7.com.company.vehicles;

import ClassesAndMethods.Task7.com.company.details.Engine;
import ClassesAndMethods.Task7.com.company.professions.Driver;

public class SportCar extends Car {

    private int maxSpeed;

    public SportCar(String mark, String carClass, int weight, Driver driver, Engine engine, int maxSpeed) {
        super(mark, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{ " +
                "Макс скорость = " + maxSpeed +
                '}' + super.toString();
    }
}
