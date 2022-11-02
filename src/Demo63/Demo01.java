package Demo63;
/*
    使用实现Runnable接口的方式实现多线程程序
 */
public class Demo01 {

    public static void main(String[] args) {
        //小回顾：使用Runnable实现线程，要new实现类，
        //然后再new Thread（实现类对象）。start
        RunnableImpl runnable = new RunnableImpl();
        new Thread(runnable).start();



        //简化代码 匿名内部类
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "多线程任务==");
            }
        };
        new Thread(r).start();


        //继续简化
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "多线程任务==");
            }
        }).start();
    }
}
