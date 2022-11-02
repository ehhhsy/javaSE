package Demo67;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * 字节输入流一次读取多个字节的方法: 要用到string缓冲区
 * int read(byte[] b)从输入流中读取一定数量的字节,并将其存储在缓冲区数组b中
 * 明确两件事:
 * 1.方法的参数byte[]的作用?
 * 起到缓冲作用,存储每次读取到的多个字节,数组的长度一度定位为1024(1k)或者1024的整数
 * 2.方法的返回值int是什么?
 * 每次读取的有效字节个数
 */
public class Demo02FileInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src\\Demo66\\b.txt");
        /**
         *使用FileInputStream对象中的方法read读取文件
         * int read(byte[]b)从输入流中读取一定数量的字节,并将其存储在缓冲区数组b中
         *
         */
//        byte[] bytes = new byte[2];
//        int read = fis.read(bytes);
//        System.out.println(read); //2
//        System.out.println(new String(bytes)); //AB
//        int read1 = fis.read(bytes);
//        System.out.println(read1); //2
//        System.out.println(new String(bytes)); //CD
//        int read2 = fis.read(bytes);
//        System.out.println(read2); //1
//        System.out.println(new String(bytes)); //ED
//        int read3 = fis.read(bytes);
//        System.out.println(read3); //-1
//        System.out.println(new String(bytes)); //ED
//        fis.close();
        /*
            发现以上读取可以使用while循环优化
         */
        int n = 0;     //记录每次读取的有效字节个数
        byte[] bytes = new byte[1024];//存储读取到的多个字节
        while ((n = fis.read(bytes)) != -1) {
//            System.out.println(new String(bytes));
//            使用第二个构造方法来转化
            System.out.println(new String(bytes,0,n));
        }
    }
}