package Demo76;

/**
 * @Author: hsy
 * @Date: 2022/10/19/15:25
 * @Description: 方法的引用使用lambda表达式
 */
public class Demo01 {
    public static void main(String[] args) {
     //定义一个方法，参数传递函数式接口Demo01Interface
     print(result-> System.out.println("hello_hsy"));
    }
    static void print(Demo01Interface demo01Interface){
        demo01Interface.println("hello_world");
    }
}
