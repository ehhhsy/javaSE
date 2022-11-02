package demo68;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * JDK7新特性
 * 在try的后边可以增加一个（），在括号中可以定义流对象，那么这个流对象的作用域在try中有效
 * try中的代码执行完毕，会自动把流对象释放，不用写Finally
 * 格式：
 * try(定义流对象;定义流对象){
 * 	    可能产生异常的代码
 *  }catch（异类变量 变量名）{
 * 	    异常处理逻辑
 *  }
 */
public class JDK7 {
    public static void main(String[] args) {
        try(
                FileReader reader = new FileReader("D:\\tmp\\FileTest\\FileTest.txt");
                FileWriter writer = new FileWriter("D:\\tmp\\FileTest\\A.txt",true);
        ){
            int tmp;
            char [] charsArr=new char[1024];
            while((tmp=reader.read(charsArr))!=-1){
                writer.write(charsArr,0,tmp);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
