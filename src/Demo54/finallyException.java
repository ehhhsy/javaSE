package Demo54;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
     ��ʽ��
   try{
        ���ܲ����쳣�Ĵ���
   }catch������һ���쳣��������������try���׳����쳣����{
     �쳣�Ĵ����߼����쳣����֮����ô��������쳣
     һ���ڹ����У�����쳣����Ϣ��¼��һ����־��
   }
   ������
   catch���쳣���� ��������{
   }finally{
    �����Ƿ�����쳣����ִ��
   }
   ע�⣺
    1.finally���ܵ���ʹ�ã������tryһ��ʹ��
    2.finallyһ��������Դ�ͷţ���Դ���գ������۳����Ƿ�����쳣�����Ҫ��Դ�ͷţ�IO��
 */
public class finallyException {
    public static void main(String[] args) {
        try {
            demo01("11.AA");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //�����Ƿ�����쳣����ִ��
            System.out.println("��Դ����");
        }
    }


    private static void demo01(String fileName) throws IOException {
        if (!fileName.equals("c��//a.txt")) {
            throw new FileNotFoundException("���ݵ�·������c��//a.txt");
        }
        //������ݵ�·�������ǡ�txt��β
//        ��ô���Ǿ��׳�IO�쳣���󣬸�֪�����ĵ����ߣ��ļ��ĺ�׺������
        if(!fileName.endsWith(".txt")){
            throw new IOException("�ļ��ĺ�׺������");
        }
        System.out.println("·��û�����⣬��ȡ�ļ�");
}
}
