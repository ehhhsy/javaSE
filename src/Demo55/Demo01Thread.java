package Demo55;
/*
    ���̣߳�ִ�У�main���������߳�

    ���̳߳���java������ֻ��һ���߳�
    ִ��main������ʼ�������ϵ�������ִ�С�

 */
        //���̳߳���
public class Demo01Thread {
    public static void main(String[] args) {
        Person p1 = new Person("��һ");
        p1.yun();

        System.out.println(0/0);//�������쳣��Ӧ���ö��̣߳������Ͳ���Ӱ����������ִ��
        Person p2 = new Person("С��");   //���ϵ���
        p2.yun();
    }
}
