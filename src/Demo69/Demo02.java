package Demo69;

import java.io.*;

/**
 *
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        //创建一个FileInputStream，构造方法中绑定数据源
        FileInputStream fis = new FileInputStream("D:\\tmp\\FileTest\\c.txt");
        //创建BufferedInputStream，构造方法中传递FileInputStream，提高读取效率
        BufferedInputStream bfis = new BufferedInputStream(fis);
        //使用BufferedInputStream.read（）,读取文件
        int tmp;
        while ((tmp=bfis.read())!=-1){
            System.out.println((char)tmp);
        }
        //释放资源
        bfis.close();
    }
}
