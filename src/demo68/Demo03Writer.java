package demo68;

import java.io.FileWriter;
import java.io.IOException;

/*
    java.io.Writer:�ַ���������������ַ�����������ĸ��࣬��һ��������
    ���Գ�Ա������
          void write(char[] cbuf)  д���ַ����顣
           void write(int c)  д�뵥���ַ���
           void write(char[] cbuf, int off, int len)  д���ַ������ĳһ���֡�
            void write(String str)  д���ַ�����
            void write(String str, int off, int len)  д���ַ�����ĳһ���֡�
            void flush() ˢ�¸����Ļ��塣
            void close() �رմ�������Ҫ��ˢ������
 */
public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("6663.txt");
        char [] cs={'A','d','e'};
        fileWriter.write(cs);       //д���ַ�����

        fileWriter.write(124); //�뵥���ַ���  124--> |
        fileWriter.write("helloworld"); //д���ַ�����
        fileWriter.write("666�����ǲ���",0,5); //(String str, int off, int len)  д���ַ�����ĳһ���֡�
        fileWriter.close();
    }
}
