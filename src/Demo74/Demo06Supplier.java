package Demo74;

import java.util.function.Supplier;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hsy
 * @Date: 2022/10/15/20:52
 * @Description: 常用的函数式接口 -- Supplier   java.until.function下 提供了很多函数式接口
 */
public class Demo06Supplier {
    public static void main(String[] args) {
        //Supplier是一个函数式接口,可以使用lambda表达式
        String string = getString(() -> {
            //生成一个字符串并返回;
            return "晓白";
        });
        System.out.println(string);

        //优化
        String string_2 = getString(() -> "小白2");
        System.out.println(string_2);
    }
    /**
     * @description 定义一个方法,方法参数传递一个Supplier接口泛型是<String>,执行get()方法就会返回一个String
     * @param supplier:
     * @return String
     * @author hsy
     * @date 2022/10/15 21:00
     */
    protected static String getString(Supplier<String> supplier){
        return supplier.get();
    }
}
