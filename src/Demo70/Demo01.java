package Demo70;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * ## OutStreamWriter��
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        //����һ��OutStreamWriter���󣬹��췽�������ֽ��������OutputStream ����ָ���ı��������
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("ggggg2.txt"), "GBK");
//        ʹ��OutStreamWriter.writer�������ַ�ת��Ϊ�ֽڴ洢�������У����룩
        outputStreamWriter.write("���");
//        ʹ��OutStreamWriter.flush���������ڴ滺�����е��ֽ�ˢ�µ��ļ���(ʹ���ֽ���д�ֽڵĹ���)
        outputStreamWriter.flush();
        //�ͷ���Դ
        outputStreamWriter.close();
    }
}
