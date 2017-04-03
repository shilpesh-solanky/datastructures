import java.util.concurrent.Semaphore;

/**
 * Created by shso1116 on 03-04-2017.
 */
public class SemaphoreExample {

    Semaphore binary = new Semaphore(1);

    public static void main(String args[]) {

        final SemaphoreExample test = new SemaphoreExample();

        new Thread() {
            @Override
            public void run() {
                test.mutualExclusion();
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                test.mutualExclusion();
            }
        }.start();
    }

    private void mutualExclusion() {
        try {
            binary.acquire();
            System.out.println(Thread.currentThread().getName() + " inside mutual exclusive region");
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        } finally {
            binary.release();
            System.out.println(Thread.currentThread().getName() + " outside of mutual exclusive region");
        }

    }
}
