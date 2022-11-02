package Demo73;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 文件的下载： 从服务器接收到的文件，放在output\download1111.png
 */
public class test_downloadSocket {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 6666);
        InputStream socketInputStream = socket.getInputStream();
        byte [] bytes =new byte[1024];
        int read_bytes=0;
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\tmp\\output\\download1111.png");
        while ((read_bytes=socketInputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,read_bytes);
        }
        OutputStream socketOutputStream = socket.getOutputStream();
        socketOutputStream.write("文件下载成功".getBytes());
        fileOutputStream.close();
        socket.close();
    }
}
