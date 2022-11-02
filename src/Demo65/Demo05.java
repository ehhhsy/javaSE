package Demo65;

import java.io.File;
import java.io.IOException;

/*
   File�ഴ��ɾ�����ܵķ���
        public boolean createNewFile() ���ҽ��������Ƶ��ļ��в�����ʱ������һ���µĿ��ļ������ļ�����
        public boolean delete() ɾ���ɴ�File��ʾ���ļ�/Ŀ¼
        public boolean mkdir()  �����д�File��ʾ��Ŀ¼   ��ֻ�ܴ����������ļ��С�
        public boolean mkdirs()  �����д�File��ʾ��Ŀ¼�������κα��뵫�����ڵĸ�Ŀ¼ �����ɵ�����Ҳ���Դ����༶���ļ��С�
 */
public class Demo05 {
    public static void main(String[] args) throws IOException {
        show01();
        System.out.println("===================");
        show02();
        System.out.println("===================");
        show03();
    }
    //    ==========================================================================
    private static void show03() {
/*        public boolean delete() ɾ���ɴ�File��ʾ���ļ�/Ŀ¼
           ע�⣺�˷�������ɾ�����췽��·���ָ������ļ�/�ļ���
           ����ֵ��boolean   true���ļ�/�ļ��� ɾ���ɹ�
           false���ļ����������ݣ�����ɾ������false�����췽����·�������ڣ�����false
          ע�⣺
                delete������ֱ��ɾ���ļ�/�ļ��У����߻���վ��ɾ��Ҫ����
* */
        File f1 = new File("D:\\java-workspace\\AA\\src\\File\\");
        System.out.println(f1.delete()); //true ɾ��Ŀ¼�ɹ�

        File f4 = new File("D:\\java-workspace\\AA\\src\\Demo65\\a.txt");
        System.out.println("f4:"+f4.delete()); //true  ɾ���ļ��ɹ�

        File f5 = new File("D:\\java-workspace\\HSY");
        boolean b5 = f5.delete();
        System.out.println("f5:"+b5);
    }
    //    ==========================================================================
    private static void show02() {
/*      public boolean mkdir()  �����д�File��ʾ��Ŀ¼
    public boolean mkdirs()  �����д�File��ʾ��Ŀ¼�������κα��뵫�����ڵĸ�Ŀ¼
    ���ļ��е�·���������ڹ��췽���ָ��������췽���Ĳ�����
//         ����ֵ��boolean  true���ļ��в����ڣ������ļ���  false���ļ��д��ڣ����ᴴ��������false
         ע�⣺
//            1.�˷���ֻ�ܴ����ļ��У����ᴴ���ļ�
   */
        File f1 = new File("D:\\java-workspace\\AA\\src\\File\\");
        System.out.println(f1.mkdir());     //������File�ļ��� mkdir  ��������

        File f2 = new File("D:\\java-workspace\\AA\\src\\Filemkdir\\FileMkdirs");
        System.out.println(f2.mkdirs()); //������Filemkdir--��FileMkdirs ���༶��

         File f3 = new File("111\\FileMkdirs");
        System.out.println("f3 :"+f2.mkdirs()); //·��������,���ᴴ���������׳��쳣

        File f4 = new File("D:\\java-workspace\\hht");              //2020.9.20
        boolean mkdir = f4.mkdir();
        System.out.println("f4 :"+mkdir);

        File f5 = new File("D:\\java-workspace\\hhhhh\\hhh\\tt"); //2020.9.20
        boolean b = f5.mkdirs();
        System.out.println("f5 :"+b);
        System.out.println("===============2020.11.22 mkdir");
        File file = new File("D:\\hsynb");
        boolean mkdir1 = file.mkdir();
        File file1 = new File("D:\\H\\S\\Y");       //2020.11.22 mkdir
        boolean b1 = file1.mkdirs();
    }

    //    ==========================================================================
    private static void show01() throws IOException {
        //public boolean createNewFile() ���ҽ��������Ƶ��ļ��в�����ʱ������һ���µĿ��ļ�
        //�����ļ���·���������ڹ��췽���ָ��������췽���Ĳ�����
//                  ����ֵ��boolean  true���ļ������ڣ������ļ�  false���ļ����ڣ����ᴴ��������false
//        ע�⣺
//            1.�˷���ֻ�ܴ����ļ������ᴴ���ļ���
//            2.�����ļ���·��������ڣ�������׳��쳣��Ҫ����throws/try.catch��

        File f1 = new File("D:\\java-workspace\\AA\\src\\a.txt");
        boolean b1 = f1.createNewFile();   //������a.txt�ļ���createNewFile()
        System.out.println(b1);//true

//        File file = new File("abc\\aa.txt");        û�����·��
//        System.out.println(file.createNewFile());  Exception in thread "main" java.io.IOException

        File f3 = new File("D:\\hht\\");
        boolean b = f3.createNewFile();             //2020.9.20
        System.out.println(b);
        System.out.println("===============2020.11.22");
        File file = new File("D:\\GDAIB\\a.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
    }
    //    ==========================================================================
}
