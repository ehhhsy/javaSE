package Demo61;
/*
    进入到了TimeWaiting（计时等待）有两种方式
    1.使用sleep（long m）方法，在毫秒值结束之后，线程睡醒进入到Runnable（可执行）/blocked（阻塞）
    2.使用wait（long m）方法，wait如果在毫秒值结束之后，还没有被notify唤醒，就会自动醒来，线程睡醒进入到Runnable（可执行）/blocked（阻塞）
 */
public class Demo02waitAndNotify {
    public static void main(String[] args) {
        Object o = new Object();
//匿名内部类 顾客
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    synchronized (o) {
                        System.out.println("告知老板要的包子种类和数量");
                        try {
                            o.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子做好了");
                    }
                }
            }
        }.start();
    }
}
