package Demo55.Test;

public class test_2022 {
    public static void main(String[] args) {

        myRunnable runnable = new myRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}
