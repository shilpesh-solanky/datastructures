package design.patterns;

/**
 * Created by shso1116 on 09-02-2017.
 */

public class Singleton {
    private static Singleton instance = null;
    private Singleton(){

    }
    public static Singleton getInstance(){

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (instance==null){
            instance=new Singleton();
        }

        return instance;
    }

}

