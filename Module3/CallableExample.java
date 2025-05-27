package Projects;
import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) {
        // Create a fixed thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Define Callable tasks
        Callable<String> task1 = () -> {
            Thread.sleep(1000); // Simulate delay
            return "Task 1 completed!";
        };

        Callable<String> task2 = () -> {
            Thread.sleep(2000);
            return "Task 2 completed!";
        };

        Callable<String> task3 = () -> {
            Thread.sleep(1500);
            return "Task 3 completed!";
        };

        try {
            // Submit tasks and obtain Future objects
            Future<String> future1 = executor.submit(task1);
            Future<String> future2 = executor.submit(task2);
            Future<String> future3 = executor.submit(task3);

            // Retrieve results using Future.get()
            System.out.println(future1.get());
            System.out.println(future2.get());
            System.out.println(future3.get());

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown(); // Shutdown ExecutorService
        }
    }
}
