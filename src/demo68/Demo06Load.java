package demo68;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;
import java.util.Set;

/**
 * properties集合的方法load，可以把硬盘中的键值对文件读到集合中使用，
 */
public class Demo06Load {
    public static void main(String[] args) throws IOException {
        //创建properties集合
        Properties pro = new Properties();
        Reader reader = new FileReader("D:\\tmp\\FileTest\\b.txt");
        //使用properties集合的方法load，读取保存键值对的文件
        pro.load(reader);
        Set<String> set = pro.stringPropertyNames();
        //遍历properties集合 successful!!
        for (String key : set) {
            System.out.println(key+"---"+pro.getProperty(key));
        }
    }
}
