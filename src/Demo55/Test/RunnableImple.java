package Demo55.Test;

public class RunnableImple implements Runnable{  //1.����һ��Runable�ӿڵ�ʵ����
    @Override
    public void run() {     //2.��ʵ��������дRunnable�ӿڵ�run����,�����߳�����
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
    }
}
