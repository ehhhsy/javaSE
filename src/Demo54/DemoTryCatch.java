package Demo54;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
try..catch:异常处理的第二种方式，自己处理异常
   格式：
   try{
        可能产生异常的代码
   }catch（定义一个异常变量，用来接收try种抛出的异常对象）{
     异常的处理逻辑，异常对象之后，怎么处理这个异常
     一般在工作中，会把异常的信息记录到一个日志种
   }
   。。。
   catch（异常类名 变量名）{
   }
   注意：
    1.try种可能会抛出多个异常对象，那么就可以使用多个catch来处理这些异常对象
    2.如果try产生了异常，那么就会执行catch种的异常处理，处理完毕catch，继续执行try。。catch之后的代码【重点】
    3.如果try种没有产生异常，那么就不会执行catch种异常，执行完try，就继续执行后面的代码【重点】

    hsy：这个案例是：方法的异常抛给对象的调用者（main），然后try抛给catch，catch抛给异常
         如果main用throws抛出，后续代码就不会执行
 */
public class DemoTryCatch {
    public static void main(String[] args) {
       try {
           demo01("aaa");
       }catch (IOException e){//try种抛出什么异常，就定义什么异常
//           System.out.println("catch--文件的后缀名不对");
//        Throwable类中定义了3个异常处理的方法
//                String getMessage() 返回throwable的简短描述
//                 String toString() 返回此throwable的详细信息字符串
//                 void printStackTrace()jvm打印异常对象，默认此方法.异常信息跟全面 【重点】
           e.getMessage();
       }
        System.out.println("后续代码");
    }



    private static void demo01(String fileName) throws IOException {
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("路径没有问题，读取文件");
}
}