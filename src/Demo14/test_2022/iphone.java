package Demo14.test_2022;

public class iphone extends phone{
    @Override
    public void call() {
        super.call();
        System.out.println("hei��ϣ��");
    }

    @Override
    public void lock() {
        super.lock();
        System.out.println("�����������ػ�");
    }

    @Override
    public void show() {
        super.lock();
        System.out.println("�鶯��");

    }
}
