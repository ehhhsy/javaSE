package Demo70;

import java.io.*;

public class demo03 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("ggggg2.txt"), "GBK");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("UTF8.txt"), "UTF-8");
        char [] bytesArr=new char[1024];
        int tmp=0;
        while ((tmp=inputStreamReader.read(bytesArr))!=-1){
            outputStreamWriter.write(bytesArr,0,tmp);
        }
        outputStreamWriter.flush();
        outputStreamWriter.close();
        inputStreamReader.close();
    }
}
