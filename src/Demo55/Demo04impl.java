package Demo55;

public class Demo04impl {
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        //�������ֵĵ�һ�ַ���
        demo04.setName("Сǿ");
        demo04.start();

        //�������߳�
        Demo04 demo04thread = new Demo04("��ͷ");
        String s = demo04thread.getName();
        System.out.println(s);
    }
}
