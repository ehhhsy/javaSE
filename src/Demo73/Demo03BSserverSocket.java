package Demo73;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/*
    ģ��B\S������
 */
public class Demo03BSserverSocket {
    public static void main(String[] args) throws IOException {
        //1.����һ������������ϵͳָ���˿�
        ServerSocket serverSocket = new ServerSocket(8080);
        /**
         *  �����������������д��html���棬ҳ���������ͼƬ����ô������ͻᵥ���Ŀ���һ���̣߳���ȡ��������ͼƬ
         *  ���ǿ����÷�����һֱ���ڼ���״̬���ͻ�������һ�����������ͻ�дһ��  ����ѭ��+�̣߳�
         * */
        //2.ʹ��accpet������ȡ�ͻ��˶����������
        Socket  socket= serverSocket.accept();
        //��ȡ�����ֽ�InputStream����������
        while(true){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream socketInputStream = socket.getInputStream();

                        //�ص㣡��   �������ֽ�����������ת��Ϊ�ֽڻ���������    ��������
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socketInputStream));
                        //��ȡһ��   GET /web/index.html HTTP/1.1
                        String first_Line = bufferedReader.readLine();
                        //��ȡ��Ϣ�����иֻҪ�м䲿��  /web/index.html
                        String[] arr = first_Line.split(" ");
                        String address = arr[1].substring(1);
                        //��/web/index.html  ��ȥ��ǰ���/  ʣ��web/index.html
                        System.out.println(address);

                        //���������ֽ�����������html·��
                        FileInputStream fileInputStream = new FileInputStream("D:\\work_space\\java-workspace\\AA\\web\\index.html");
                        //ʹ��socketOutputStream����д�������
                        OutputStream socketOutputStream = socket.getOutputStream();

                        /**�̶����У�д��httpЭ����Ӧͷ*/
                        socketOutputStream.write("HTTP/1.1 200 OK\r\n".getBytes(StandardCharsets.UTF_8));
                        socketOutputStream.write("Content-Type:text/html\r\n".getBytes(StandardCharsets.UTF_8));
                        /** ����Ҫд��ո񣬷��������������*/
                        socketOutputStream.write("\r\n".getBytes(StandardCharsets.UTF_8));

                        //һ��һд�����ļ����ѷ�������ȡ���ļ���д�ͻ���
                        byte [] bytesArr=new byte[1024];
                        int len=0;
                        while((len=fileInputStream.read(bytesArr,0,len))!=-1){
                            socketOutputStream.write(bytesArr,0,len);

                        }
                        //�ͷ���Դ
                        fileInputStream.close();
                        socket.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }).start();
        }
//        serverSocket.close(); �������Ͳ���ֹͣ��


    }
    //http://127.0.0.1/index.html
}
