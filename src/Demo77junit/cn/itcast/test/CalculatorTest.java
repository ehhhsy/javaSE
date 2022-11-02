package Demo77junit.cn.itcast.test;

import Demo77junit.cn.itcast.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author: hsy
 * @Date: 2022/10/19/20:58
 * @Description:创建Calculator测试类
 */
public class CalculatorTest {

    @Before
    /*
    初始化方法
     */
    public void init(){
        System.out.println("init....");
    }


    @After
    /*
      在所有测试方法执行之前都会自动执行该方法
     */
    public void close(){
        System.out.println("close.....");
    }


    /**
     * @description 测试 add方法
     */
    @Test
    public void testAdd(){
        System.out.println("我被执行了");
        //1.创建Calculator对象
        Calculator calculator = new Calculator();
        int result = calculator.sum(1, 2);
        System.out.println(result);
        //断言    我断言这个结果是3  （a=1，b=2 a+b）,断言成功绿色，断言失败红色
        Assert.assertEquals(3,result);

    }
}
