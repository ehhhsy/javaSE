package Demo70;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*InputStreamReader*/
public class demo02 {
    public static void main(String[] args) throws IOException {
        //1. ����һ��InputStreamReader���󣬹��췽���д����ֽ���������ָ������
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("UTF.txt"), "UTF-8");
        int tmp;
//        InputStreamReader.read��������ȡ�ļ�
        while ((tmp=inputStreamReader.read())!=-1){
            System.out.println((char) tmp);
        }
        //�ͷ���Դ
        inputStreamReader.close();
    }
}
