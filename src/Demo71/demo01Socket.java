package Demo71;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * Socket
 */
public class demo01Socket {
    public static void main(String[] args) throws IOException {
        //1.创建一个客户端Socket，构造方法绑定服务器的ip地址和端口号
        Socket socket = new Socket("127.0.0.1", 8888);
        //2.使用Socket对象的方法getOutputStream()，获取网络字节输出流OutputStream 对象
        OutputStream outputStream = socket.getOutputStream();
        //3.使用网络字节输出流OutputStream 对象中的write（），给服务器发送数据
        outputStream.write("你好服务器你好服务器你好服务器".getBytes(StandardCharsets.UTF_8));
        //4.使用Socket对象中的方法getInputStream()，获取网络字节输入流InputStream 对象
        InputStream socketInputStream = socket.getInputStream();
        //5.使用网络字节输入流InputStream 对象中的read（），读取数据
        byte[] bytesArr=new byte[1024];
        int len = socketInputStream.read(bytesArr);
        System.out.println(new String(bytesArr,0,len));
        //6.释放资源（Socket）
        socket.close();
    }
}
