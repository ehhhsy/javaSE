package Demo54;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
throw关键字：异常处理的第一种方式：
作用：
    当方法内部抛出异常对象的时候，那么我们必须处理这个异常
    可以使用throws关键字处理异常对象，会把异常对象声明抛出给 方法的调用者（自己不处理，给别人处理），最终交给jvm--》中断处理
使用格式：在方法声明时使用:
    修饰符  返回值类型  方法名（参数列表） throws AAAException,BBBException{
        throw new AAAException（”异常产生的原因“）
        throw new BBBException（”异常产生的原因“）
    }
    注意：
        1.throws关键字必须写在方法声明处
        1.throws关键字后边声明的异常必须是Exception或者是Exception的子类
        3.方法内部，如果报错抛出了多个异常对象，那么throws后边也必须声明多个异常
            如果抛出的多个异常对象有 子父类关系，那么直接声明父类异常对象即可
        4.调用一个声明抛出异常的方法，我们就必须处理 声明的异常
            要么继续使用throws声明抛出，交给方法的使用者处理，最终交给jvm--中断处理
            要么try。。catch自己处理异常
 */
public class Demo05Throws {
    public static void main(String[] args) throws IOException {
        demo01("c：//a.txt");
    }
    /*
    定义一个方法：对传递的文件路径进行合法性判断
    如果路径不是”c：//a.txt“,那么我们就抛出文件找不到异常对象，告知方法的调用者

     注意：FileNotFoundException是编译异常，抛出了编译异常就必须处理这个异常
            要么throws这个异常，要么try。。catch

     注意：
        FileNotFoundException extends IOException extends Exception
     这里有两个异常，FileNotFoundException，IOException只用声明一个
           如果抛出的多个异常对象有 子父类关系，那么直接声明父类异常对象即可
     */
    private static void demo01(String fileName) throws IOException {
    if (!fileName.equals("c：//a.txt")) {
        throw new FileNotFoundException("传递的路径不是c：//a.txt");
    }
    //如果传递的路径，不是。txt结尾
//        那么我们就抛出IO异常对象，告知方法的调用者，文件的后缀名不对
    if(!fileName.endsWith(".txt")){
    throw new IOException("文件的后缀名不对");
    }
        System.out.println("路径没有问题，读取文件");

    }
    }

