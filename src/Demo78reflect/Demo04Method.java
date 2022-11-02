package Demo78reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Author: hsy
 * @Date: 2022/10/20/21:10
 * @Description:
 */
public class Demo04Method {
    public static void main(String[] args) throws Exception {
        //1.需要一个class对象
        Class<Person> class_1 = Person.class;
        String name1 = class_1.getName();
        System.out.println(name1);  //Demo78reflect.Person

        /*
            获取所有的成员方法
         */
        Method[] methods = class_1.getMethods();

        for (Method method : methods) {
            System.out.println(method);   //所有public的方法都输出出来了hashCode()，eat().getAge()....
        }

        System.out.println("========================");

        Method Method_eat = class_1.getMethod("eat", String.class);  //参数有一个String的方法eat
        Method Method_sleep = class_1.getMethod("sleep");            //没有参数的方法sleep

        //执行方法
        Person person = new Person();
        Method_eat.invoke(person,"哈密瓜");  //eat.....哈密瓜
        Method_sleep.invoke(person);              //sleep.....

        String name = Method_eat.getName();
        System.out.println("该方法的名字是"+name);  //该方法的名字是eat

    }
}
