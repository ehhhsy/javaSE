package Demo73;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/*
    模拟B\S服务器
 */
public class Demo03BSserverSocket {
    public static void main(String[] args) throws IOException {
        //1.创建一个服务器，和系统指定端口
        ServerSocket serverSocket = new ServerSocket(8080);
        /**
         *  浏览器解析服务器回写的html界面，页面中如果有图片，那么浏览器就会单独的开启一个线程，读取服务器的图片
         *  我们可以让服务器一直处于监听状态，客户端请求一个，服务器就回写一次  （死循环+线程）
         * */
        //2.使用accpet方法获取客户端对象（浏览器）
        Socket  socket= serverSocket.accept();
        //获取网络字节InputStream输入流对象
        while(true){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream socketInputStream = socket.getInputStream();

                        //重点！！   把网络字节输入流对象转化为字节缓存输入流    ！！！！
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socketInputStream));
                        //读取一行   GET /web/index.html HTTP/1.1
                        String first_Line = bufferedReader.readLine();
                        //读取信息进行切割，只要中间部分  /web/index.html
                        String[] arr = first_Line.split(" ");
                        String address = arr[1].substring(1);
                        //把/web/index.html  ，去掉前面的/  剩下web/index.html
                        System.out.println(address);

                        //创建本地字节输入流，绑定html路径
                        FileInputStream fileInputStream = new FileInputStream("D:\\work_space\\java-workspace\\AA\\web\\index.html");
                        //使用socketOutputStream，回写给浏览器
                        OutputStream socketOutputStream = socket.getOutputStream();

                        /**固定三行，写入http协议响应头*/
                        socketOutputStream.write("HTTP/1.1 200 OK\r\n".getBytes(StandardCharsets.UTF_8));
                        socketOutputStream.write("Content-Type:text/html\r\n".getBytes(StandardCharsets.UTF_8));
                        /** 必须要写入空格，否则浏览器不解析*/
                        socketOutputStream.write("\r\n".getBytes(StandardCharsets.UTF_8));

                        //一读一写复制文件，把服务器读取的文件回写客户端
                        byte [] bytesArr=new byte[1024];
                        int len=0;
                        while((len=fileInputStream.read(bytesArr,0,len))!=-1){
                            socketOutputStream.write(bytesArr,0,len);

                        }
                        //释放资源
                        fileInputStream.close();
                        socket.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }).start();
        }
//        serverSocket.close(); 服务器就不用停止了


    }
    //http://127.0.0.1/index.html
}
