package ClassesAndMethods.Task7.com.company.vehicles;

import ClassesAndMethods.Task7.com.company.details.Engine;
import ClassesAndMethods.Task7.com.company.professions.Driver;

public class Lorry extends Car {

    private int capacity;

    public Lorry(String mark, String carClass, int weight, Driver driver, Engine engine, int capacity) {
        super(mark, carClass, weight, driver, engine);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Lorry{ " +
                "Грузоподъемность = " + capacity +
                " кг " + super.toString();
    }
}
