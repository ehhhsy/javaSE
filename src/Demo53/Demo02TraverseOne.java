package Demo53;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Map集合的一种遍历方式：
        通过键找值的方式：
            Set<K> keySet()返回此映射中包含的键的Set视图
    实现步骤：
        1.使用Map集合中的方法keySet（），把Map集合所有的键取出来，放在Set集合中
        2.遍历Set集合：获取Map集合中的每一个Key
        3.

 */
public class Demo02TraverseOne {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖",165);
        map.put("baby",168);
        map.put("杨幂",170);
        Set<String> set = map.keySet();
    //        for (String s:set      //使用增强for循环遍历
        for (String s:map.keySet()   //优化版
             ) {
            System.out.println(s+"  "+map.get(s));//赵丽颖  165
//                                                  杨幂  170
//                                                  baby  168
        }
        System.out.println(map);
    }
}
