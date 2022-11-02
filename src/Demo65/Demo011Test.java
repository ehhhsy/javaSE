package Demo65;

import java.io.File;

/*
    ��ϰ��
        �ļ�������ֻҪ.java��β���ļ�
     ����
        ����c��\\abc�ļ��У���abc�ļ��е����ļ���
        ֻҪ.java��β���ļ�
==========================================================================================
        ���ǿ���ʹ�ù�������ʵ��
        ��Fake��������listFile���صķ����������Ĳ������ݵľ��ǹ�����
        File[] listFiles(FileFilter filter)
        java.io.FileFilter�ӿڣ����ڳ���·������File���󣩵Ĺ�������
            ���ã����������ļ���File����
            ���󷽷������������ļ��ķ���
                boolean accept��File pathname��:
                ����ָ������·�����Ƿ�Ӧ�ð���ĳһ��·�����б���
==========================================================================================
        File[] listFiles(FilenameFilter filter)
         java.io.FilenameFilter�ӿڣ�ʵ�ִ˽ӿڵ���ʵ�������ڹ������ļ���
            ���ã����������ļ�����
            ���󷽷������������ļ��ķ���
           boolean accept��File dir,String name��:����ָ���ļ��Ƿ�Ӧ�ð�����ĳһ���ļ��б���
           ������
                 File dir�����췽���д��ݵı�������Ŀ¼
                 String name��ʹ��ListFiles��������Ŀ¼����ȡ��ÿһ���ļ�/�ļ��е�����
==========================================================================================
    ע��:
        �����������ӿ���û��ʵ����ģ���Ҫ�Լ�дʵ���࣬��дaccept������������˹���


 */
public class Demo011Test {
    public static void main(String[] args) {
        File f = new File("c:\\abc\\");
        show(f);
    }
    /*
    ����һ����������������File���͵�Ŀ¼
    �����ж�Ŀ¼���б���
     */
    private static void show(File dir) {
        File[] f = dir.listFiles(new Demo11());
        for (File b:f
             ) {
            if (b.isDirectory()){   //��bĿ¼�����жϣ��ж��Ƿ�Ϊ�ļ���
                show(b);
            }else{                  //�������������

                System.out.println(b);
            }
        }
    }
}
