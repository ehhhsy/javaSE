package Demo65;

import java.io.File;

/*
    ��ϰ��
        �ļ�������ֻҪ.java��β���ļ�
     ����
        ����c��\\abc�ļ��У���abc�ļ��е����ļ���
        ֻҪ.java��β���ļ�
 */
public class Demo010Test {
    public static void main(String[] args) {
        File f = new File("c:\\abc\\");
        show02(f);
    }

    private static void show02(File f) {                //2020.9.20
//        System.out.println(f);

//        File[] fff = f.listFiles();
//        for (File f12:fff
//             ) {
//            if (f12.isDirectory()){
//                show02(f12);
//            }else{
//                if (f12.getName().toLowerCase().endsWith(".java")){
//                    System.out.println(f12);
//                }
//            }
//        }
        File[] files = f.listFiles();           //2020.11.22
//        System.out.println(f);
        for (File s:files
             ) {
            if (s.isDirectory()){
                show02(s);
            }else{
                if (s.getName().toLowerCase().endsWith(".java")){
                    System.out.println(s);
                }
            }
        }

    }
    /*
    ����һ����������������File���͵�Ŀ¼
    �����ж�Ŀ¼���б���
     */
//    private static void show(File dir) {
//        System.out.println(dir); //��ӡ������������

//        File[] f = dir.listFiles();
//        for (File b:f
//             ) {
//            if (b.isDirectory()){   //��bĿ¼�����жϣ��ж��Ƿ�Ϊ�ļ���
//                show(b);
//            }else{                  //�������������
                /*
                    f��һ���ļ���ֱ�Ӵ�ӡ����
                    ֻҪ.java��β���ļ�
                    1.��File����F��ת��Ϊ�ַ�������
                 */
//                String name = b.getName();
                //2.����String���еķ���endsWith�ж��ַ����Ƿ���java��β
//                boolean bool = name.endsWith(".java");

                //3.�������.java��β���ļ��������
//                if (bool){
//                    System.out.println(b);
//                }
//                if (b.getName().toLowerCase().endsWith(".java")){
                    //��ȡ����      ��Сд        ��β׺
//                    System.out.println(b);
//                }
//            }
//        }
//    }
}
