package Demo67;

import java.io.FileInputStream;
import java.io.IOException;

/**
    java.io.inputStream:字节输入流
    此抽象类是表示字节输入流的所有类的超类

    共性方法：               read读取完,会'自动'移一位
     int read() 从输入流中读取数据的下一个字节
     int read(byte[]b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中
     close（）关流
 **/
//java.lang.Object
//        继承者 java.io.InputStream
//        继承者 java.io.FileInputStream
//        构造方法:
//            FileInputStream(File file)
//            FileInputStream(String name)
//            参数：读取文件的数据源
//                    String name:文件的路径
//                    File file ：文件
//                构造方法的作用：
//                    1.会创建一个FileInputStream对象
//                    2.会把FileInputStream对象指定构造方法中要读取的文件
//---------------------------------------------------------------------------------
//                读取数据的原理：（硬盘--》内存）java程序--》jvm--》os--》os读取数据的方法--》读取文件
//        使用步骤：
//                1.创建一个FileInputStream对象，构造方法中绑定要读取的数据源
//                2.使用FileInputStream对象的read方法
//                3.关流
public class Demo01FileInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src\\Demo66\\a.txt"); //文件内容abc
        //int read() 读取文件中一个字节,读取到文件末尾返回-1
//        int read = fis.read();
//        System.out.println(read); //97 a
//        System.out.println(fis.read()); //98 b
//        System.out.println(fis.read());//99 c

        /*
           发现以上读取文件是一个重复的过程,所有可以使用循环优化
           不知道文件中有多少字节,使用while循环
           while循环结束条件,读取到-1结束
           while
         */
        int len=0;
        while ((len=fis.read())!=-1){
            System.out.println(len);
        }
        fis.close();

    }
}
