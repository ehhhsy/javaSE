package Demo66;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
    重点：追加写/续写
 public FileOutputStream(String name, boolean append)创建一个向具有指定name的文件中写入数据的输出文件流
public FileOutputStream(File file, boolean append)   创建一个向指定File对象表示的文件中写入数据的文件输出流
    参数：
        String name ，File file写入数据的目的地
        boolean append：追加写开关
        true:创建对象不会覆盖元文件，继续在文件的末尾追加数据
        false：创建一个新文件，覆盖源文件

        重点：换行写
        windows:\r\n
        linux:/n
        mac:/r
 **/
public class Demo04 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src\\Demo66\\c.txt",true);
//        fileOutputStream.write("ggggggggg".getBytes());     //追加了
        for (int i = 0; i < 10; i++) {
            fileOutputStream.write("你好".getBytes());
            fileOutputStream.write("\r\n".getBytes());   //重点：换行写
        }
        fileOutputStream.close();


    }
}
