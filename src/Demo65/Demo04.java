package Demo65;



import java.io.File;

/*
    File�жϹ��ܵķ���
        public boolean exists()����File��ʾ���ļ�/Ŀ¼�Ƿ�ʵ�ʴ���
        public boolean isDirectory()����File��ʾ���Ƿ�ΪĿ¼
        public boolean isFile()����File��ʾ���Ƿ�Ϊ�ļ�

 */
public class Demo04 {
    public static void main(String[] args) {
        show01();
        System.out.println("====================");
        show02();
    }

    private static void show02() {
//        public boolean isDirectory()����File��ʾ���Ƿ�ΪĿ¼
//          �����жϹ��췽���и�����·���Ƿ����ļ��н�β
//                �ǣ�true
//                ��flase
//        public boolean isFile()����File��ʾ���Ƿ�Ϊ�ļ�
//        �����жϹ��췽���и�����·���Ƿ����ļ���β
//                �ǣ�true
//                ��flase
//        ע�⣺���Ե�Ӳ����ֻ���ļ�/�ļ��У����������ǻ���
//                ǰ�ᣬ·�������Ǵ��ڵ�
        //�ж�
        File f2 = new File("D:\\java-workspace\\AAAAAAAA");
        System.out.println(f2.isFile());
        File f1 = new File("D:\\java-workspace\\AA");
        System.out.println(f1.isDirectory()); //true
        File f3 = new File("D:\\java-workspace\\AA\\a.txt");
        System.out.println(f3.isFile()); //true

        if (f2.exists()){
            System.out.println(f2.isDirectory());
            System.out.println(f2.isFile());
        }
        if (f3.exists()){
            System.out.println(f3.isDirectory());
            System.out.println(f3.isFile());

            boolean b = new File("C:\\abc\\b").isDirectory();
            System.out.println(b);//true
            System.out.println("������2020.11.22");
            File f6 = new File("D:\\java-workspace\\b.txt");
            System.out.println(f6.isDirectory());  //false  �����ļ���
            System.out.println(f6.isFile());//True      ���ļ�
        }
    }
    //=============================================================
/*
  public boolean exists()����File��ʾ���ļ�/Ŀ¼�Ƿ�ʵ�ʴ���
   �����жϹ��췽���е�·���Ƿ����
        ���ڣ�true
        �����ڣ�false
 */
    private static void show01() {
        //�ж�Ŀ¼�Ƿ����
        File f1 = new File("D:\\java-workspace\\AA");
        System.out.println(f1.exists()); //true
        File f2 = new File("D:\\java-workspace\\AAAAAAAA");
        System.out.println(f2.exists()); //false
        //�ж��ļ��Ƿ����
         File f3 = new File("D:\\java-workspace\\AA\\a.txt");
        System.out.println(f3.exists()); //true
         File f4 = new File("abc.txt");
        System.out.println(f4.exists()); //false

        File f5 = new File("C:\\abc\\b");
        System.out.println(f5.exists());  //true   2020.9.16

        System.out.println("������2020.11.22");
        File f6 = new File("D:\\java-workspace\\b.txt");
        System.out.println(f6.exists());  //True
        File F7 = new File("H:\\11\\BB");
        System.out.println(F7.exists()); //false
    }
}
//=============================================================

