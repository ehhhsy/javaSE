package Demo67;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//文件复制
/*
        明确：
            数据源：
            数据目的地
        文件复制的步骤
            1.创建一个字节输入流对象，构造方法中绑定要读取的数据源
            2.创建一个字节输出流对象，构造方法中绑定目的地
            3.使用字节输入流对象read()方法读取文件
            4.使用字节输出流中的write(),把读取到的文件写入目的地的文件中
            5.释放资源
 */
public class demo03FileCopy {
    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();

        FileOutputStream fos = new FileOutputStream("D:\\2.png");
        FileInputStream fis = new FileInputStream("C:\\Users\\hsy\\Pictures\\Screenshots\\屏幕截图(2).png");
        byte [] bytes =new byte[10240];
        int len;
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();

        long s=System.currentTimeMillis();
        System.out.println("共耗费 "+(s-l)+"毫秒值");
    }
}
