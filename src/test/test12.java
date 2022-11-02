package test;

import java.io.*;

//Reader  Writter
public class test12 {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("D:\\tmp\\FileTest\\FileTest.txt");
        FileWriter writer = new FileWriter("D:\\tmp\\FileTest\\A.txt",true);
//        int tmp;
//        while((tmp=reader.read())!=-1){
//            System.out.println((char) tmp);
//        }
        int tmp;
        char [] charsArr=new char[1024];
        while((tmp=reader.read(charsArr))!=-1){
            writer.write(charsArr,0,tmp);
        }
        reader.close();
        writer.close();
    }
}
