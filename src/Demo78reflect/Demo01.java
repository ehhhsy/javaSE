package Demo78reflect;

/**
 * @Author: hsy
 * @Date: 2022/10/20/18:42
 * @Description:��ȡclass����ķ���
 */
public class Demo01 {
    /*
        ��ȡclass�����ַ�ʽ
     */
    public static void main(String[] args) throws ClassNotFoundException {
//      ��һ�ַ�ʽ  class.forName("ȫ����")   ��̬����
        Class<?> class_1 = Class.forName("Demo78reflect.Person");
        System.out.println(class_1); //class Demo78reflect.Person

//       �ڶ��ַ�ʽ ����.class��
        Class<Person> class_2 = Person.class;
        System.out.println(class_2);

//       ����.getClass( ):
        Person person = new Person("hsy", 20);
        Class<? extends Person> class_3 = person.getClass();
        System.out.println(class_3);

        System.out.println(class_1==class_2); //true  �Ƚ��ڴ��ֵַ  ��ͬһ������
        System.out.println(class_1==class_3); //true  �Ƚ��ڴ��ֵַ  ��ͬһ������

        Class<Student> class_4 = Student.class;
        System.out.println(class_1==class_4);  //false
    }
}
