package Demo55.Test;

import java.util.concurrent.locks.ReentrantLock;

public class ticketTest{
    private static int tickNum=100;

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while(true){
                        lock.lock();
                    if(tickNum > 0){
                    try {
                        Thread.sleep(10);
                        tickNum -= 1;
                        System.out.println(Thread.currentThread().getName() +"����ȥ��һ�ţ�����"+ tickNum);
                    } catch (InterruptedException e) {
                            e.printStackTrace();
                    }finally {
                        lock.unlock();
                    }
                    }




                }
            }
        };

        Thread t1 = new Thread(runnable, "��Ʊ��1");
        Thread t2 = new Thread(runnable, "��Ʊ��2");
        Thread t3 = new Thread(runnable, "��Ʊ��3");

        t1.start();
        t2.start();
        t3.start();
    }
}
