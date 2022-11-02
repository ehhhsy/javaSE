package Demo73;
/*
        文件上传案例优化
 */
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class demo02FileLoadServerSocket {
    public static void main(String[] args) throws IOException {
        //创建ServerSocket对象，和系统要指定的端口号
        ServerSocket serverSocket = new ServerSocket(666);

        /** 优化2
         * 让服务器一直处于监听状态  (死循环accept方法)
         * 有一个客户端上传文件，就保存一个文件
         */
        while(true){
            //ServerSocket.accpet（）,获取客户端Socket对象
            Socket socket = serverSocket.accept();
            /** 优化3
             *  使用多线程，提高效率
             *  有一个客户端上传文件，就开启一个线程，完成文件的上传
             */
            new Thread(new Runnable() {
                /** 在线程中，完成文件的上传*/
                @Override
                public void run() {
                    /**注意事项，接口的方法没有声明抛出异常，子类重写方法时，也不能声明抛出，只能try catch*/
                    try{
                        ////Socket.getInputStream,获取到网络字节输入流InputStrem对象
                        InputStream socketInputStream = socket.getInputStream();
                        //判断目标文件夹是否存在，
                        String outFile="D:\\tmp\\output1";
                        File file = new File(outFile);
                        if (!file.exists()){
                            file.mkdir();
                        };
                        /** 优化1
                         * 自定义一个文件命名规则：防止同名的文件被覆盖掉
                         * 规则：域名+毫秒值+随机数
                         */
                        String fileName="itcast"+System.currentTimeMillis()+new Random().nextInt(9999)+".jpg";
                        //创建一个FileOutputStream对象，构造方法中绑定要输出的目的地
                        FileOutputStream fileOutputStream = new FileOutputStream(file+File.separator+fileName);
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
                        fileOutputStream.close();
                        socket.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }).start();

        }
       //服务器就不用关闭了
        // serverSocket.close();
    }
}
