package ClassesAndMethods.Task1;

import java.util.Arrays;

public class Phone {
    private String model;
    private String number;
    private double weight;

    public Phone(String model, String number, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public double getWeight() {
        return weight;
    }

    public void showInfo() {
        System.out.println("Модель: " + model + " Номер: " + number + " Вес: " + weight);
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, long incomingNumber) {
        System.out.println("Звонит " + name + " " + incomingNumber);
    }

    public void sendMessage(String... vars) {
        System.out.println(Arrays.toString(vars));
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("IPhone", "89119999999", 0.254);
        Phone phone2 = new Phone("Samsung", "89569999999", 0.278);
        Phone phone3 = new Phone("Xiaomi", "89879999999", 0.212);
        phone1.showInfo();
        phone2.showInfo();
        phone3.showInfo();
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        phone1.receiveCall("ALex", 89112345678L);


    }
}
