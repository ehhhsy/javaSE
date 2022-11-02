package Demo55.Test;

public class myThread extends Thread{       //1.继承Thread
    @Override
    public void run() {         //2.重写run方法
        for (int i = 0; i < 10; i++) {  //3.定义线程任务
            System.out.println(getName()+" "+i);
        }
    }
}

