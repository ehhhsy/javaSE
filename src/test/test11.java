package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Reader Writer
public class test11 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\tmp\\hhhhhh.txt");
        FileInputStream fis = new FileInputStream("D:\\work_space\\java-workspace\\AA\\hello44.txt");
        byte [] byteArr=new byte[1024];
        int tmp;
        while ((tmp=fis.read(byteArr))!=-1){
            fos.write(byteArr,0,tmp);
        }
        fos.close();
        fis.close();
        File file = new File("D:\\tmp\\output\\hhhhhh.txt");
        file.delete();
    }

}
