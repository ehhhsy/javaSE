package demo68;

import java.io.FileWriter;
import java.io.IOException;

/**
 try catch finally ����IO�����쳣
 ��ʽ��
    try{
         //���ܻ�����쳣�Ĵ���
 }catch����{
    �쳣�Ĵ����߼�
 }finally{
    һ����ָ���Ĵ���
    ��Դ�ͷ�
 }

 */
public class trycatch {
    public static void main(String[] args) {
        //�����涨��
        FileWriter fileWrite=null;
        try {
            //���ܻ�����쳣�Ĵ���
            FileWriter fileWriter = new FileWriter("w:\\777.txt", true);
            for (int i = 0; i < 10; i++) {
                //�쳣�Ĵ����߼�
                fileWriter.write("hello С"+i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            // һ����ָ���Ĵ���
            //��������ʧ���ˣ�filewriter��Ĭ��ֵΪnull��null�ǲ��ܵ���close�����ģ����Ի�����NullPointerException
//            ��Ҫ����һ���жϣ�����null�Ͱ���Դ�ͷ�
            if(fileWrite!=null){
                try {
                    //close�����������쳣������Ҫtry catch / throw
                    fileWrite.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
