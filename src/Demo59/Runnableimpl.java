package Demo59;
/*

    买票案例出现了线程安全问题
    卖不出不存在的票和重复的票

    解决线程安全问题的第三种方案：使用lock锁  [重点]
    java.util.concurrent.locks.lock接口
    lock实现提供了比使用synchronized方法和语句可获得的更广泛的锁定操作

    lock接口中的方法:
        void lock() 获取锁
        void unlock() 释放锁

    java.util.concurrent.locks.`ReentranLock` implement Lock接口


        使用步骤:
            1.在成员位置创建一个ReentranLock对象
            2.在可能会出现安全问题的代码前调用lock接口中的方法lock获取锁
            3.在可能会出现安全问题的代码后调用lock接口中的方法unlock获取锁
             */

import java.util.concurrent.locks.ReentrantLock;

public class Runnableimpl implements  Runnable{
    //
    ReentrantLock r=new ReentrantLock();

    //定义一个多线程共享的票源
    private int ticket=100;

    //设置线程任务：买票
    @Override
    public void run() {
        //死循环   让买票重复执行
        while (true) {
          //卖票方法


        //2.在可能会出现安全问题的代码前调用lock接口中的方法lock获取锁
            r.lock();
            if (ticket>0){
                //提高安全问题出现的概率。让程序睡眠    可以没有
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName()+"正在卖"+ticket+"票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    ///3.在可能会出现安全问题的代码后调用lock接口中的方法unlock获取锁
                    r.unlock(); //无论程序是否出现异常,都会把锁释放掉
                }


            }
    }
    }

 }