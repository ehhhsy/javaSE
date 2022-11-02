package Demo69;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
BufferedReader
 */
public class demo05 {
    public static void main(String[] args) throws IOException {
        //创建字符缓存输入流对象（BufferedReader），构造方法传递字符输入流（FileReader）
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\tmp\\output\\bw.txt"));
        String tmp;
        while ((tmp=bufferedReader.readLine())!=null){
           //使用BufferedReader中的方法read/readline，读取文本    ==readline读到末尾，返回null==
        System.out.println(tmp);
       }
       //释放资源
        bufferedReader.close();
    }
}
