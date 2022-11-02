package demo68;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * jdk9新特性 (不如JDK7)   我这1.8版本的所以有问题
 * try的前边可以定义流对象，在try后边的（）中可以直接引入流对象的名称（变量名）
 * 在try代码执行完毕之后，流对象也可以释放掉，不用写finally
 * 格式：
 *          A a = new A();
 *          B b= new B();
 * try(a,b){
 * 	        可能会产出异常的代码
 *      }catch（异类变量 变量名）{
 * 	    异常处理逻辑
 *      }
 */
public class JDK9 {
    public static void main(String[] args) throws IOException {
//        FileReader reader = new FileReader("D:\\tmp\\FileTest\\FileTest.txt");
//        FileWriter writer = new FileWriter("D:\\tmp\\FileTest\\A.txt",true);
//        try(reader,writer){
//            char[] chars =new char[1024];
//            int tmp;
//            while((tmp=reader.read(chars)!=-1)){
//                writer.write(chars,0,tmp);
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }//自动关流
    }
}
