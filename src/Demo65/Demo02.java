package Demo65;

import java.io.File;
//        构造方法
/*
 路径：
    绝对路径：是一个完整的路径
        以盘符（c，d盘）可以的路径
        C:\Windows\assembly
    相对路径：是一个简化的路径
        相对指的是相对于项目的根目录

      只有：
        1.路径是区分大小写的
        2.路径中的文件名称分隔符window使用反斜杠，
            反斜杠是转义字符，两个反斜杠代表一个普通的反斜杠
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
        File(File parent,String child)根据parent抽象路径名和child路径名字字符串创建一个新File
        参数：把路径分成了两个部分
        File parent：父路径
        String child：子路径

      好处：
        父路径和子路径，可以单独书写，使用起来非常灵活，父路径和子路径都可以变化
        父路径是File类型，可以使用File的方法对路径进行一些操作，再使用路径创建对象           【比较好】

         */
        File f = new File("c:\\");
        File f2 = new File(f, "hallo.java");
        //                  这个f，还可以进行一些操作
        System.out.println(f2);
    }
//==========================================================================x
    private static void show02(String parent,String child) {
        /*
           构造方法 构造方法 构造方法 构造方法 构造方法
           File（String parent，String child）根据parent路径字符串和child路径字符串创建一个新的File类
           参数：把路径分成了两个部分
                  String parent：父路径
                  String child:  子路径
             !!!好处：
                父路径和子路径，可以单独书写，使用起来非常灵活，父路径和子路径都可以变化
         */
        File f = new File(parent, child);
        System.out.println(f);
    }
//==========================================================================x
    private static void show01() {
         /* 构造方法 构造方法 构造方法 构造方法 构造方法
            File（String pathname）通过将给路径名字符串转化为抽象路径名来创建一个File实例
           参数：
           String pathname：字符串的路径名称
           路径可以是以文件结尾，也可以是以文件名结尾
           路径可以是相对路径，也可以是绝对路径
           路径可以是存在，也可以是不存在
           创建File对象，只能把字符串路径封装为Fike对象，不考虑路径的真假情况
         */
        File f1 = new File("D:\\java-workspace\\AA\\a.txt");
        System.out.println(f1); //D:\java-workspace\AA\a.txt 打印了路径，从写了toString方法

        File f2 = new File("D:\\java-workspace\\");
        System.out.println(f2);//D:\java-workspace

        File f3 = new File("BB");
        System.out.println(f3); //BBd
    }


}
