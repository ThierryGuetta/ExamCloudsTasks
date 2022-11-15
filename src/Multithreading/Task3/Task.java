package Multithreading.Task3;

public class Task {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("a");

        myThread myThread1 = new myThread(sb);
        myThread myThread2 = new myThread(sb);
        myThread myThread3 = new myThread(sb);

        myThread1.start();
        myThread2.start();
        myThread3.start();

    }
}

class myThread extends Thread {
    private StringBuilder sb;

    myThread(StringBuilder sb) {
        this.sb = sb;
    }

    public void run() {
        synchronized (sb) {
            for (int i = 0; i < 100; i++) {
                System.out.println(sb);
            }
            char aChar = sb.charAt(0);
            sb.setCharAt(0, ++aChar);
        }
    }
}