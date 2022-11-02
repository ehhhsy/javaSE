package Demo78reflect;

/**
 * @Author: hsy
 * @Date: 2022/10/20/18:42
 * @Description:获取class对象的方法
 */
public class Demo01 {
    /*
        获取class的三种方式
     */
    public static void main(String[] args) throws ClassNotFoundException {
//      第一种方式  class.forName("全类名")   静态方法
        Class<?> class_1 = Class.forName("Demo78reflect.Person");
        System.out.println(class_1); //class Demo78reflect.Person

//       第二种方式 类名.class：
        Class<Person> class_2 = Person.class;
        System.out.println(class_2);

//       对象.getClass( ):
        Person person = new Person("hsy", 20);
        Class<? extends Person> class_3 = person.getClass();
        System.out.println(class_3);

        System.out.println(class_1==class_2); //true  比较内存地址值  是同一个对象
        System.out.println(class_1==class_3); //true  比较内存地址值  是同一个对象

        Class<Student> class_4 = Student.class;
        System.out.println(class_1==class_4);  //false
    }
}
