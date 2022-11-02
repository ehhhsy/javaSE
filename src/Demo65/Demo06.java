package Demo65;

import java.io.File;

/*
      listFiles()
    File��������ļ��У�Ŀ¼����
        public String[] list();    :    ����һ��String���飬����FileĿ¼�����е������Ŀ¼
                ��������ʾ�����ļ�
        public File[]   listFiles():    ����һ��File���飬����FileĿ¼�е����е����ļ���Ŀ¼

        ע�⣺
            list������listFiles�����������ǹ��췽��������Ŀ¼
            ������췽���и�����Ŀ¼��·�������ڣ����׳���ָ���쳣
            ������췽���и�����·������һ��Ŀ¼��Ҳ���׳���ָ���쳣
 */
public class Demo06 {
    public static void main(String[] args) {
        show01();
        System.out.println("======================");
        show02();


    }
    //================================================================================================
/*
public File[]   listFiles():    ����һ��File���飬����FileĿ¼�е����е����ļ���Ŀ¼
       �������췽���и�����Ŀ¼�����ȡĿ¼�����е��ļ�/�ļ��У����ļ�/�ļ��з�װΪFile����
       ���File���󣬴���File������
 */
    private static void show02() {
        File f1 = new File("D:\\java-workspace");
        File[] files = f1.listFiles();
        for (File f:files
             ) {
            System.out.println(f); //�������File��·��
            // D:\java-workspace\.metadata������
            // D:\java-workspace\a.txt����
            // D:\java-workspace\BB������

            File f2 = new File("D:\\java-workspace\\hhhhh"); ////2020.9.20
            File[] f3 = f2.listFiles();
            for (File ff:f3
                 ) {
                System.out.println(ff);
            }
        }
        System.out.println("������2020.11 listFiles");
        File file = new File("C:\\abc");
        File[] files1 = file.listFiles();
        for (File f:files1
             ) {
            System.out.println(f);
        }

    }

    //================================================================================================
    /*
 public String[] list();    :    ����һ��String���飬����FileĿ¼�����е������Ŀ¼
        �������췽���г���Ŀ¼�����ȡĿ¼�������ļ�/�ļ��е����ƣ��ѻ�ȡ���Ķ�����ƴ洢������
     */
    private static void show01() {
        File f1 = new File("D:\\java-workspace");
        for (String a:f1.list()
             ) {
            System.out.println(a); //���������·���� ���е��ļ�/�ļ���  �����ơ� .metadata��AA��BB��CC,HSY
        }
//        File f2 = new File("D:\\java-workspace\\a.txt");
//        for (String a:f2.list()               �������ܱ����ļ�
//             ) {
//            System.out.println(a);
//        }
        System.out.println("======================================");
        File f2 = new File("D:\\java-workspace\\hhhhh");        //2020.9.20
        for (String s:f2.list()
             ) {
            System.out.println(s);
        }
        System.out.println("===================2020.11.22");
        File f = new File("D:\\H");
        String[] list = f.list();
        for (String s:list
             ) {
            System.out.println(s);
        }
    }
//================================================================================================

}
