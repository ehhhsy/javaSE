package demo68;

import java.io.FileInputStream;
import java.io.IOException;

/*
    使用字节流读取中文文件
      一个中文：
        GBK:占用两个字节
        UTF-8:占用三个字节
* */
public class demo01ChineseFormat {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("hello3.txt");//你好
        byte [] bytes=new byte[1024];
        int len;  //读取有效长度
        while((len=fis.read())!=-1){
            System.out.println(len);

        }
        fis.close();
    }
}
