package Demo30;

public class test2_2022 {
  String name;
  int age;

    @Override
    public String toString() {   //idea �ٷ���д��
        return "test2_2022{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        test2_2022 t = new test2_2022();
        t.name="���׷�ʱ��";
        t.age=20;

//        System.out.println(t.toString());  //Demo30.test2_2022@140e19d  Ĭ�ϵ�
        System.out.println(t.toString());   //test2_2022{name='���׷�ʱ��', age=20}
    }
}
