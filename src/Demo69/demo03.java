package Demo69;

import java.io.*;

/**
 * ���ԣ��ļ�����  �������ٶȱȽ�
 */
public class demo03 {
    public static void main(String[] args) throws IOException {
        long currentTimeMillis_first = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\tmp\\input\\test.png");
        FileOutputStream fos = new FileOutputStream("D:\\tmp\\output\\��Ļ��ͼ.png");
//        int tmp;
//        while((tmp=fis.read())!=-1){
//            fos.write(tmp);
//        }
//        long currentTimeMillis_second = System.currentTimeMillis();
//        System.out.println("������"+(currentTimeMillis_second-currentTimeMillis_first)+"����"); //1756����
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
        System.out.println("������"+(currentTimeMillis_second-currentTimeMillis_first)+"����"); //10����
    }
}
