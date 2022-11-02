package Demo66;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\work_space\\java-workspace\\AA\\src\\Demo66");
        int tmp=0;
        while ((tmp=(fis.read()))!=-1){
            System.out.println((char) tmp);
        }
        fis.close();
    }
}
