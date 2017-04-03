import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by shso1116 on 03-04-2017.
 */
public class SimpleThreadPool {

    public static void main(String args[]) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 100; i++) {

            Runnable worker = new WorkerThread("" + i);
            executorService.execute(worker);

        }

        executorService.shutdown();
        while (!executorService.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
}
