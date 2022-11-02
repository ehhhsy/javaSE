package Demo54;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
  java.lang.Throwable：类是java语言中所有错误或者异常的超类
        Exception：编译期异常（写代码的时候）出现的错误
            RuntimeException运行期异常，java程序运行过程中出现的问题
            异常就相当于程序得了个小毛病（感冒，发烧），把异常处理掉，程序就可以继续执行（吃药）

        Error：错误：
            就相当于程序得了一个【不治之症】，就必须修改源代码，程序才能继续执行
 */
public class Demo02throwable {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date=null;
        try {
            //RuntimeException运行期异常，java程序运行过程中出现的问题
            date=sdf.parse("1999-09-09");
        } catch (ParseException e) {
            e.printStackTrace();
        }


        //RuntimeException运行期异常，java程序运行过程中出现的问题
        int []array={1,2,3,4};//ArrayIndexOutOfBoundsException

        try {
            //放可能会出现异常的代码
             System.out.println(array[4]);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("后续代码");

//    =============================================================
/*
 Error：错误：
    OutOfMemoryError  数组太大了，超出了给jvm分配的内存
 */
//        int[]arr=new int[1024*1024*1024];
        //必须修改代码，创建的数组小一点

}
 }