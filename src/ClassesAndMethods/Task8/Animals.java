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
        System.out.print(" спит");
    }

    @Override
    public String toString() {
        return "Animals{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
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
        System.out.println(noise);
    }

    @Override
    public void eat() {
        System.out.print(name);
        super.eat();
        System.out.println(food);
    }

    @Override
    public void sleep() {
        System.out.println(name);
        super.sleep();
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
        System.out.println(noise);
    }

    @Override
    public void eat() {
        System.out.print(name);
        super.eat();
        System.out.print(food);
    }

    @Override
    public void sleep() {
        System.out.print(name);
        super.sleep();
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
        System.out.println(noise);
    }

    @Override
    public void eat() {
        System.out.print(name);
        super.eat();
        System.out.println(food);
    }

    @Override
    public void sleep() {
        System.out.println(name);
        super.sleep();
    }
}

class Vet {
    public static void treatAnimal(Animals animals) {
        System.out.println(animals);
    }

    public static void main(String[] args) {
        Animals cat = new Cat("корм", "на улице");
        cat.eat();
        System.out.println();
        cat.sleep();
        System.out.println();
        treatAnimal(cat);
    }
}
