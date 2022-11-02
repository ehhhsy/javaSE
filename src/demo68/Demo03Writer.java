package demo68;

import java.io.FileWriter;
import java.io.IOException;

/*
    java.io.Writer:字符输出流，是所有字符输出流的最顶层的父类，是一个抽象类
    共性成员方法：
          void write(char[] cbuf)  写入字符数组。
           void write(int c)  写入单个字符。
           void write(char[] cbuf, int off, int len)  写入字符数组的某一部分。
            void write(String str)  写入字符串。
            void write(String str, int off, int len)  写入字符串的某一部分。
            void flush() 刷新该流的缓冲。
            void close() 关闭此流，但要先刷新它。
 */
public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("6663.txt");
        char [] cs={'A','d','e'};
        fileWriter.write(cs);       //写入字符数组

        fileWriter.write(124); //入单个字符。  124--> |
        fileWriter.write("helloworld"); //写入字符串。
        fileWriter.write("666黑马传智播客",0,5); //(String str, int off, int len)  写入字符串的某一部分。
        fileWriter.close();
    }
}
