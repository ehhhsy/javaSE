package Demo73;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;

/**
 *  服务器模拟   2022.10.13
 */
public class test_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1006);
/**
 * 服务器一直循环
 */
        while(true){
            Socket socket = serverSocket.accept();
            /**
             * 多线程,优化效率
             */
        new Thread(new Runnable() {
            @Override
            public void run() {
                FileOutputStream fileOutputStream=null;
                try {
                InputStream socketInputStream = socket.getInputStream();


                File file = new File("d:\\tmp\\out2");
                if (!file.exists()){
                    file.mkdir();
                }
                    Calendar calendar = Calendar.getInstance();
                    /**
                     * 保证文件名不重复
                     */
                    String fileName=file.getAbsolutePath()+File.separator+calendar.get(Calendar.MINUTE)+"_"+calendar.get(Calendar.SECOND)+".jpg";
                System.out.println();
                 fileOutputStream= new FileOutputStream(fileName);
                byte [] bytesArr=new byte[1024];
                int len=0;
                while((len=socketInputStream.read(bytesArr))!=-1){
                    fileOutputStream.write(bytesArr,0,len);
                }
                OutputStream socketOutputStream = socket.getOutputStream();
                socketOutputStream.write("上传成功！！！".getBytes(StandardCharsets.UTF_8));
                fileOutputStream.close();
            }catch (IOException e){
                    e.printStackTrace();
                }finally {
                    try {
                        if(fileOutputStream!=null){
                            fileOutputStream.close();
                            socket.close();
                        }
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    //                serverSocket.close(); 服务器不用关了
        }
    }
}
