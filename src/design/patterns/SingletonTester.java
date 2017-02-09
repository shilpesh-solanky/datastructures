package design.patterns;

/**
 * Created by shso1116 on 09-02-2017.
 */
public class SingletonTester extends Thread {

    public void run(){
        System.out.println(Singleton.getInstance());
    }

    public static void main(String[] args){

        int i=0;

        while(i<10){
            SingletonTester t1=new SingletonTester();
            t1.start();
            System.out.println(t1.getName());
            i++;
        }


    }
}
