package Demo55.Test;

public class myThread extends Thread{       //1.�̳�Thread
    @Override
    public void run() {         //2.��дrun����
        for (int i = 0; i < 10; i++) {  //3.�����߳�����
            System.out.println(getName()+" "+i);
        }
    }
}

