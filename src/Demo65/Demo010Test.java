package Demo65;

import java.io.File;

/*
    练习：
        文件搜索：只要.java结尾的文件
     需求：
        遍历c：\\abc文件夹，及abc文件夹的子文件夹
        只要.java结尾的文件
 */
public class Demo010Test {
    public static void main(String[] args) {
        File f = new File("c:\\abc\\");
        show02(f);
    }

    private static void show02(File f) {                //2020.9.20
//        System.out.println(f);

//        File[] fff = f.listFiles();
//        for (File f12:fff
//             ) {
//            if (f12.isDirectory()){
//                show02(f12);
//            }else{
//                if (f12.getName().toLowerCase().endsWith(".java")){
//                    System.out.println(f12);
//                }
//            }
//        }
        File[] files = f.listFiles();           //2020.11.22
//        System.out.println(f);
        for (File s:files
             ) {
            if (s.isDirectory()){
                show02(s);
            }else{
                if (s.getName().toLowerCase().endsWith(".java")){
                    System.out.println(s);
                }
            }
        }

    }
    /*
    定义一个方法，参数传递File类型的目录
    方法中对目录进行遍历
     */
//    private static void show(File dir) {
//        System.out.println(dir); //打印被遍历的名称

//        File[] f = dir.listFiles();
//        for (File b:f
//             ) {
//            if (b.isDirectory()){   //对b目录进行判断，判断是否为文件夹
//                show(b);
//            }else{                  //不是则正常输出
                /*
                    f是一个文件，直接打印即可
                    只要.java结尾的文件
                    1.把File对象F，转化为字符串对象
                 */
//                String name = b.getName();
                //2.调用String类中的方法endsWith判断字符串是否以java结尾
//                boolean bool = name.endsWith(".java");

                //3.如果是以.java结尾的文件，则输出
//                if (bool){
//                    System.out.println(b);
//                }
//                if (b.getName().toLowerCase().endsWith(".java")){
                    //获取名字      变小写        查尾缀
//                    System.out.println(b);
//                }
//            }
//        }
//    }
}
