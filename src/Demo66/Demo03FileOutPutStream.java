package Demo66;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    一次写多个字节的方法：
    public void write (byte[] b):将b.length字节从指定的字节数组写入此输出流
    public void write(byte[] b,int off,int len):从指定的字节数组写入len字节，从偏移量off开始输出到此输出流
 */
public class Demo03FileOutPutStream {
    public static void main(String[] args) throws IOException {
        //创建FileOutPutStream对象，构造方法中绑定要写入的数据的目的地
        FileOutputStream fos = new FileOutputStream("src\\Demo66\\b.txt");
//        public void write (byte[] b):将b.length字节从指定的字节数组写入此输出流
//        byte[] bytes={65,67,68,69};//ACDE
        byte[] bytes={-61,-64,-68,-29};//美笺
        fos.write(bytes);

//        public void write(byte[] b,int off,int len):从指定的字节数组写入len字节，从偏移量off开始输出到此输出流
//          int off:数组的开始索引
//          int len:写几个字节

        fos.write(bytes,1,2); //-64,-68

        /*
        写入字符串的方法：使用String类中的方法，转化为字节数组
        byte【】getBytes（） 把字符串转化为字节数组

         */
        byte[] bytes1 = "不好".getBytes();
        fos.write(bytes);
        fos.close();

    }
}
