package Demo72;
/*
        文件上传
 */
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class demo02FileLoadServerSocket {
    public static void main(String[] args) throws IOException {
        //创建ServerSocket对象，和系统要指定的端口号
        ServerSocket serverSocket = new ServerSocket(666);
        //ServerSocket.accpet（）,获取客户端Socket对象
        Socket socket = serverSocket.accept();
        ////Socket.getInputStream,获取到网络字节输入流InputStrem对象
        InputStream socketInputStream = socket.getInputStream();
        //判断目标文件夹是否存在，
        String outFile="D:\\tmp\\output1";
        File file = new File(outFile);
        if (!file.exists()){
            file.mkdir();
        };
        //创建一个FileOutputStream对象，构造方法中绑定要输出的目的地
        FileOutputStream fileOutputStream = new FileOutputStream(file+"\\11111111122.jpg");
        //使用网络字节输入流InputStrem.read（），读取客户端文件
        byte [] bytesArr=new byte[1024];
        int len;
        while ((len=socketInputStream.read(bytesArr))!=-1){
            //使用FileOutputStream.write（），保存到服务器的硬盘上
            fileOutputStream.write(bytesArr,0,len);
        }

        //Socket.getOutputStream（），获取到网络字节输出流OutputStrem对象
        OutputStream socketOutputStream = socket.getOutputStream();
        //OutputStrem.wirte（），回写服务器，告诉上传成功！
        socketOutputStream.write("上传成功".getBytes());
        System.out.println("3333333333");
        //释放资源（FileInputStream，Socket，ServerSocket）
        fileOutputStream.close();
        serverSocket.close();
        socket.close();
    }
}
