package Demo65;

import java.io.File;

/*
  java。io。File类
  文件和路径名的抽象表示形式
  java把电脑中的文件和文件夹（目录）封装了一个File类，我们可以使用File类对文件和文件夹进行操作
  我们可以使用File类的方法
        创建一个文件/文件夹
        删除文件/文件夹
        获取文件/文件夹
        判断文件/文件夹是否存在
        对文件进行遍历
        获取文件的大小
    File类是一个跟系统无关的类，任何的操作系统都可以使用这个类中的方法

   【重点】记住这三个单词
        File：文件
        directory:文件夹
        path：路径


     注意：操作路径不能写死了 
     C:/develop/a.txt  windows
     C:\develop\a.txt  linux
     "C:"+File.separator+"develop"+File.separator+"a.txt"  解决不兼容


 */
public class Demo01File {
    /*
    【静态方法】 【静态方法】【静态方法】【静态方法】 可以类名。  调用
static String pathSeparator
          与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
static char pathSeparatorChar
          与系统有关的路径分隔符。
static String separator
          与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
static char separatorChar
          与系统有关的默认名称分隔符。
     */
    public static void main(String[] args) {

        String s = File.pathSeparator;
        System.out.println(s);  //路径分隔符   ;  一个分号

        char c = File.pathSeparatorChar;
        System.out.println(c); //路径分隔符   ;  一个分号

        String s1 = File.separator;
        System.out.println(s1);//文件名称分隔符   \  一个反斜杠

        System.out.println("=========================");
        char c1 = File.pathSeparatorChar;
        System.out.println(c1);  //   ;

        char c2 = File.pathSeparatorChar;
        System.out.println(c2);

        String s2 = File.pathSeparator;     //2020.9.19
        System.out.println(s2);
        System.out.println("=========================2020.11.22");
        String s3 = File.pathSeparator;   //   ;
        System.out.println(s3);
        char c3 = File.pathSeparatorChar;  //   ;
        System.out.println(c3);
        String s4 = File.separator;
        System.out.println(s4);         // \
        System.out.println("-------------------------2022.9.27");
        char C5=File.pathSeparatorChar;
        System.out.println(C5);
        String s6 = File.pathSeparator;
        System.out.println(s6);
        String s7 = File.separator;
        System.out.println(s7);
    }

}
