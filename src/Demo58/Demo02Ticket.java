package Demo58;

/*
    ģ����Ʊ����
        ����3���̣߳�ͬʱ�������Թ����Ʊ���г���
 */
public class Demo02Ticket {
    public static void main(String[] args) {
        //����Runnable�ӿڵ�ʵ����
        Runnableimpl r1 = new Runnableimpl();
        //����Thread����󣬹��췽���д���Runnable��ʵ����
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(r1);
        //����start�����������߳�
        t1.start();
        t2.start();
        t3.start();
    }
}
