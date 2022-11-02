package Demo56;

import Demo55.MyThread;

/*
    匿名内部类实现方法实现进程的创建

    匿名：没有名字
    内部类：写在其他类内部的类

    匿名内部类作用：简化代码
        把子类继承父类，从写父类的方法，创建子类对象合一步完成
        把实现类实现接口，从写接口的方法，创建实现类对象合一步完成
    匿名内部类的最终产物：子类/实现类对象，而这个类没有名字

    格式：
        new 父类/接口（）{
        重复父类/接口中的方法
        }；
 */
public class Demo01 {
    public static void main(String[] args) {
        //线程的父类是Thread
        //new MyThead（）。start（）；

        new Thread() {
            //重写run方法，设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"白妈");
                }
            }

        }.start();
//============================================================================
        //线程的接口Runnable
        //Runnable r =new Runnable
        Runnable r = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(i + "aaa");
                    System.out.println(Thread.currentThread().getName() + "黑");
                }
            }
        };

        new Thread(r).start();


    //简化代码
        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(i + "aaa");
                    System.out.println(Thread.currentThread().getName() + "黑");
                }
            }
        }).start();
    }
}

