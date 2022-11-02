package test;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.*;

//fis  fos
public class test10 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\tmp\\input");
        File file1 = new File(file, "02.txt");
        FileInputStream fileInputStream = new FileInputStream(file1);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        String parent="D:\\tmp\\out2\\";
        Calendar calendar = Calendar.getInstance();

        String child="hsy666"+calendar.get(Calendar.YEAR)+"_"+calendar.get(Calendar.MONTH)+1+"_"+calendar.get(Calendar.SECOND)+".txt";
        //»ØÐ´
        FileOutputStream fileOutputStream = new FileOutputStream(new File(parent,child));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        byte[] bytesArr = new byte[1024];
        int len=0;
        while((len=bufferedInputStream.read(bytesArr))!=-1){
            System.out.println(new String(bytesArr,0,len));
            bufferedOutputStream.write(bytesArr,0,len);
        }
        String outText=+calendar.get(Calendar.YEAR)+"."+calendar.get(Calendar.MONTH)+1+"."+calendar.get(Calendar.DAY_OF_MONTH)+"  "+
                calendar.get(Calendar.HOUR_OF_DAY)+"_"+calendar.get(Calendar.MINUTE)+"_"+calendar.get(Calendar.SECOND);
        bufferedOutputStream.write("\r\n".getBytes(StandardCharsets.UTF_8));
        bufferedOutputStream.write(outText.getBytes(StandardCharsets.UTF_8));
        bufferedOutputStream.close();
        bufferedInputStream.close();
        }
}
