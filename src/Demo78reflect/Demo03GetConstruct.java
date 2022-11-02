package Demo78reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: hsy
 * @Date: 2022/10/20/20:49
 * @Description:
 */
public class Demo03GetConstruct {
    public static void main(String[] args) throws Exception {
        //1.需要一个class对象
        Class<Person> class_1 = Person.class;


        //获取构造方法,获取两个参数的构造方法
        System.out.println("===========获取两个参数的构造方法=======");
        Constructor<Person> constructor_1 = class_1.getConstructor(String.class, int.class);
        //public Demo78reflect.Person(java.lang.String,int)
        System.out.println(constructor_1);
        Person person = constructor_1.newInstance("hsy", 23);
        System.out.println(person);  //hsy


        System.out.println("===========使用空参数创建对象========");
        Constructor<Person> constructor_2 = class_1.getConstructor();
        Person person_2 = constructor_2.newInstance();
        System.out.println(person_2);

        Person person_3 = class_1.newInstance();
        System.out.println(person_3);
    }
}
