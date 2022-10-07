package ClassesAndMethods.Task5;

public class Task5 {
    public static void main(String[] args) {

        numberOrder(1, 20);
    }

    public static void numberOrder(int a, int b) {
        System.out.println(a++);
        if (a <= b) numberOrder(a, b);
    }
}
