package Demo58;
/*
    买票案例出现了线程安全问题
    卖不出不存在的票和重复的票

    解决线程安全问题的第二种方案：使用同步方法
    使用步骤：
        1.把访问了共享数据的代码抽取出来，放到一个方法中
        2.把方法上添加synchronized修饰符

        格式：定义方法的格式
            修饰符 synchronized 返回值类型 方法名（参数列表）{
            可能出现线程安全问题的代码（访问了共享数据的代码）
            }
             */

public class Runnableimpl implements  Runnable{
    //定义一个多线程共享的票源
    private int ticket=100;

    //创建锁对象
    Object obj=new Object();

    //设置线程任务：买票
    @Override
    public void run() {
        //死循环   让买票重复执行
        while (true) {
        mai();  //卖票方法
        }
    }
        //定义一个同步方法  【重点】
//        同步方法也会把方法内部的代码锁住
//        只让一个线程执行，同步锁的锁对象就是this，谁调用就是谁
            public synchronized void mai(){
            if (ticket>0){
                //提高安全问题出现的概率。让程序睡眠    可以没有
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//      买票  ticket--
                System.out.println(Thread.currentThread().getName()+"正在卖"+ticket+"票");
                ticket--;
            }
        }
    }

