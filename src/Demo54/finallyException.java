package Demo54;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
     格式：
   try{
        可能产生异常的代码
   }catch（定义一个异常变量，用来接收try种抛出的异常对象）{
     异常的处理逻辑，异常对象之后，怎么处理这个异常
     一般在工作中，会把异常的信息记录到一个日志种
   }
   。。。
   catch（异常类名 变量名）{
   }finally{
    无论是否出现异常都会执行
   }
   注意：
    1.finally不能单独使用，必须和try一起使用
    2.finally一般用于资源释放（资源回收），无论程序是否出现异常，最后都要资源释放（IO）
 */
public class finallyException {
    public static void main(String[] args) {
        try {
            demo01("11.AA");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //无论是否出现异常都会执行
            System.out.println("资源回收");
        }
    }


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
