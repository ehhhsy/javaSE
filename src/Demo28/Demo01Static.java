package Demo28;

/*
static ���������Ե����
 ���һ����Ա����ʹ����static�ؼ��֣���ô��������������ڶ����Լ���
 �����������ڵ��࣬���������

 hsy����static����room����ֻ������one��room��û�ж���two.room��
  ����two�������Ҳ���������֤࣬�� �������������ڵ��࣬���������
 */
public class Demo01Static {
    public static void main(String[] args) {
        Student one = new Student("����",19);
        one.room="����3��";
        System.out.println("���� "+one.getName()
                +" ���� "+one.getAge()+" ������ "+one.room+" ѧ�� "+one.getId());

        Student two = new Student("����",18);
        System.out.println("���� "+two.getName()
                +" ���� "+two.getAge()+" ������ "+two.room+" ѧ�� "+two.getId());


    }
}
