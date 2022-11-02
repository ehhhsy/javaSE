package Demo73;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
    文件上传案例优化
 */
public class demo01FileLoadSocket {
    public static void main(String[] args) throws IOException {


        //创建本地字节输入流FileInputStream对象，构造方法绑定要读取的数据源
        FileInputStream fileInputStream = new FileInputStream("D:\\tmp\\input\\nk.jpg");
        //创建一个客户端Socket对象，构造方法中绑定IP地址和端口
        Socket socket = new Socket("127.0.0.1", 666);
        //使用Scoket.getOutPutStream（），获取网络字节输出流OutputStream对象
        OutputStream socketOutputStream = socket.getOutputStream();
        //使用本地字节输入流FileInputStream.read（），读取本地文件
        int len=0;
        byte [] bytesArr=new byte[1024];
        while((len=fileInputStream.read(bytesArr))!=-1){
            //使用网络字节输出流OutputStream.write( ),上传到服务器
            socketOutputStream.write(bytesArr,0,len);
        }
        socket.shutdownOutput();  //  结束输出流


       //使用网络字节输出流InputStream.read（），读取服务器回来的数据  ,并打印
        InputStream socketInputStream = socket.getInputStream();
        int len2=0;
        byte [] bytesArr_2=new byte[1024];
        while((len2=socketInputStream.read(bytesArr_2))!=-1){
            System.out.println(new String(bytesArr_2,0,len2));
        }
        //释放资源（FileInputStream，Socket）
        fileInputStream.close();
        socket.close();
    }
}
