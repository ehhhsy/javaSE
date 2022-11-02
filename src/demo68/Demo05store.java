package demo68;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

/**
 * 使用properties中的store方法
 */
public class Demo05store {
    public static void main(String[] args) throws IOException {
        //创建properties集合添加对象，添加数据
        Properties pro = new Properties();
        //创建字符输出流对象，构造方法绑定输出源
        Writer writer = new FileWriter("D:\\tmp\\FileTest\\b.txt");
        //准备数据
        pro.setProperty("吴亦凡","5000");
        pro.setProperty("王力宏","6000");
        pro.setProperty("李易峰","7000");
//        使用properties集合中的方法store，把集合中的临时数据，持久化硬盘中
        pro.store(writer,"");
        //关流
        writer.close();

        FileOutputStream fos = new FileOutputStream("D:\\tmp\\FileTest\\c.txt");
        pro.store(fos,"UTF-8");
        fos.close();
    }
}
