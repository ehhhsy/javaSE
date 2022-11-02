package Demo55;
/*
      获取线程的名称：
        1.使用thread类中的方法getName（）
            Sting getName()返回该线程的名称
        2.可以获取到当前正在执行的线程，使用线程中的方法getName（）
            static Thread currentThread（）返回对当前正在执行的线程对象的应用
 */

//定义一个Thread类的子类
public class MyThread_2 extends Thread {
    //重写run方法，[设置线程任务]
    @Override
    public void run() {
        String name = getName();
        System.out.println(name);
    }
}
