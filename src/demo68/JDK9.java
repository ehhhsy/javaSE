package demo68;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * jdk9������ (����JDK7)   ����1.8�汾������������
 * try��ǰ�߿��Զ�����������try��ߵģ����п���ֱ����������������ƣ���������
 * ��try����ִ�����֮��������Ҳ�����ͷŵ�������дfinally
 * ��ʽ��
 *          A a = new A();
 *          B b= new B();
 * try(a,b){
 * 	        ���ܻ�����쳣�Ĵ���
 *      }catch��������� ��������{
 * 	    �쳣�����߼�
 *      }
 */
public class JDK9 {
    public static void main(String[] args) throws IOException {
//        FileReader reader = new FileReader("D:\\tmp\\FileTest\\FileTest.txt");
//        FileWriter writer = new FileWriter("D:\\tmp\\FileTest\\A.txt",true);
//        try(reader,writer){
//            char[] chars =new char[1024];
//            int tmp;
//            while((tmp=reader.read(chars)!=-1)){
//                writer.write(chars,0,tmp);
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }//�Զ�����
    }
}
