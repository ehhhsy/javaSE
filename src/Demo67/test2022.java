package Demo67;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class test2022 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\hsy\\Pictures\\Screenshots\\��Ļ��ͼ(5).png");
        FileOutputStream fos2 = new FileOutputStream("D:\\3.png");

        byte[] byteArr = new byte[1024];
//        int i = fis.read(byteArr);
//        System.out.println(i);
//        String s = new String(byteArr);
//        System.out.println(s);
        System.out.println("----------------------");
        int len; //
        String s = null;
        while((len=fis.read(byteArr))!=-1){
            fos2.write(len);  //д��
        }
        fis.close();
        fos2.close();
    }
    }
