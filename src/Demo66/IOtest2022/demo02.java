package Demo66.IOtest2022;


import java.io.File;
import java.io.IOException;
import java.util.Locale;

public class demo02 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("20220929.txt"); //构造方法1
        String parentString="D:\\work_space\\java-workspace\\AA\\src\\Demo66";
        File f2 = new File(parentString, "2022.txt");//构造方法2（String parent，String child）
        System.out.println("f2  "+f2);
        File parentFile = new File(parentString);
        File f3 = new File(parentFile, "2023.txt");//构造方法3（File parent，string child）
        System.out.println("f3  "+f3);

        System.out.println("常用方法测试");
//        //静态方法
//         String pathFileStatic="D:"+File.separator+"work_space"+File.separator+"java-workspace"+File.separator+"AA"+File.separator+"src"+File.separator+"Demo066";
//        System.out.println("静态方法构造"+pathFileStatic);
//        System.out.println(File.pathSeparator);
//        System.out.println(File.separatorChar);
        String path = f2.getPath();
        System.out.println("f2.getPath() is ==>"+path);         //get.path()
        File fileAbsolute = f2.getAbsoluteFile();
        System.out.println("f2.getAbsoluteFile() is ==>"+fileAbsolute); //get.AbsolutePath()
        boolean createFile_boolean = f2.createNewFile();
        System.out.println(createFile_boolean);         //createNewFile()
        System.out.println("f2.getName() -->  "+f2.getName());
        System.out.println("f2.lenght() == "+f2.length());

        System.out.println("list for=============================");
        String[] list = parentFile.list();
        boolean mkdir = parentFile.mkdir();
        System.out.println("mkdir   "+mkdir);
        File fileMkdir = new File(parentFile, "testUp" + File.separator + "testMid" + File.separator + "testDown");
        System.out.println(fileMkdir);
        boolean mkdir1 = fileMkdir.mkdirs();
//        System.out.println(mkdir1);
//        System.out.println(parentFile);
//        System.out.println(parentFile.isFile());
//        System.out.println(parentFile.isDirectory());
//        System.out.println(fileMkdir);
//        System.out.println(fileMkdir.isDirectory());
//        System.out.println(fileMkdir.isFile());


        recursion(parentFile);

    }
    public static void recursion(File file){  //遍历1
        for (File listFile : file.listFiles()) {
            System.out.println(listFile);
            if (listFile.isDirectory()){
                recursion(listFile);
            }
//            String s = listFile.toString().toLowerCase(Locale.ROOT);
//            if (s.endsWith(".java") || s.endsWith(".c") || s.endsWith(".py")){
//                System.out.println(listFile);
//            }
        }
        }

}
