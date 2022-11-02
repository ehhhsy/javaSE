package Demo65;

import java.io.File;

/*
      listFiles()
    File类遍历（文件夹）目录功能
        public String[] list();    :    返回一个String数组，表达该File目录种所有的子类和目录
                还可以显示隐藏文件
        public File[]   listFiles():    返回一个File数组，表达该File目录中的所有的子文件或目录

        注意：
            list方法和listFiles方法遍历的是构造方法给出的目录
            如果构造方法中给出的目录的路径不存在，会抛出空指针异常
            如果构造方法中给出的路径不是一个目录，也会抛出空指针异常
 */
public class Demo06 {
    public static void main(String[] args) {
        show01();
        System.out.println("======================");
        show02();


    }
    //================================================================================================
/*
public File[]   listFiles():    返回一个File数组，表达该File目录中的所有的子文件或目录
       遍历构造方法中给出的目录，会获取目录中所有的文件/文件夹，把文件/文件夹封装为File对象
       多个File对象，存在File数组中
 */
    private static void show02() {
        File f1 = new File("D:\\java-workspace");
        File[] files = f1.listFiles();
        for (File f:files
             ) {
            System.out.println(f); //输出的是File的路径
            // D:\java-workspace\.metadata。。。
            // D:\java-workspace\a.txt。。
            // D:\java-workspace\BB。。。

            File f2 = new File("D:\\java-workspace\\hhhhh"); ////2020.9.20
            File[] f3 = f2.listFiles();
            for (File ff:f3
                 ) {
                System.out.println(ff);
            }
        }
        System.out.println("下面是2020.11 listFiles");
        File file = new File("C:\\abc");
        File[] files1 = file.listFiles();
        for (File f:files1
             ) {
            System.out.println(f);
        }

    }

    //================================================================================================
    /*
 public String[] list();    :    返回一个String数组，表达该File目录种所有的子类和目录
        遍历构造方法中出的目录，会获取目录中所有文件/文件夹的名称，把获取到的多个名称存储到数组
     */
    private static void show01() {
        File f1 = new File("D:\\java-workspace");
        for (String a:f1.list()
             ) {
            System.out.println(a); //【返回这个路径的 所有的文件/文件夹  的名称】 .metadata，AA，BB，CC,HSY
        }
//        File f2 = new File("D:\\java-workspace\\a.txt");
//        for (String a:f2.list()               报错，不能遍历文件
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
