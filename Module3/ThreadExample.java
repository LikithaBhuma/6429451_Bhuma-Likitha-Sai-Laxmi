package Projects;
class MyThread extends Thread {
    private String message;

    public MyThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + message);
            try {
                Thread.sleep(500); // Simulate delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Hello from Thread 1!");
        MyThread thread2 = new MyThread("Hello from Thread 2!");

        thread1.start();
        thread2.start();
    }
}