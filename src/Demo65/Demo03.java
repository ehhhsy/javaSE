package Demo65;

import java.io.File;

/*
        File���ȡ���ܵķ���
            public String getAbsolutePath() ���ش�File�ľ���·�������ַ���
            public String getPath() ���ش�Fileת��Ϊ·�����ַ���
            public String getName() ���ش�File�����ļ�/Ŀ¼������
            public long length() ���ش�File�����ļ��ĳ���

 */
public class Demo03 {
    public static void main(String[] args) {
        show01();
        System.out.println("====================");
        show02();
        System.out.println("====================");
        show03();
        System.out.println("====================");
        show04();
    }
    //===============================================================
    private static void show04() {
        /*
      public long length() ���ش�File�����ļ��ĳ���
      ��ȡ���ǹ��췽��ָ�����ļ��Ĵ�С�����ֽ�Ϊ��λ
      ע�⣺
        �ļ�����û�д�С����ģ����ܻ�ȡ�ļ��еĴ�С
        ������췽���и�����·�������ڣ���ôlength��������0
         */
        File f1 = new File("D:\\java-workspace\\AA\\a.txt");
        long l1 = f1.length();
        System.out.println(l1); //16
        File file = new File("D:\\", "java-workspace\\b.txt");  //ָ�����ļ��Ĵ�С�����ֽ�Ϊ��λ
        System.out.println(file.length());
    }
//==================================================================
    private static void show03() {
//            public String getName() ���ش�File�����ļ�/Ŀ¼������
   //          ��ȡ�ľ��ǹ��췽������·���Ľ�β���֣��ļ�/�ļ��У�
        File f3 = new File("D:\\java-workspace\\AA\\a.txt");
        String name = f3.getName();
        System.out.println(name); //a.txt  �ļ�
        File f4 = new File("D:\\java-workspace\\AA\\");
        System.out.println(f4.getName()); //AA  �ļ���

        File f = new File("C:\\abc\\b\\a.txt");
        System.out.println(f.getName());  //a.txt    2020.9.16

        File file = new File("D:\\", "java-workspace\\b.txt");
        System.out.println(file.getName());
    }

//    ===============================================================
    /*
    public String getPath() ���ش�Fileת��Ϊ·�����ַ���
    ��ȡ�Ĺ��췽���еĴ��ݵ�·��
     */
    private static void show02() {
        File f1 = new File("D:\\java-workspace\\AA");
        File f2 = new File("a.txt");
        String path1 = f1.getPath();
        String path2 = f2.getPath();
        System.out.println(path1);//D:\java-workspace\AA
        System.out.println(path2);//a.txt
        System.out.println("=================2020.11");
        System.out.println(f1);
        System.out.println(f1.toString());//���ص㡿 toString������д��getPath����
        File file = new File("D:\\", "java-workspace\\b.txt");
        System.out.println(file.getPath());
    }
//================================================================================
    /*
       public String getAbsolutePath() ���ش�File�ľ���·�������ַ���
       ��ȡ�Ĺ��췽���еĴ��ݵ�·��
       ����·���Ǿ��ԵĻ�����Եģ�getAbsoluPath�������صĶ��Ǿ���·��         ������·����
     */
    private static void show01() {
        File f1 = new File("D:\\java-workspace\\AA");
        String s = f1.getAbsolutePath();
        System.out.println(s); //D:\java-workspace\AA


        File f2 = new File("a.txt");
        String s2 = f2.getAbsolutePath();
        System.out.println(s2); //D:\java-workspace\AA\a.txt

        File f3 = new File("C:\\abc\\");        //2020.9.16
        String s3 = f3.getAbsolutePath();
        System.out.println(s3);

        File file = new File("b.txt");
        System.out.println(file.getAbsolutePath()); //D:\java-workspace\AA\b.txt

    }
}
