package Demo70;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * ## OutStreamWriter类
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        //创建一个OutStreamWriter对象，构造方法传递字节输出流（OutputStream ）和指定的编码表名称
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("ggggg2.txt"), "GBK");
//        使用OutStreamWriter.writer（）把字符转化为字节存储缓冲区中（编码）
        outputStreamWriter.write("你好");
//        使用OutStreamWriter.flush（），把内存缓冲区中的字节刷新到文件中(使用字节流写字节的过程)
        outputStreamWriter.flush();
        //释放资源
        outputStreamWriter.close();
    }
}
