package Demo75;

import javax.print.DocFlavor;
import java.util.*;
import java.util.stream.Stream;

/**
 * @Author: hsy
 * @Date: 2022/10/18/19:40
 * @Description:
 */
public class Demo03 {
    public static void main(String[] args) {
         //把list转化为stream流
        ArrayList<String> arrayList = new ArrayList<>();
        Stream<String> stringStream_1 = arrayList.stream();
        //把Set转化为stream流
        HashSet<String> hashSet = new HashSet<>();
        Stream<String> stringStream_2 = hashSet.stream();

        HashMap<String, String> hashMap = new HashMap<>();
        //1.获取key     把key转化为stream流
        Set<String> keySet = hashMap.keySet();
        //2.把keySet转化为stream流
        Stream<String> stringStream_3 = keySet.stream();

        //1.获取值     把value转化stream流
        Collection<String> values = hashMap.values();
        //2.把存放着value的Collection 转化为stream流
        Stream<String> stringStream_4 = values.stream();

        //1.获取key,和value  把key和value转化为stream流
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        for (Map.Entry<String, String> stringStringEntry : entrySet) {
         //把key,value转化为stream流
            Stream<Map.Entry<String, String>> stream = entrySet.stream();
        }

        //把数组转化为stream流
        Stream<Integer> integerStream_1 = Stream.of(1, 2, 3, 4, 5);
        int [] arr={2,3,4,5,6};
        Stream<int[]> integerStream_2 = Stream.of(arr);
        String [] arr2={"hhh","xixi","lala"};
        Stream<String> stringStream = Stream.of(arr2);
    }
}
