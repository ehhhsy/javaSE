package Demo66;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    һ��д����ֽڵķ�����
    public void write (byte[] b):��b.length�ֽڴ�ָ�����ֽ�����д��������
    public void write(byte[] b,int off,int len):��ָ�����ֽ�����д��len�ֽڣ���ƫ����off��ʼ������������
 */
public class Demo03FileOutPutStream {
    public static void main(String[] args) throws IOException {
        //����FileOutPutStream���󣬹��췽���а�Ҫд������ݵ�Ŀ�ĵ�
        FileOutputStream fos = new FileOutputStream("src\\Demo66\\b.txt");
//        public void write (byte[] b):��b.length�ֽڴ�ָ�����ֽ�����д��������
//        byte[] bytes={65,67,68,69};//ACDE
        byte[] bytes={-61,-64,-68,-29};//����
        fos.write(bytes);

//        public void write(byte[] b,int off,int len):��ָ�����ֽ�����д��len�ֽڣ���ƫ����off��ʼ������������
//          int off:����Ŀ�ʼ����
//          int len:д�����ֽ�

        fos.write(bytes,1,2); //-64,-68

        /*
        д���ַ����ķ�����ʹ��String���еķ�����ת��Ϊ�ֽ�����
        byte����getBytes���� ���ַ���ת��Ϊ�ֽ�����

         */
        byte[] bytes1 = "����".getBytes();
        fos.write(bytes);
        fos.close();

    }
}
