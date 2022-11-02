package Demo69;

import java.io.*;

/**
 * 测试：文件复制  缓冲流速度比较
 */
public class demo03 {
    public static void main(String[] args) throws IOException {
        long currentTimeMillis_first = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\tmp\\input\\test.png");
        FileOutputStream fos = new FileOutputStream("D:\\tmp\\output\\屏幕截图.png");
//        int tmp;
//        while((tmp=fis.read())!=-1){
//            fos.write(tmp);
//        }
//        long currentTimeMillis_second = System.currentTimeMillis();
//        System.out.println("共花费"+(currentTimeMillis_second-currentTimeMillis_first)+"毫秒"); //1756毫秒
//
//        fos.close();
//        fis.close();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fis);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fos);
        int tmp2;
        while((tmp2=bufferedInputStream.read())!=-1){
            bufferedOutputStream.write(tmp2);
        }
        bufferedInputStream.close();
        long currentTimeMillis_second = System.currentTimeMillis();
        System.out.println("共花费"+(currentTimeMillis_second-currentTimeMillis_first)+"毫秒"); //10毫秒
    }
}
