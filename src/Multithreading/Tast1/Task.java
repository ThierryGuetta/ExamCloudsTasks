package Multithreading.Tast1;

public class Task {
    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        newThread.start();
    }
}
class NewThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("H");
        }
    }
}
