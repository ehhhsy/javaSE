package Demo58;

/*
    模拟买票案例
        创建3个线程，同时开启，对共享的票进行出售
 */
public class Demo02Ticket {
    public static void main(String[] args) {
        //创建Runnable接口的实现类
        Runnableimpl r1 = new Runnableimpl();
        //创建Thread类对象，构造方法中传递Runnable的实现类
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(r1);
        //调用start方法开启多线程
        t1.start();
        t2.start();
        t3.start();
    }
}
