package Demo66;
//lambda ���ʽ��ϰ
public class lambda {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"���̴߳�����");
        }).start();
    }
}
