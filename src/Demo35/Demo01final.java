package Demo35;

import Demo28.Student;

/*
final关键字代表最终的，不可改变的。

常见四种用法：
1.可以用来修饰一个类
2.可以用来修饰一个方法
3.可以用来修饰一个局部变量（就是在方法的大括号内，出去就没有了，方法的参数也是局部变量）
4.可以用来修饰一个成员变量
 */
public class Demo01final {
    public static void main(String[] args) {
        int num=10;
        System.out.println(num); //10
        num=20;
        System.out.println(num); //20
 
//        一旦final修饰局部变量，就不能修改
        final int num2=100;
        System.out.println(num2);  //100
//        num2=20; 报错，不能修改

        final int num3; //正确写法，这还没赋值呢
          num3=200;
        System.out.println(num3); //200

        System.out.println("===============");
        //对于基本类型来说，不可变说的就是变量当中的数据不可改变
        //对于引用类型来说，不可变说的是变量当中的地址值不可改变
        Students stu =new Students("李哥");
        System.out.println(stu);  //地址值不一样
        System.out.println(stu.getName()); //李哥

        stu =new Students("王哥");
        System.out.println(stu);  //地址值不一样
        System.out.println(stu.getName()); //王哥

        System.out.println("====================");
        final Students hht =new Students("黄慧婷");
        System.out.println(hht.getName());

        //错误写法！final的引用类型变量，其中的地址值不可改变
//        hht=new Students();

        //地址值不可改变,但是内容可以改变
          hht.setName("黄慧婷123");
        System.out.println(hht.getName());
     }

}
