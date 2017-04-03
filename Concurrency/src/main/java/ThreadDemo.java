/**
 * Created by shso1116 on 24-03-2017.
 */

public class ThreadDemo {

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                int count = 0;
                while (!Thread.interrupted()) {
                    System.out.println(name + " is : " + count++);
                }
            }
        };
        Thread thdA = new Thread(r);
        Thread thdB = new Thread(r);
        thdA.start();
        thdB.start();
        int i = 0;
        while (i < 50) {
            double n = Math.random();
            if (n >= 0.49999999 && n <= 0.50000001) {
                break;
            }
            i++;
        }
        thdA.interrupt();
        thdB.interrupt();
    }

}