package Demo74;

/**
 * 	ʹ�ú���ʽ�ӿ���Ϊ����
 */
public class Demo04 {
    public static void main(String[] args) {
        //ʹ�������ڲ���
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"---> ������");
            }
        });

        //ʹ��lambda���ʽ,runû�в���
        startThread(()-> System.out.println(Thread.currentThread().getName()+"---> ������"));
    }

    private static void startThread(Runnable runnable) {
        new Thread(runnable).start();

    }
}
