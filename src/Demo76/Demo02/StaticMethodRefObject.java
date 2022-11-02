package Demo76.Demo02;

/**
 * @Author: hsy
 * @Date: 2022/10/19/16:34
 * @Description 通过类名引用静态成员方法
 *              类存在，静态成员方法也已经存在
 *              就可以通过类名直接引用静态成员方法
 */
public class StaticMethodRefObject {
    public static void main(String[] args) {
        //调用method方法，创建计算绝对值的整数和lambda表达式
        double d = method(-3.21, (num) -> {
            return Math.abs(num);
        });
        System.out.println(d);

        /**
         使用方法引用优化
         Math类是存在的
         abs计算值的静态方法也是已经存在的
         所以我们可以直接通过类名::静态方法   来引用
         */
        System.out.println(method(-2.6,Math::abs));

    }
    ////定义一个方法，方法参数传递要计算的数字，和函数式接口calcable
    public static double method(double num,Calcable calcable){
        return   calcable.abs(num);
    }
}
