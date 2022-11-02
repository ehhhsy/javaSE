package Demo74;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 如果一个方法的返回值类型是一个函数式接口，那么可以返回一个lambda表达式
 * 当需要通过一个方法来获取java.util.Comparator接口类型的对象作为排序器时，可以调用此方法
 */
public class demo05 {
    public static void main(String[] args) {
        String [] arr={"aaaaaa","world","java222","hello"};
        System.out.println("排序前"+Arrays.toString(arr));     ///[aaaaaa, world, java222, hello]
        Comparator<String> comparator = getComparator();
        Arrays.sort(arr,comparator);
        System.out.println("排序后"+Arrays.toString(arr));     //[java222, aaaaaa, world, hello]

    }
    //定义一个方法，方法的返回值类型
    public static Comparator<String> getComparator(){
        //方法的返回值类型是一个接口，我们可以返回这个接口的匿名内部类
         return new Comparator<String>() {
             @Override
             public int compare(String o1, String o2) {
                 //按住字符串的长度降序排序
                 return o2.length()-o1.length();
             }
         };
         //方法的返回值类型是一个函数式接口，我们可以返回lambda表达
//            return (String o1,String o2)->{
//                //按照字符串的降序排序
//                return o2.length()-o1.length();
//            };
    }
}
