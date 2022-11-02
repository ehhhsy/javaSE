package Demo65;

import java.io.File;

/*
    练习：
        递归打印多级目录
     需求：
        遍历c：\\abc文件夹，及abc文件夹的子文件夹

/*
        思路
        先找到一个总路径，然后listFiles变成file的集合
        然后遍历file集合，判断如果是文件夹，就在递归（show（）），否则就输出路径
 */


public class Demo09Test {
    public static void main(String[] args) {
        File f = new File("c:\\abc\\");
        show02(f);
    }
    /*
    定义一个方法，参数传递File类型的目录
    方法中对目录进行遍历
     */
//    private static void show(File dir) {
//        System.out.println(dir); //打印被遍历的名称
//
//        File[] f = dir.listFiles();
//        for (File b:f
//             ) {
//            if (b.isDirectory()){   //对b目录进行判断，判断是否为文件夹
//                show(b);
//            }else{                  //不是则正常输出
//                System.out.println(b);
//            }
//        }
//    }
        public static void show02(File dir){
//            System.out.println(dir);
//
//            File[] f1 = dir.listFiles();        //2020.9.20
//            for (File f:f1
//                 ) {
//                if (f.isDirectory()){
//                    show02(f);
//                }else{
//                    System.out.println(f);
//                }
//            }
            System.out.println(dir);
            File[] files = dir.listFiles();
            for (File s:files
                 ) {
                if (s.isDirectory()){
                    show02(s);
                }else{
                    System.out.println(s);
                }
            }
        }



}
