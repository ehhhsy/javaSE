package Demo69;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
BufferedReader
 */
public class demo05 {
    public static void main(String[] args) throws IOException {
        //�����ַ���������������BufferedReader�������췽�������ַ���������FileReader��
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\tmp\\output\\bw.txt"));
        String tmp;
        while ((tmp=bufferedReader.readLine())!=null){
           //ʹ��BufferedReader�еķ���read/readline����ȡ�ı�    ==readline����ĩβ������null==
        System.out.println(tmp);
       }
       //�ͷ���Դ
        bufferedReader.close();
    }
}
