package Demo55;
/*
    创建多线程程序的第一种方式：创建Thread类的子类
    java.lang.Thread类：是描述线程的类，我们想要实现多线程程序，就必须继承Thread类

    实现步骤：
        1.创建一个Thread类的子类（extends Thread）
        2.在Thread类的子类种重写Thread类种的run方法，设置线程任务（开启线程要做什么？）
        3.创建Thread类的子类对象
        4.调用Thread类种的方法，start方法，开启新的线程，执行run方法

        结果是两个线程并发地运行；当前线程（main 方法）和另一个线程（创建的新线程，执行其run方法）。
        多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。

      java属于抢占式调度，哪个线程的优先级高，哪个线程就优先执行，优先级一样，【随机选一个执行】

 */
public class Demo02Thread {
    public static void main(String[] args) {

        // 3.创建Thread类的子类对象，这是自定义的线程
        MyThread myThread = new MyThread();
        // 4.调用Thread类种的方法，start方法，开启新的线程，执行run方法
        myThread.start();

        //这是main主线程
        for (int s = 0; s < 20; s++) {
            System.out.println("main"+s);//main0,run0,main1,run1
        }
        System.out.println(Thread.currentThread().getName());
    }
}
