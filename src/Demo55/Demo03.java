package Demo55;
/*
    线程的名称:
    主线程:main
    新线程:Thread-0,Thread-1,Thread-2
 */
public class Demo03 {
    public static void main(String[] args) {
        //创建子类对象
        MyThread_2 thread2 = new MyThread_2();
        thread2.start();//开启线程,执行run方法

//    new MyThread_2().start();


//    new MyThread_2().start();

        //方法2
//        Thread t = Thread.currentThread();
//        System.out.println(t);//Thread[main,5,main]
//        String s = t.getName();
//        System.out.println(s);//main


        //链式编程  获取当前线程的名称
        System.out.println(Thread.currentThread().getName());//main


    }
}
