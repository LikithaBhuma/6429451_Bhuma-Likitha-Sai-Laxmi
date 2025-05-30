package Projects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class VirtualThreadsExample {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 100000; i++) {
                executor.submit(() -> System.out.println("Hello from virtual thread: " + Thread.currentThread().getName()));
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Execution Time (Virtual Threads): " + (endTime - startTime) / 1_000_000 + " ms");
    }
}
