package ClassesAndMethods.Task8;

public class Animals {
    String food, location;

    public Animals(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.print(" издает ");
    }

    public void eat() {
        System.out.print(" ест ");
    }

    public void sleep() {
        System.out.print(" спит" + "\n");
    }

    @Override
    public String toString() {
        return "food='" + food + '\'' +
                ", location='" + location + '\'' + "\n";
    }
}

class Dog extends Animals {
    private final String name = "—обака";
    private final String noise = "√ав-гав";

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.print(name);
        super.makeNoise();
        System.out.println(noise + "\n");
    }

    @Override
    public void eat() {
        System.out.print(name);
        super.eat();
        System.out.print(food + "\n");
    }

    @Override
    public void sleep() {
        System.out.print(name);
        super.sleep();
    }

    @Override
    public String toString() {
        return "Dog food='" + food + '\'' +
                ", location='" + location + '\'' + "\n";
    }
}

class Cat extends Animals {
    private final String name = " ошка";
    private final String noise = "ћ€у-м€у";

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.print(name);
        super.makeNoise();
        System.out.println(noise + "\n");
    }

    @Override
    public void eat() {
        System.out.print(name);
        super.eat();
        System.out.print(food + "\n");
    }

    @Override
    public void sleep() {
        System.out.print(name);
        super.sleep();
    }

    @Override
    public String toString() {
        return "Cat food='" + food + '\'' +
                ", location='" + location + '\'' + "\n";
    }
}

class Horse extends Animals {
    private final String name = "Ћошадь";
    private final String noise = "»-го-го";

    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.print(name);
        super.makeNoise();
        System.out.println(noise + "\n");
    }

    @Override
    public void eat() {
        System.out.print(name);
        super.eat();
        System.out.print(food + "\n");
    }

    @Override
    public void sleep() {
        System.out.print(name);
        super.sleep();
    }

    @Override
    public String toString() {
        return "Horse food='" + food + '\'' +
                ", location='" + location + '\'' + "\n";
    }
}

class Vet {
    public static void treatAnimal(Animals animals) {
        System.out.println(animals);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("корм", "на улице");
        cat.eat();
        cat.sleep();
        treatAnimal(cat);

        Dog dog = new Dog("м€со", "дома");
        dog.eat();
        dog.sleep();
        treatAnimal(dog);

        Horse horse = new Horse("€блоки", "на ферме");
        horse.eat();
        horse.sleep();
        treatAnimal(horse);
    }
}
