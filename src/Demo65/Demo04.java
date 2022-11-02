package Demo65;



import java.io.File;

/*
    File判断功能的方法
        public boolean exists()：此File表示的文件/目录是否实际存在
        public boolean isDirectory()：此File表示的是否为目录
        public boolean isFile()：此File表示的是否为文件

 */
public class Demo04 {
    public static void main(String[] args) {
        show01();
        System.out.println("====================");
        show02();
    }

    private static void show02() {
//        public boolean isDirectory()：此File表示的是否为目录
//          用于判断构造方法中给定的路径是否以文件夹结尾
//                是：true
//                否：flase
//        public boolean isFile()：此File表示的是否为文件
//        用于判断构造方法中给定的路径是否以文件结尾
//                是：true
//                否：flase
//        注意：电脑的硬盘中只有文件/文件夹，两个方法是互斥
//                前提，路径必须是存在的
        //判断
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
            System.out.println("下面是2020.11.22");
            File f6 = new File("D:\\java-workspace\\b.txt");
            System.out.println(f6.isDirectory());  //false  不是文件夹
            System.out.println(f6.isFile());//True      是文件
        }
    }
    //=============================================================
/*
  public boolean exists()：此File表示的文件/目录是否实际存在
   用于判断构造方法中的路径是否存在
        存在：true
        不存在：false
 */
    private static void show01() {
        //判断目录是否存在
        File f1 = new File("D:\\java-workspace\\AA");
        System.out.println(f1.exists()); //true
        File f2 = new File("D:\\java-workspace\\AAAAAAAA");
        System.out.println(f2.exists()); //false
        //判断文件是否存在
         File f3 = new File("D:\\java-workspace\\AA\\a.txt");
        System.out.println(f3.exists()); //true
         File f4 = new File("abc.txt");
        System.out.println(f4.exists()); //false

        File f5 = new File("C:\\abc\\b");
        System.out.println(f5.exists());  //true   2020.9.16

        System.out.println("下面是2020.11.22");
        File f6 = new File("D:\\java-workspace\\b.txt");
        System.out.println(f6.exists());  //True
        File F7 = new File("H:\\11\\BB");
        System.out.println(F7.exists()); //false
    }
}
//=============================================================

