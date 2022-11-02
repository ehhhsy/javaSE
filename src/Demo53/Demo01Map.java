package Demo53;

import java.util.HashMap;

/*
    java。until。Map<k,v>j集合
    Map集合的特点：
        1.Map集合是一个双列集合，一个元素包含两个值（一个key，一个value）
        2.Map集合中的元素，key和value的数据类型，可以相同，也可以不同
        3.Map集合中的元素，key是不允许重复的，value是可以重复的
        4.Map集合中的元素，key和value是一对的

    HashMap集合的特点：
        1.hashmap集合底层是哈希值，查询的数据特别快。
            数组+单向链表/红黑树（链表的长度超过8）
        2.hashmap集合是一个【无序的集合】

    java。until。LinkHashMap<k,v>集合 extends HashMap<k,p>集合
        LinkHashMap的特点：
            1.LinkHashMap底层是哈希表+链表（多一层链表（保证元素的顺序））
            2.LinkHashMap集合是一个【有序的集合】

       常用方法:
       public V put(K key, V value) 将指定的键和值添加到集合中
       public V remove(Object key)删除指定元素
       public V get(Object key)根据指定的key，在Map集合中获取对应的值,
       public boolean containsKey(Object key) 判断集合中是否包含指定的键
 */
public class Demo01Map {
    public static void main(String[] args) {
        dom01();
        System.out.println("=========");
        dmo02();
        System.out.println("=========");
        dmo03();
    }

//                  k不可以重复，v可以重复 【注意】

    //        public V put(K key, V value) 将指定的键和值添加到集合中
//          返回值:v
//                存储值对的时候，key没有重复，返回值是null
//                存储值对的时候，key重复，会用新的value替换map中的value，返回被替换的value
    private static void dom01() {
        HashMap<String, String> stringHashMap = new HashMap<String, String>();
        String s1 = stringHashMap.put("zzz", "ccc11");
        System.out.println("v1=" + s1);//没有重复，返回null

        String s2 = stringHashMap.put("zzz", "ccc22");
        System.out.println("v1=" + s2);//重复，返回的是被替换的  v1=ccc11

        System.out.println(stringHashMap);//{zzz=ccc22}  重写了toSting方法

        stringHashMap.put("杨过", "小龙女");
        stringHashMap.put("hhhhh", "ssss");
        stringHashMap.put("尹志平", "小龙女");
        System.out.println(stringHashMap);
        //{杨过=小龙女, hhhhh=ssss, 尹志平=小龙女, zzz=ccc22}
    }
//========================================================================
    private static void dmo02() {
//        public V remove(Object key)删除指定元素
//          返回值:V
//            key存在，v返回被删除的元素
//              key不存在,返回null
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("赵丽颖",165);
        map2.put("baby",168);
        map2.put("杨幂",170);
        System.out.println(map2);

        Integer remove1 = map2.remove("杨幂");//删除key  杨幂
        System.out.println(remove1);//170
        System.out.println(map2);

        Integer remove2 = map2.remove("黄辉锑");
        System.out.println(remove2);//null 没有这个人
        System.out.println("=========");
//       public V get(Object key)根据指定的key，在Map集合中获取对应的值,
//            返回值：
//                    key存在返回，返回value值
//                      key不存在,返回null
        Integer baby = map2.get("baby");
        System.out.println(baby);//168  返回value值

        Integer a = map2.get("迪丽热巴");
        System.out.println(a);//null  返回null
        System.out.println("=========");
        /*
    public boolean containsKey(Object key) 判断集合中是否包含指定的键
    包含就返回true,不包含就返回false
         */
        boolean b1 = map2.containsKey("赵丽颖");
        System.out.println(b1);//true  包含

        boolean b2 = map2.containsKey("王思成");
        System.out.println(b2);// false    不包含
    }
//========================================================================


    private static void dmo03() {

   }
}