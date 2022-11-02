package Demo69;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/*
    BufferedWriter
 */
public class demo04 {
    public static void main(String[] args) throws IOException {
        //创建字符缓存输出流对象（BufferedWriter ），构造方法传递字符输出流（FileWriter）
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\tmp\\output\\bw.txt"));
        for (int i = 0; i < 20; i++) {
            //使用BufferedWriter.wirte(),把数据写到内存缓冲区中
            bw.write("恭喜发财");
            bw.newLine();
        }
            //调用flush（），把内存缓冲区中的数据，刷新到文件中
            bw.flush();
            bw.close();
    }
}
