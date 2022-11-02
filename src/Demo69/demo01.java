package Demo69;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * BufferOutPutStream extends OutputStream
 * BufferOutPutStream:字节缓冲流
 * 子类继承父类，所以父类的方法都可以使用
 *  | public void close()                           | 关闭此输出流并释放与此流相关联的任何系统资源            |
 * | --------------------------------------------- | ------------------------------------------------------- |
 * | public void flush():                          | 刷新此输出流并强制任何缓冲的输出字节被写出              |
 * | public void write(byte [] b):                 | 将b.length字节从指定的字节数组写入此输出流              |
 * | public void write(byte [] b,int off,int len): | 从指定的字节数Q组写入len字节，从偏移量off开始输此输出流 |
 *
 * 构造方法：
   BufferedOutputStream(OutputStream out)       创建一个新的缓冲输出流，以将数据写入指定的底层输出流。
 * BufferedOutputStream(OutputStream out,  int size)  创建一个新的缓冲输出流，以将具有指定缓冲区大小的数据写入指定的底层输出流。
 * /
 */
public class demo01 {
    public static void main(String[] args) throws IOException {
        //创建一个FileOutputStream，构造方法中绑定数据源
        FileOutputStream fos = new FileOutputStream("D:\\tmp\\FileTest\\b.txt",true);
        //创建BufferedOutputStream，构造方法传递FileOutputStream，提高FileOutputStream的效率
        BufferedOutputStream bfos = new BufferedOutputStream(fos);
        //使用BufferedOutputStream.writer（）写入缓冲区中
        bfos.write("hello,worldwdddddddddladklawjdljjjjjwakjdlakdjlajdlajdl".getBytes(StandardCharsets.UTF_8));
        //使用BufferedOutputStream.flush（）,把内部缓冲区中的数据，刷新到文件中
        bfos.flush();
        bfos.close();
    }
}
