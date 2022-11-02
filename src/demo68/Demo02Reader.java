package demo68;

import java.io.FileReader;
import java.io.IOException;

/*
        JAVA.io.Reader: �ַ����������ķ��࣬�����࣬������һЩ���Եĳ�Ա����
        int read()  ��ȡ�����ַ���������
        int read(char[] cbuf)  һ�ο��Զ�ȡ����ַ������ַ��������顣
        void close() �رո������ͷ���֮������������Դ��


        java.io.FileReader �ļ��ַ�������
        ���ã���Ӳ���ļ��е��������ַ��ķ�ʽ��ȡ���ڴ���

        ���췽����
        FileReader(String fileName)
          �ڸ������ж�ȡ���ݵ��ļ���������´���һ���� FileReader�� filename:�ļ�·��
        FileReader(File file)
          �ڸ������ж�ȡ���ݵ� File ������´���һ���� FileReader��file���ļ�����
         ���췽�����ã�
         1.����һ��FileReader����
         2.���FileReader����ָ��Ҫ��ȡ���ļ�

         ʹ�ò��裺
         1.����FileReader���󣬹��췽���а�Ҫ��ȡ������Դ
         2.ʹ��FileReader�����еķ���read��ȡ�ļ�
         3.�ͷ���Դ
 */
public class Demo02Reader {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("hello3.txt");
//        int tmp=0;
//        while ((tmp=reader.read())!=-1){
//            System.out.print((char) tmp); //������ȡ ��ô��޴��?xxaaA@@@
//        }
//        reader.close();
        char [] CharArr=new char[1024]; //����
        int len=0;//ÿ�ζ�ȡ����Ч����
        while((len=reader.read(CharArr))!=-1){
            //public String(char value[], int offset, int count) ʹ�ù��췽����
            System.out.println(new String(CharArr,0,len));
        }
    }
}
