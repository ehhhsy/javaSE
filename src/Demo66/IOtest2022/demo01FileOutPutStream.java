package Demo66.IOtest2022;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class demo01FileOutPutStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("hello22.txt");  //相对路径，是项目的路径就是AA\\helo22.txt
        FileOutputStream fos2 = new FileOutputStream("hello33.txt", true);

        for (int i = 0; i < 10; i++) {
            fos2.write(i);
            fos2.write('\n');
        }
    }
}
