package Demo73;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 练习文件的下载，服务器上下载 input\test.png文件
 */
public class test_downloadSever {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket socket = serverSocket.accept();
        OutputStream socketOutputStream = socket.getOutputStream();
        FileInputStream fileInputStream = new FileInputStream("D:\\tmp\\input\\test.png");
        byte [] bytesArr=new byte[1024];
        int len=0;
        while((len=fileInputStream.read(bytesArr))!=-1){
            socketOutputStream.write(bytesArr,0,len);
        }
        socket.shutdownOutput();

        InputStream socketInputStream = socket.getInputStream();

        byte [] bytesArr2=new byte[1024];
        int len2=0;
        while((len2=socketInputStream.read(bytesArr2))!=-1){
            System.out.println(new String(bytesArr2,0,len2));
        }
        fileInputStream.close();
        serverSocket.close();
        socket.close();
    }
}
