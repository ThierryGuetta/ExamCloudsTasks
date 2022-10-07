package ClassesAndMethods.Task7.com.company.professions;

public class Driver {

    private String name;
    private int exp;

    public Driver(String name, int exp) {
        this.name = name;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Driver{ " +
                "Имя = " + name + '\'' +
                ", Опыт = " + exp +
                " лет} ";
    }
}
