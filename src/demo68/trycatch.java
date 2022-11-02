package demo68;

import java.io.FileWriter;
import java.io.IOException;

/**
 try catch finally 处理IO流的异常
 格式：
    try{
         //可能会产生异常的代码
 }catch（）{
    异常的处理逻辑
 }finally{
    一定会指定的代码
    资源释放
 }

 */
public class trycatch {
    public static void main(String[] args) {
        //在外面定义
        FileWriter fileWrite=null;
        try {
            //可能会产生异常的代码
            FileWriter fileWriter = new FileWriter("w:\\777.txt", true);
            for (int i = 0; i < 10; i++) {
                //异常的处理逻辑
                fileWriter.write("hello 小"+i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            // 一定会指定的代码
            //创建对象失败了，filewriter的默认值为null，null是不能调用close方法的，所以会引发NullPointerException
//            需要增加一个判断，不是null就把资源释放
            if(fileWrite!=null){
                try {
                    //close方法本身有异常，所以要try catch / throw
                    fileWrite.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
