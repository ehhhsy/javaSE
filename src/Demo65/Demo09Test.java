package Demo65;

import java.io.File;

/*
    ��ϰ��
        �ݹ��ӡ�༶Ŀ¼
     ����
        ����c��\\abc�ļ��У���abc�ļ��е����ļ���

/*
        ˼·
        ���ҵ�һ����·����Ȼ��listFiles���file�ļ���
        Ȼ�����file���ϣ��ж�������ļ��У����ڵݹ飨show����������������·��
 */


public class Demo09Test {
    public static void main(String[] args) {
        File f = new File("c:\\abc\\");
        show02(f);
    }
    /*
    ����һ����������������File���͵�Ŀ¼
    �����ж�Ŀ¼���б���
     */
//    private static void show(File dir) {
//        System.out.println(dir); //��ӡ������������
//
//        File[] f = dir.listFiles();
//        for (File b:f
//             ) {
//            if (b.isDirectory()){   //��bĿ¼�����жϣ��ж��Ƿ�Ϊ�ļ���
//                show(b);
//            }else{                  //�������������
//                System.out.println(b);
//            }
//        }
//    }
        public static void show02(File dir){
//            System.out.println(dir);
//
//            File[] f1 = dir.listFiles();        //2020.9.20
//            for (File f:f1
//                 ) {
//                if (f.isDirectory()){
//                    show02(f);
//                }else{
//                    System.out.println(f);
//                }
//            }
            System.out.println(dir);
            File[] files = dir.listFiles();
            for (File s:files
                 ) {
                if (s.isDirectory()){
                    show02(s);
                }else{
                    System.out.println(s);
                }
            }
        }



}
