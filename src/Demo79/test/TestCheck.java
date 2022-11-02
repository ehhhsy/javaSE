package Demo79.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: hsy
 * @Date: 2022/10/22/19:45
 * @Description:简单的测试框架
 *          当主方法执行后会自动去执行被检测的所有方法判断方法有异常，记录到文件中   被检测：加了@check注解的方法
 *
 */
public class TestCheck {
    public static void main(String[] args) throws IOException {
        //1.创建计算器calculator对象
        Calculator calculator = new Calculator();
        //2.获取字节码文件对象
        Class calculatorClass = calculator.getClass();

        //3.获取所有的方法
        Method[] methods = calculatorClass.getMethods();
        //4.执行这些方法
        int num=0;  //出现异常的次数
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method : methods) {
                //5.判断方法上是否有@check注解
                //判断方法上是否有check注解
                if (method.isAnnotationPresent(Check.class)){
                    //有，执行
                    try {
                        method.invoke(calculator);
                    } catch (IllegalAccessException e) {
                        //6.扑获异常，记录到文件中

                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        //捕获异常
                        //在catch里创建文件，并发送信息到文件中
                        num++;
                        bufferedWriter.write(method.getName()+"方法出异常了");
                        bufferedWriter.newLine();
                        bufferedWriter.write("异常的名称"+e.getCause().getClass().getName());
                        bufferedWriter.newLine();
                        bufferedWriter.write("异常的原因"+e.getCause().getMessage());
                        bufferedWriter.newLine();
                        bufferedWriter.write("-------------------------------------");
                    }
                }
        }
        bufferedWriter.write("这是第"+num+"次出现异常");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
