package Demo28;
/*
��̬�������ڴ�ͼ       ��ͼ
 */
public class Demo03 {

    public static void main(String[] args) {
        //��������һ�½��ң����Ǿ�̬�Ķ�����Ӧ��ͨ�������Ƶ���
        Student.room="���101����";

        Student one =new Student("�����",15);
        System.out.println(one.getName());
        System.out.println(one.getAge());
        System.out.println(Student.room);
        /* ��̬����������������������ơ���̬�������� */


        System.out.println("====================");

        Student two =new Student("����ү",50);
        System.out.println(two.getName());
        System.out.println(two.getAge());
        System.out.println(Student.room);
        /* ��̬����������������������ơ���̬�������� */
    }
}
