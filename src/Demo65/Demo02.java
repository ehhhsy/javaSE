package Demo65;

import java.io.File;
//        ���췽��
/*
 ·����
    ����·������һ��������·��
        ���̷���c��d�̣����Ե�·��
        C:\Windows\assembly
    ���·������һ���򻯵�·��
        ���ָ�����������Ŀ�ĸ�Ŀ¼

      ֻ�У�
        1.·�������ִ�Сд��
        2.·���е��ļ����Ʒָ���windowʹ�÷�б�ܣ�
            ��б����ת���ַ���������б�ܴ���һ����ͨ�ķ�б��
 */
//==========================================================================x
public class Demo02 {
    public static void main(String[] args) {

    show01();
//    show02("c:\\","a.txt"); //c:\a.txt
    show02("D:\\","abcsd.txt"); //D:\abcsd.txt
    show03(); //c:\hallo.java


        File file = new File("D:\\", "hel.txt");        //2020.11.22
        System.out.println(file);
        File file1 = new File("D:\\");
        File gg = new File(file1, "gg");
        System.out.println(gg);
    }

//==========================================================================
    private static void show03() {
        /*
        File(File parent,String child)����parent����·������child·�������ַ�������һ����File
        ��������·���ֳ�����������
        File parent����·��
        String child����·��

      �ô���
        ��·������·�������Ե�����д��ʹ�������ǳ�����·������·�������Ա仯
        ��·����File���ͣ�����ʹ��File�ķ�����·������һЩ��������ʹ��·����������           ���ȽϺá�

         */
        File f = new File("c:\\");
        File f2 = new File(f, "hallo.java");
        //                  ���f�������Խ���һЩ����
        System.out.println(f2);
    }
//==========================================================================x
    private static void show02(String parent,String child) {
        /*
           ���췽�� ���췽�� ���췽�� ���췽�� ���췽��
           File��String parent��String child������parent·���ַ�����child·���ַ�������һ���µ�File��
           ��������·���ֳ�����������
                  String parent����·��
                  String child:  ��·��
             !!!�ô���
                ��·������·�������Ե�����д��ʹ�������ǳ�����·������·�������Ա仯
         */
        File f = new File(parent, child);
        System.out.println(f);
    }
//==========================================================================x
    private static void show01() {
         /* ���췽�� ���췽�� ���췽�� ���췽�� ���췽��
            File��String pathname��ͨ������·�����ַ���ת��Ϊ����·����������һ��Fileʵ��
           ������
           String pathname���ַ�����·������
           ·�����������ļ���β��Ҳ���������ļ�����β
           ·�����������·����Ҳ�����Ǿ���·��
           ·�������Ǵ��ڣ�Ҳ�����ǲ�����
           ����File����ֻ�ܰ��ַ���·����װΪFike���󣬲�����·����������
         */
        File f1 = new File("D:\\java-workspace\\AA\\a.txt");
        System.out.println(f1); //D:\java-workspace\AA\a.txt ��ӡ��·������д��toString����

        File f2 = new File("D:\\java-workspace\\");
        System.out.println(f2);//D:\java-workspace

        File f3 = new File("BB");
        System.out.println(f3); //BBd
    }


}
