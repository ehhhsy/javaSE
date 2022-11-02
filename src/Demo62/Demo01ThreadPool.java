package Demo62;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    线程池：jdk1.5之后提供的
    java。until。concurrent。Executor；线程池的工厂类，用来生产线程池
    Executor类中的静态方法：
        static ExecutorService newFixedThreadPool(int nThreads)创建一个可重用固定线程数的线程池
        参数：
            int nThreads：创建线程池中包含的线程数量
        返回值：
        ExecutorService接口，返回的是ExecutorService接口的实现类对象，我们可以使用ExecutorService接口接收

    java.util.concurrent.ExecutorService:线程池接口
    用来从线程池中获取线程，调用start方法，执行线程任务
     submit(Runnable task)提交一个 Runnable 任务用于执行，并返回一个表示该任务的 Future。

    关闭/销毁线程池的方法
     void shutdown()

     线程池的使用步骤：
    1.使用线程池的工厂类Executors里面提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
    2.创建一个类，实现Runnable接口，重写run方法，设置线程任务
    3，调用ExecutorService中的方法submit，传递线程任务（实现类），开启线程执行run方法
    4.调用ExecutorService中的方法shutdown（不建议执行）
 */
public class Demo01ThreadPool {
    public static void main(String[] args) {
        //    1.使用线程池的工厂类Executors里面提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
        ExecutorService es = Executors.newFixedThreadPool(2); //2代表创建两个线程

//        3，调用ExecutorService中的方法submit，传递线程任务（实现类），开启线程执行run方法
        es.submit(new Runnableimpl()); //pool-1-thread-1创建了一个新的线程
        es.submit(new Runnableimpl()); //pool-1-thread-2创建了一个新的线程
        es.submit(new Runnableimpl()); //pool-1-thread-2创建了一个新的线程

        /*
        总结：
            创建了两个线程，但是有三个任务
            线程池会一直开启，使用完了线程，就自动把线程归还给线程池，线程就还可以继续使用

         */

    }

}
