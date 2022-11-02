package Demo54;

import java.lang.reflect.Array;
import java.util.List;

/*
    异常的注意事项：
//运行期的异常被抛出可以不处理，既不捕获，也不声明【重点】
//        hsy：刚才那两个都运行期异常，都可以不用写
    默认给虚拟机处理，终止程序，什么时候不抛出异常，在来继续执行
 */
public class Demo06 {
    public static void main(String[] args) {
        /*
        多个异常使用捕获又该如何处理呢？
            1.多个异常分别处理,         两个异常，写两次try，两次catch
            2.多个异常一次捕获，多次处理  两个异常，写一次try,下面写两次catch
            3.多个异常一次捕获一次处理    两个异常，catch的变量变成，最大的父类Exception，谁来我都可以处理【重点】
         */
//        1.多个异常分别处理,两个异常，写两个try
//        try {
//            int [] array={1,2,3};
//            System.out.println(array[3]);//ArrayIndexOutOfBoundsException
//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//        }
//
//        try{
//            List<Integer> list = List.of(1, 2, 3);
//            System.out.println(list.get(3));//ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//
//        }catch (ArrayIndexOutOfBoundsException e){
//           e.printStackTrace();
//        }
//        System.out.println("后续代码");

//===================================================================
//        2.多个异常一次捕获，多次处理
//        try{
//            List<Integer> list = List.of(1, 2, 3);
//            System.out.println(list.get(3));//ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//            int [] array={1,2,3};
//            System.out.println(array[3]);//ArrayIndexOutOfBoundsException
//        } catch (ArrayIndexOutOfBoundsException e){ //异常子类要写在父类上面【注意】
//            e.printStackTrace();
//        }catch (IndexOutOfBoundsException e){
//            e.printStackTrace();

        /*
        注意事项：一个try多个catch注意事项：
            catch里边定义的异常变量，如果子父类关系，【那么子类的异常必须写在上边，不然会报错】
         */
    //===================================================================
//        3.多个一次一次捕获一次处理
        try{
//            List<Integer> list = List.of(1, 2, 3);
//            System.out.println(list.get(3));//ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            int [] array={1,2,3};
            System.out.println(array[3]);//ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            e.printStackTrace();
            //全是Exception的子类，都可以处理
        }



}
}