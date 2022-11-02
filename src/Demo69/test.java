package Demo69;

import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\tmp\\input\\test.png");
        FileOutputStream fos = new FileOutputStream("D:\\tmp\\output\\∆¡ƒªΩÿÕº5.png");
        BufferedInputStream bfis = new BufferedInputStream(fis);
        BufferedOutputStream bfos = new BufferedOutputStream(fos);

        byte [] bytesArr=new byte[1024];
        int tmp;
        while((tmp= bfis.read(bytesArr))!=-1){
            bfos.write(bytesArr);
        }
        long l1 = System.currentTimeMillis();
        System.out.println("π≤∫ƒ ±"+(l1-l)+"∫¡√Î"); //2∫¡√Î
        bfos.close();
        bfis.close();
    }
}
