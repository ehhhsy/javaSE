package Demo69;

import java.io.*;

/**
 *
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        //����һ��FileInputStream�����췽���а�����Դ
        FileInputStream fis = new FileInputStream("D:\\tmp\\FileTest\\c.txt");
        //����BufferedInputStream�����췽���д���FileInputStream����߶�ȡЧ��
        BufferedInputStream bfis = new BufferedInputStream(fis);
        //ʹ��BufferedInputStream.read����,��ȡ�ļ�
        int tmp;
        while ((tmp=bfis.read())!=-1){
            System.out.println((char)tmp);
        }
        //�ͷ���Դ
        bfis.close();
    }
}
