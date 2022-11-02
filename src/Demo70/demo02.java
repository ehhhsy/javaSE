package Demo70;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*InputStreamReader*/
public class demo02 {
    public static void main(String[] args) throws IOException {
        //1. 创建一个InputStreamReader对象，构造方法中传递字节输入流和指定编码
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("UTF.txt"), "UTF-8");
        int tmp;
//        InputStreamReader.read（），读取文件
        while ((tmp=inputStreamReader.read())!=-1){
            System.out.println((char) tmp);
        }
        //释放资源
        inputStreamReader.close();
    }
}
