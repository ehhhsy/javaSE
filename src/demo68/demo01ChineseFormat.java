package demo68;

import java.io.FileInputStream;
import java.io.IOException;

/*
    ʹ���ֽ�����ȡ�����ļ�
      һ�����ģ�
        GBK:ռ�������ֽ�
        UTF-8:ռ�������ֽ�
* */
public class demo01ChineseFormat {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("hello3.txt");//���
        byte [] bytes=new byte[1024];
        int len;  //��ȡ��Ч����
        while((len=fis.read())!=-1){
            System.out.println(len);

        }
        fis.close();
    }
}
