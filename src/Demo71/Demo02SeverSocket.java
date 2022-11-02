package Demo71;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Demo02SeverSocket {
    public static void main(String[] args) throws IOException {
        //1.创建服务器ServerSocket对象和系统要指定的端口
        ServerSocket serverSocket = new ServerSocket(8888);
        //2.使用ServerSocket对象中的方法accpet()，获取请求的客户端对象Socket
        Socket socket = serverSocket.accept();
        //3.使用Socket对象中的方法getInputStream()，获取网络字节输入流InputStream 对象
        InputStream socketInputStream = socket.getInputStream();
        //4.使用网络字节输入流InputStream 对象中的read（），读取客户端发送的数据
        byte [] bytesArr=new byte[1024];
        int len = socketInputStream.read(bytesArr);
        System.out.println(new String(bytesArr,0,len));
        //5.使用Socket对象的方法getOutputStream()，获取网络字节输出流OutputStream 对象
        OutputStream socketOutputStream = socket.getOutputStream();
        //6.使用网络字节输入流InputStream 对象中的read（），回写数据
        socketOutputStream.write("收到，谢谢".getBytes(StandardCharsets.UTF_8));
        //释放资源（Socket，ServerSocket）
        socket.close();
        serverSocket.close();
    }
}
