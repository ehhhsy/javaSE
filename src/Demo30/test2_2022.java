package Demo30;

public class test2_2022 {
  String name;
  int age;

    @Override
    public String toString() {   //idea 官方重写的
        return "test2_2022{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        test2_2022 t = new test2_2022();
        t.name="李易峰时期";
        t.age=20;

//        System.out.println(t.toString());  //Demo30.test2_2022@140e19d  默认的
        System.out.println(t.toString());   //test2_2022{name='李易峰时期', age=20}
    }
}
