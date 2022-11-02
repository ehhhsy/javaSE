package Demo65;

import java.io.File;

/*
        File类获取功能的方法
            public String getAbsolutePath() 返回此File的绝对路径名字字符串
            public String getPath() 返回此File转化为路径名字符串
            public String getName() 返回此File表达的文件/目录的名称
            public long length() 返回此File表达的文件的长度

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
      public long length() 返回此File表达的文件的长度
      获取的是构造方法指定的文件的大小，以字节为单位
      注意：
        文件夹是没有大小概念的，不能获取文件夹的大小
        如果构造方法中给出的路径不存在，那么length方法返回0
         */
        File f1 = new File("D:\\java-workspace\\AA\\a.txt");
        long l1 = f1.length();
        System.out.println(l1); //16
        File file = new File("D:\\", "java-workspace\\b.txt");  //指定的文件的大小，以字节为单位
        System.out.println(file.length());
    }
//==================================================================
    private static void show03() {
//            public String getName() 返回此File表达的文件/目录的名称
   //          获取的就是构造方法传递路径的结尾部分（文件/文件夹）
        File f3 = new File("D:\\java-workspace\\AA\\a.txt");
        String name = f3.getName();
        System.out.println(name); //a.txt  文件
        File f4 = new File("D:\\java-workspace\\AA\\");
        System.out.println(f4.getName()); //AA  文件夹

        File f = new File("C:\\abc\\b\\a.txt");
        System.out.println(f.getName());  //a.txt    2020.9.16

        File file = new File("D:\\", "java-workspace\\b.txt");
        System.out.println(file.getName());
    }

//    ===============================================================
    /*
    public String getPath() 返回此File转化为路径名字符串
    获取的构造方法中的传递的路径
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
        System.out.println(f1.toString());//【重点】 toString就是重写了getPath方法
        File file = new File("D:\\", "java-workspace\\b.txt");
        System.out.println(file.getPath());
    }
//================================================================================
    /*
       public String getAbsolutePath() 返回此File的绝对路径名字字符串
       获取的构造方法中的传递的路径
       无论路径是绝对的还是相对的，getAbsoluPath方法返回的都是绝对路径         【绝对路径】
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
