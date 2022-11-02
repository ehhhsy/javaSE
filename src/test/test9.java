package test;

import Demo65.test2022.FilenameFilterImpl;

import java.io.File;
import java.io.IOException;

//file
public class test9 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\work_space\\java-workspace\\AA\\src\\Demo00");

        demo01(f1);
    }

    private static void demo01(File F) {
        File[] listFiles = F.listFiles(new FilefilterIMPL());

//        for (File listFile : listFiles) {
//            if (listFile.isDirectory()){
//                demo01(listFile);
//            }else if(listFile.toString().endsWith("")){
//                System.out.println(listFile.toString());
//            }
//        }
    }
}
