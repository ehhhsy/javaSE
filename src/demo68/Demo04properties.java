package demo68;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/*
* java.util.Properties extends HashTable<k,v> implements Map<k,v>
  Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。

  * Properties集合是唯一和IO流结合的集合
  *     可以使用Properties集合中的store，把集合中的临时数据,持久化到硬盘中
  *     可以使用Properties集合中的load，把硬盘中保存的文件(键与值),读取到集合中使用
  *
  * 属性列表中每个键及其对应值都是一个字符串。
  *     Properties集合是一个双列集合，key和value默认是字符串
  *
* */
public class Demo04properties {
    public static void main(String[] args) {
        show01();

    }
        /**
         使用Properties集合存储数据，遍历Properties集合中的数据
         Properties集合有一些操作字符串的方法
         Object setProperty(String key, String value) 调用 Hashtable 的方法 put。
         String getProperty(String key) 用通过Key找到Value   === map集合的get(key)方法
         set< String> stringPropertyNames()  返回此属性列表中的键集，其中该键及其对应值是字符串，  === map集合是keySet()方法
         */
    private static void show01() {
        Properties properties = new Properties();
        // 调用setProperty方法 添加元素
        properties.setProperty("吴亦凡","5000");
        properties.setProperty("王力宏","6000");
        properties.setProperty("李易峰","7000");

        //stringPropertyNames()把key取出放在set集合中  === map集合是keySet()方法
        Set<String> set = properties.stringPropertyNames();
        for (String key : set) {
            System.out.println(key+"=="+properties.getProperty(key));
        }
    }
}
