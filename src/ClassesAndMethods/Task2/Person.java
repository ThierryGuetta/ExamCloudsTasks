package ClassesAndMethods.Task2;

public class Person {
    private String fullName;
    private int age;

    public void move() {
        System.out.println(fullName + " идет");
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }

    public Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;

    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Alex", 30);
    }
}
