package Demo52;

import java.util.ArrayList;
import java.util.Collections;

/*          【工具类都是静态方法】
   java。until。Collections是集合工具类，用来对集合进行操作，部分方法如下：
        public static <T> boolean addAll（Collections c，T。。。elements）向集合添加一些元素
               格式：Collections.addAll(list,1,13,232,131,23,453);
        public static void shuffle（list<?> list)    打乱顺序，打乱集合的顺序
 */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //往集合里添加多个元素，用集合的【静态方法】addAll
        Collections.addAll(list,1,13,232,131,23,453);
        System.out.println(list);//[1, 13, 232, 131, 23, 453]


       //打乱顺序
        Collections.shuffle(list);
        System.out.println(list);//[1, 453, 131, 23, 13, 232]
    }
}
