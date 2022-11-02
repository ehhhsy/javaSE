package Demo78reflect;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Author: hsy
 * @Date: 2022/10/21/18:37
 * @Description: 设计一个框架
 *框架类
 */
public class Demo05ReflectTest {
    public static void main(String[] args) throws Exception {
        //不能改变该类的任何代码的前提下，可以创建任意类的对象，可以执行任意方法

        //1.加载配置文件
        //1.1创建Properties对象
        Properties properties = new Properties();
        //1.2加载配置文件，转化为一个集合
        //1.2.1获取class目录下的配置文件,class.getClassLoader 类加载器！！！！！
        ClassLoader classLoader = Demo05ReflectTest.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("pro.properties");
        properties.load(inputStream);

        //2.获取配置文件配置文件中定义的数据 根据配置文件中的className获取Demo78reflect.Person.....
        String property_ClassName = properties.getProperty("className");  //Demo78reflect.Person
        String property_Method = properties.getProperty("methodName");   //Sleep

        //3.加载该类进内存
        Class<?> cls = Class.forName(property_ClassName);
        //4.创建对象
        Object o = cls.newInstance();
        //5.获取方法对象
        Method method = cls.getMethod(property_Method);
        //执行方法
        method.invoke(o);
    }
}
