package Demo67;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//�ļ�����
/*
        ��ȷ��
            ����Դ��
            ����Ŀ�ĵ�
        �ļ����ƵĲ���
            1.����һ���ֽ����������󣬹��췽���а�Ҫ��ȡ������Դ
            2.����һ���ֽ���������󣬹��췽���а�Ŀ�ĵ�
            3.ʹ���ֽ�����������read()������ȡ�ļ�
            4.ʹ���ֽ�������е�write(),�Ѷ�ȡ�����ļ�д��Ŀ�ĵص��ļ���
            5.�ͷ���Դ
 */
public class demo03FileCopy {
    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();

        FileOutputStream fos = new FileOutputStream("D:\\2.png");
        FileInputStream fis = new FileInputStream("C:\\Users\\hsy\\Pictures\\Screenshots\\��Ļ��ͼ(2).png");
        byte [] bytes =new byte[10240];
        int len;
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();

        long s=System.currentTimeMillis();
        System.out.println("���ķ� "+(s-l)+"����ֵ");
    }
}
