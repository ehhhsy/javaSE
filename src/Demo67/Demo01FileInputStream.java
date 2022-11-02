package Demo67;

import java.io.FileInputStream;
import java.io.IOException;

/**
    java.io.inputStream:�ֽ�������
    �˳������Ǳ�ʾ�ֽ���������������ĳ���

    ���Է�����               read��ȡ��,��'�Զ�'��һλ
     int read() ���������ж�ȡ���ݵ���һ���ֽ�
     int read(byte[]b) ���������ж�ȡһ���������ֽڣ�������洢�ڻ���������b��
     close��������
 **/
//java.lang.Object
//        �̳��� java.io.InputStream
//        �̳��� java.io.FileInputStream
//        ���췽��:
//            FileInputStream(File file)
//            FileInputStream(String name)
//            ��������ȡ�ļ�������Դ
//                    String name:�ļ���·��
//                    File file ���ļ�
//                ���췽�������ã�
//                    1.�ᴴ��һ��FileInputStream����
//                    2.���FileInputStream����ָ�����췽����Ҫ��ȡ���ļ�
//---------------------------------------------------------------------------------
//                ��ȡ���ݵ�ԭ����Ӳ��--���ڴ棩java����--��jvm--��os--��os��ȡ���ݵķ���--����ȡ�ļ�
//        ʹ�ò��裺
//                1.����һ��FileInputStream���󣬹��췽���а�Ҫ��ȡ������Դ
//                2.ʹ��FileInputStream�����read����
//                3.����
public class Demo01FileInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src\\Demo66\\a.txt"); //�ļ�����abc
        //int read() ��ȡ�ļ���һ���ֽ�,��ȡ���ļ�ĩβ����-1
//        int read = fis.read();
//        System.out.println(read); //97 a
//        System.out.println(fis.read()); //98 b
//        System.out.println(fis.read());//99 c

        /*
           �������϶�ȡ�ļ���һ���ظ��Ĺ���,���п���ʹ��ѭ���Ż�
           ��֪���ļ����ж����ֽ�,ʹ��whileѭ��
           whileѭ����������,��ȡ��-1����
           while
         */
        int len=0;
        while ((len=fis.read())!=-1){
            System.out.println(len);
        }
        fis.close();

    }
}
