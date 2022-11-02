package Demo79.test;

/**
 * @Author: hsy
 * @Date: 2022/10/22/19:37
 * @Description:
 */
public class Calculator {
    @Check
    public void add(){
        System.out.println("1+0 = "+(1+0));
    }
    @Check
    public void sub(){
        System.out.println("1-0 = "+(1-0));
    }
    @Check
    public void mul(){
        System.out.println("1*0 = "+(1*0));
    }
    @Check
    public void div(){
        System.out.println("1/0 = "+(1/0)); //有异常
    }
    public void show(){
        System.out.println("what the f**k");
    }
}
