package Demo65;

import java.io.File;
import java.io.IOException;

/*
   File类创建删除功能的方法
        public boolean createNewFile() 当且仅当改名称的文件尚不存在时，创建一个新的空文件【空文件！】
        public boolean delete() 删除由此File表示的文件/目录
        public boolean mkdir()  创建有此File表示的目录   【只能创建单级空文件夹】
        public boolean mkdirs()  创建有此File表示的目录，包括任何必须但不存在的父目录 【即可单级，也可以创建多级空文件夹】
 */
public class Demo05 {
    public static void main(String[] args) throws IOException {
        show01();
        System.out.println("===================");
        show02();
        System.out.println("===================");
        show03();
    }
    //    ==========================================================================
    private static void show03() {
/*        public boolean delete() 删除由此File表示的文件/目录
           注意：此方法可以删除构造方法路径种给出的文件/文件夹
           返回值：boolean   true：文件/文件夹 删除成功
           false：文件夹种有内容，不会删除返回false，构造方法种路径不存在，返回false
          注意：
                delete方法是直接删除文件/文件夹，不走回收站，删除要谨慎
* */
        File f1 = new File("D:\\java-workspace\\AA\\src\\File\\");
        System.out.println(f1.delete()); //true 删除目录成功

        File f4 = new File("D:\\java-workspace\\AA\\src\\Demo65\\a.txt");
        System.out.println("f4:"+f4.delete()); //true  删除文件成功

        File f5 = new File("D:\\java-workspace\\HSY");
        boolean b5 = f5.delete();
        System.out.println("f5:"+b5);
    }
    //    ==========================================================================
    private static void show02() {
/*      public boolean mkdir()  创建有此File表示的目录
    public boolean mkdirs()  创建有此File表示的目录，包括任何必须但不存在的父目录
    建文件夹的路径和名称在构造方法种给出（构造方法的参数）
//         返回值：boolean  true：文件夹不存在，创建文件夹  false：文件夹存在，不会创建，返回false
         注意：
//            1.此方法只能创建文件夹，不会创建文件
   */
        File f1 = new File("D:\\java-workspace\\AA\\src\\File\\");
        System.out.println(f1.mkdir());     //创建了File文件夹 mkdir  【单级】

        File f2 = new File("D:\\java-workspace\\AA\\src\\Filemkdir\\FileMkdirs");
        System.out.println(f2.mkdirs()); //创建了Filemkdir--》FileMkdirs 【多级】

         File f3 = new File("111\\FileMkdirs");
        System.out.println("f3 :"+f2.mkdirs()); //路径不存在,不会创建，不会抛出异常

        File f4 = new File("D:\\java-workspace\\hht");              //2020.9.20
        boolean mkdir = f4.mkdir();
        System.out.println("f4 :"+mkdir);

        File f5 = new File("D:\\java-workspace\\hhhhh\\hhh\\tt"); //2020.9.20
        boolean b = f5.mkdirs();
        System.out.println("f5 :"+b);
        System.out.println("===============2020.11.22 mkdir");
        File file = new File("D:\\hsynb");
        boolean mkdir1 = file.mkdir();
        File file1 = new File("D:\\H\\S\\Y");       //2020.11.22 mkdir
        boolean b1 = file1.mkdirs();
    }

    //    ==========================================================================
    private static void show01() throws IOException {
        //public boolean createNewFile() 当且仅当改名称的文件尚不存在时，创建一个新的空文件
        //创建文件的路径和名称在构造方法种给出（构造方法的参数）
//                  返回值：boolean  true：文件不存在，创建文件  false：文件存在，不会创建，返回false
//        注意：
//            1.此方法只能创建文件，不会创建文件夹
//            2.创建文件的路径必须存在，否则会抛出异常（要处理throws/try.catch）

        File f1 = new File("D:\\java-workspace\\AA\\src\\a.txt");
        boolean b1 = f1.createNewFile();   //创建了a.txt文件，createNewFile()
        System.out.println(b1);//true

//        File file = new File("abc\\aa.txt");        没有这个路径
//        System.out.println(file.createNewFile());  Exception in thread "main" java.io.IOException

        File f3 = new File("D:\\hht\\");
        boolean b = f3.createNewFile();             //2020.9.20
        System.out.println(b);
        System.out.println("===============2020.11.22");
        File file = new File("D:\\GDAIB\\a.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
    }
    //    ==========================================================================
}
