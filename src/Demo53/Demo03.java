package Demo53;

import java.util.HashMap;
import java.util.Set;

/*
HashMap存储自定义类型键值
map集合保证key是唯一的：
    作为key的元素，必须从写hashCode方法和equals方法，以保证key唯一
 */
public class Demo03 {
    public static void main(String[] args) {
      show1();
    }

    private static void show1() {
        /*
        HashMap存储自定义类型键值
        key：String类型
            String类从写了HashCode方法和equals方法，可以保证key唯一
        value：Person类型
             value可以重复（同年龄，同名视为同一个）【注意这是Person类没有重写HashCode方法和equals方法       */
        HashMap<String, Person> map = new HashMap<>();
        map.put("北京",new Person("张三",15));
        map.put("深圳",new Person("张三",15));
        map.put("海南",new Person("李四",19));
        map.put("北京",new Person("赵六",18));
        Set<String> set = map.keySet();
        for (String s : set) {
            Person value = map.get(s);//value
            System.out.println(s+" "+value);
        }

    }
}
