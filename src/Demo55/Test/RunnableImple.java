package Demo55.Test;

public class RunnableImple implements Runnable{  //1.创建一个Runable接口的实现类
    @Override
    public void run() {     //2.在实现类中重写Runnable接口的run方法,设置线程任务
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
    }
}
