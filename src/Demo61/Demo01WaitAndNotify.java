package Demo61;
/*
    等待唤醒案例：线程之间的通信      简单版
        创建一个顾客线程（消费者）：告知老板要的包子种类和数量，调用wait方法，放弃cpu的执行，进入到waitting状态（无限等待）
        创建一个老板线程，花了5秒做包子，做好包子之后，调用notify方法，唤醒顾客吃包子

        注意：
            顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒只能有一个执行
            同步使用的锁对象必须保证唯一
            只有锁对象才能调用wait和notify方法

      object类中的方法
        void wait()
            在其他线程调用此对象的notify（）方法或者notifyAll（）方法前，导致当前线程等待
        void notify（）
               唤醒在此对象监视器上等待的单个线程
               会继续执行wait方法之后的代码
 */
public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object o = new Object();

        //匿名内部类 顾客
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    synchronized (o) {
                        System.out.println("告知老板要的包子种类和数量");
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子做好了");
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while(true) {
                    //花了5秒做包子
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (o) {
                        System.out.println("老板5秒之后做好包子，告知顾客");
                        o.notify();
                    }
                }
                      }
        }.start();
    }
}
