package Demo55.Test;

public class MyThread_2022 extends Thread{
    @Override
    public void run() {
        String name = getName();
        System.out.println(name);
        Thread thread = MyThread_2022.currentThread();
        System.out.println("this is currentThread"+thread);
    }
}
