package Demo43;

import java.util.Random;

//toString方法
//类 Object
// 是类层次结构的根类。每个类都使用 Object 作为超(父)类。所有对象（包括数组）都实现这个类的方法。
public class Demo01ToString {
    public static void main(String[] args) {
       /*
        person类默认继承object类，所以可以使用object类当中的toString

        */
        Person person = new Person("张三",20);
        String s = person.toString();
        System.out.println(s);


        //直接打印对象的名字，就是调用对象的toString方法


//      看一个类是否重写了toSring方法，直接打印这个类对应对象的名字即可
        //如果没有重写，那么打印的就是对象的地址值（默认）
//        hsy:就是你没重写前，System.out.println(s);是地址值
//        从写之后 System.out.println(s); 就按照重写的方式打印
        System.out.println("==============");
        Random random = new Random();//没有重写toString方法
        System.out.println(random);

        System.out.println("==============");

        System.out.println(person.toString());
    }
}
