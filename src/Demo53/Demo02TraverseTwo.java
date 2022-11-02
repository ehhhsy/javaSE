package Demo53;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map集合的第二种遍历方式：
        通过Entry对象遍历的方式：
            Set<Map.Entry<K, V>> entrySet();
    实现步骤：
        1.使用Map集合中的方法entrySet();把Map集合中多个Entry对象取出来，存储在Set集合中
        2.遍历Set集合：获取Map集合中的每一个Entry对象 【用迭代器遍历更好】
        3.通过Entry对象中的方法getKey（）和getValue获取键与值

 */
public class Demo02TraverseTwo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖",165);
        map.put("baby",168);
        map.put("杨幂",170);
//        1.使用Map集合中的方法entrySet();把Map集合中多个Entry对象取出来，存储在Set集合中
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        //迭代器
        Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
        while(iterator.hasNext()){
            // 2.遍历Set集合：获取Map集合中的每一个Entry对象
            Map.Entry<String, Integer> entry = iterator.next();
            //3.通过Entry对象中的方法getKey（）和getValue获取键与值
            System.out.println(entry.getKey()+entry.getValue());
        }

        System.out.println("===========================");
    }
}
