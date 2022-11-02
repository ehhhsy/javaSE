package Demo65;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/*
    练习：
        文件搜索：只要.java结尾的文件
     需求：
        遍历c：\\abc文件夹，及abc文件夹的子文件夹
        只要.java结尾的文件
==========================================================================================
        我们可以使用过滤器来实现
        在Fake类有两个listFile重载的方法，方法的参数传递的就是过滤器
        File[] listFiles(FileFilter filter)
        java.io.FileFilter接口：用于抽象路径名（File对象）的过滤器。
            作用：用来过滤文件（File对象）
            抽象方法：用来过滤文件的方法
                boolean accept（File pathname）:
                测试指定抽象路径名是否应该包含某一个路径名列表中
==========================================================================================
        File[] listFiles(FilenameFilter filter)
         java.io.FilenameFilter接口：实现此接口的类实例可用于过滤器文件名
            作用：用来过滤文件名称
            抽象方法：用来过滤文件的方法
           boolean accept（File dir,String name）:测试指定文件是否应该包含在某一个文件列表中
           参数：
                 File dir：构造方法中传递的被遍历的目录
                 String name：使用ListFiles方法遍历目录，获取的每一个文件/文件夹的名称
==========================================================================================
    注意:
        两个过滤器接口是没有实现类的，需要自己写实现类，重写accept方法，定义过滤规则


 */
public class Demo012Test {
    public static void main(String[] args) {
        File f = new File("c:\\abc\\");
        show(f);
    }
    /*
    定义一个方法，参数传递File类型的目录
    方法中对目录进行遍历
     */
    private static void show(File dir) {
//        =============================================================
//          ①FileFilter
        //使用匿名内部类，传递过滤器
//        File[] f = dir.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
        //      过滤规则，pathname是文件夹或者是。java结尾的文件返回true
//                if (pathname.isDirectory()||pathname.getName().toLowerCase().endsWith(".java"));
//                return true;
//            }
//        });
        //=============================================================
//        ②FilenameFilter
//        File[] f = dir.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".java");
//            }
//        });
        //=============================================================
//        ③FilenameFilter 使用lambda表达式
        File[] f = dir.listFiles((dir1, name) -> new File(dir1,name).isDirectory()||name.toLowerCase().endsWith(".java"));
        //=============================================================
        for (File b:f
             ) {
            if (b.isDirectory()){   //对b目录进行判断，判断是否为文件夹
                show(b);
            }else{                  //不是则正常输出

                System.out.println(b);
            }
        }
    }

}
