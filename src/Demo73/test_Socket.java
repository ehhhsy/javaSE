package Demo73;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 文件上传案例  读取本地文件，上传到服务器  练习2022.10.13
 */
public class test_Socket {
    public static void main(String[] args) throws IOException {
        //1.使用FileInputStream读取文件
        FileInputStream fileInputStream = new FileInputStream("D:\\tmp\\input\\nk.jpg");
        //2.获取Socket对象,使用流给服务器回信
        Socket socket = new Socket("127.0.0.1", 1006);
        OutputStream socketOutputStream = socket.getOutputStream();
        byte[] bytesArr=new byte[1024];
        int len=0;
        while((len=fileInputStream.read(bytesArr))!=-1){
            //3.给服务器传输数据
            socketOutputStream.write(bytesArr,0,len);
        }
        //4.给服务器发送一个结束标记
        socket.shutdownOutput();

        //5.接收服务器传回的信息
        InputStream socketInputStream = socket.getInputStream();
        byte [] bytesArr2=new byte[1024];
        int len2=0;
        while ((len2=socketInputStream.read(bytesArr2))!=-1){
            System.out.println(new String(bytesArr2,0,len2));
        }

        //关流
        fileInputStream.close();
        socket.close();
    }
}
