package Multithreading.Task2;

public class Task2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new myThread());
        thread.start();
    }
}
class myThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 10 == 0) System.out.println(i);
        }
    }
}
