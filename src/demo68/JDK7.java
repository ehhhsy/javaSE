package demo68;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * JDK7������
 * ��try�ĺ�߿�������һ���������������п��Զ�����������ô������������������try����Ч
 * try�еĴ���ִ����ϣ����Զ����������ͷţ�����дFinally
 * ��ʽ��
 * try(����������;����������){
 * 	    ���ܲ����쳣�Ĵ���
 *  }catch��������� ��������{
 * 	    �쳣�����߼�
 *  }
 */
public class JDK7 {
    public static void main(String[] args) {
        try(
                FileReader reader = new FileReader("D:\\tmp\\FileTest\\FileTest.txt");
                FileWriter writer = new FileWriter("D:\\tmp\\FileTest\\A.txt",true);
        ){
            int tmp;
            char [] charsArr=new char[1024];
            while((tmp=reader.read(charsArr))!=-1){
                writer.write(charsArr,0,tmp);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
