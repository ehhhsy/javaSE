package Demo79.pro;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Author: hsy
 * @Date: 2022/10/21/18:37
 * @Description: 设计一个框架
 *         框架类
 */

@pro(className = "Demo79.pro.animal",methodName = "show")

public class Demo05ReflectTest {
    public static void main(String[] args) throws Exception {
        //不能改变该类的任何代码的前提下，可以创建任意类的对象，可以执行任意方法

        //1.解析注解
        //1.1获取该类的字节码文件对象
        Class<Demo05ReflectTest> reflectTestClass = Demo05ReflectTest.class;
        //2.获取上边的注解对象
        pro pro = reflectTestClass.getAnnotation(pro.class);
        //调用注解对象中定义了抽象方法，获取返回值
        ////为什么注解对象可以调用方法呢，其实再内存中生成了一个该注解的接口的子类实现对象
        //生成的注解子类对象，如：public class ProImpl implements pro{};


        //3.调用注解对象中定义了抽象方法，获取返回值
        String className = pro.className();
        String methodName = pro.methodName();
        System.out.println(className);
        System.out.println(methodName);

        //5.加载该类进入内存
        Class<?> cls = Class.forName(className);
        //创建对象
        Object obj = cls.newInstance();
        //执行方法
        Method clsMethod = cls.getMethod(methodName);
        clsMethod.invoke(obj);
    }
}
