package demo68;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;
import java.util.Set;

/**
 * properties���ϵķ���load�����԰�Ӳ���еļ�ֵ���ļ�����������ʹ�ã�
 */
public class Demo06Load {
    public static void main(String[] args) throws IOException {
        //����properties����
        Properties pro = new Properties();
        Reader reader = new FileReader("D:\\tmp\\FileTest\\b.txt");
        //ʹ��properties���ϵķ���load����ȡ�����ֵ�Ե��ļ�
        pro.load(reader);
        Set<String> set = pro.stringPropertyNames();
        //����properties���� successful!!
        for (String key : set) {
            System.out.println(key+"---"+pro.getProperty(key));
        }
    }
}
