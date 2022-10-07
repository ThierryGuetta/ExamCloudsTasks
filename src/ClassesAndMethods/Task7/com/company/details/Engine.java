package ClassesAndMethods.Task7.com.company.details;

public class Engine {

    private String factory;
    private int power;

    public Engine(String factory, int power) {
        this.factory = factory;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{ " +
                "Производитель = " + factory + '\'' +
                ", Мощность = " + power +
                " лс}";
    }
}
