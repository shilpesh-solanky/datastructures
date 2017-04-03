import java.util.concurrent.*;

/**
 * Created by shso1116 on 03-04-2017.
 */
public class WorkerPool {

    public static void main(String args[]) throws InterruptedException {

        RejectedExecutionHandlerImpl rejectionHandler = new RejectedExecutionHandlerImpl();

        ThreadFactory threadFactory = Executors.defaultThreadFactory();

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2),
            threadFactory, rejectionHandler);

        MyMonitorThread monitor = new MyMonitorThread(threadPoolExecutor, 3);
        Thread monitorThread = new Thread(monitor);
        monitorThread.start();
        //submit work to the thread pool
        for (int i = 0; i < 10; i++) {
            threadPoolExecutor.execute(new WorkerThread("cmd" + i));
        }

        Thread.sleep(30000);
        //shut down the pool
        threadPoolExecutor.shutdown();
        //shut down the monitor thread
        Thread.sleep(5000);
        monitor.shutdown();


    }
}
