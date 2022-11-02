package Demo28;
 import java.lang.reflect.Array;
 import java.util.Arrays;
/*
java.util.Array是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作

  hsy:调用格式： Arrays.方法名（数组）
  public static String toString(数组)：将参数数组变成字符串                  【静态方法】直接通过类名.调用！！！！！！！！！！！！！
  （按照默认格式：[2, 32, 131, 23]..
  public static void sort(数组）：按照默认升序（从小到大）对数组的元素进行排序。

   备注：如果是数值，sort默认按照从小到大
        如果是字符串，sort默认字母升序
        如果是自定义的类型，那么这个自定义的类需要comparable或者Comparator接口的支持（今后学习）

 */
public class Demo05Arrays {
    public static void main(String[] args) {
        int [] array ={2,32,131,23};
      String a;
//        将int变成默认格式
        a = Arrays.toString(array);
        System.out.println(a);  //[2, 32, 131, 23]

        Arrays.sort(array); //调用sort方法进行排序
        System.out.println(Arrays.toString(array)); //[2, 23, 32, 131]

      String [] array2={"zzz","bbb","ccc"};
        Arrays.sort(array2);         // 如果是字符串，sort默认字母升序
        System.out.println(Arrays.toString(array2));  //[bbb, ccc, zzz]

    }
}
