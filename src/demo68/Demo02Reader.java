package demo68;

import java.io.FileReader;
import java.io.IOException;

/*
        JAVA.io.Reader: 字符输入流最顶层的符类，抽象类，定义了一些共性的成员方法
        int read()  读取单个字符，并返回
        int read(char[] cbuf)  一次可以读取多个字符，将字符读入数组。
        void close() 关闭该流并释放与之关联的所有资源。


        java.io.FileReader 文件字符输入流
        作用：把硬盘文件中的数据以字符的方式读取到内存中

        构造方法：
        FileReader(String fileName)
          在给定从中读取数据的文件名的情况下创建一个新 FileReader。 filename:文件路径
        FileReader(File file)
          在给定从中读取数据的 File 的情况下创建一个新 FileReader。file：文件对象
         构造方法作用：
         1.创建一个FileReader对象
         2.会把FileReader对象指向要读取的文件

         使用步骤：
         1.创建FileReader对象，构造方法中绑定要读取的数据源
         2.使用FileReader对象中的方法read读取文件
         3.释放资源
 */
public class Demo02Reader {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("hello3.txt");
//        int tmp=0;
//        while ((tmp=reader.read())!=-1){
//            System.out.print((char) tmp); //完美读取 你好达娃大大?xxaaA@@@
//        }
//        reader.close();
        char [] CharArr=new char[1024]; //缓存
        int len=0;//每次读取的有效个数
        while((len=reader.read(CharArr))!=-1){
            //public String(char value[], int offset, int count) 使用构造方法，
            System.out.println(new String(CharArr,0,len));
        }
    }
}
