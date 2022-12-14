package Demo55;
/*
  Runnable接口比继承Thread方法好
    创建多线程程序的第二种方式:实现Runnable接口
    java.lang.Runnable
        Runnable接口应该由打算通过某一线程执行其实例的类来实现,类必须定义一个成为run的无参数方法
    java.lang.Thread类的构造方法
        Thread(Runnable target) 分配新的Thread对象
        Thread(Runnable target,String name)分配新的Thread对象

    实现步骤:
        1.创建一个Runable接口的实现类
        2.在实现类中重写Runnable接口的run方法,设置线程任务
        3.创建一个Runnable接口的实现类对象
        4.创建Thread类对象,构造方法中传递Runnable接口的实现类对象
        5.Thread类中的start方法,开启新的线程执行run方法


        /*
        实现Runnable接口创建多线程程序的好处:
        1.避免了单继承的局限性
            一个类只能继承一个类,但是可以实现多个接口
        2.增强了程序的拓展性:降低了程序的耦合性(解耦)
            实现Runnable接口方式,把设置线程任务和开启进行了分离(解耦)
            实现类中从写了run方法,用来设置线程任务
            创建Thread类对象,调用start方法:用来开启新线程
 */
public class Demo05runnable {
    public static void main(String[] args) {
        // 3.创建一个Runnable接口的实现类对象
        RunnableImpl runnable = new RunnableImpl();


        // 4.创建Thread类对象,构造方法中传递Runnable接口的实现类对象
        Thread thread = new Thread(runnable);
//        Thread thread = new Thread(new RunnableImpl());


        //5.Thread类中的start方法,开启新的线程执行run方法
            thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
