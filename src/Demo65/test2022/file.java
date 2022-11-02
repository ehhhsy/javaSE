package Demo65.test2022;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class file{
    static int counter=0;
    public static void main(String[] args) {

        File f = new File("D:\\work_space\\java-workspace\\AA\\src","demo00");

        int countJavaFiler = ScanJavaFile(f);
        System.out.println("the java file is "+countJavaFiler);
    }
    private static int ScanJavaFile(File f) {
        File[] files_arr = f.listFiles(new FilenameFilterImpl());
        for (File file : files_arr) {
            if (file.isDirectory()){
                ScanJavaFile(file);
            }else{
                System.out.println(file);
            }
            }
        return counter;
    }

    public static void ForScanFiler(File f){
        File[] file_arr = f.listFiles();
        for (File file : file_arr) {
            if (file.isDirectory()){
                ForScanFiler(file);
            }
            System.out.println(file.getAbsolutePath());

        }
    }
}
