package Demo53;

import java.util.HashMap;
import java.util.Hashtable;

/*Hashtable【被HashMap取代了，但是他的子类properties还可以用）
public class Hashtable<K,V> implements Map<K,V>
Hashtable：底层是一个哈希表，是一个线程安全的集合，是单线程集合，速度慢
HashMap：  底层是一个哈希表，是一个线程不安全的集合，是多线程集合，速度快

Hashtable集合：不允许存储null值，null键
HashMap集合：（之前的所有学过的集合）允许重复null值，null键

properties是唯一和IO刘相结合的集合【注意】
 */
public class Demo05Hashtable {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
//        hashtable.put(null,null); 报错
//        System.out.println(hashtable);

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(null,11);
        hashMap.put(2222,null);
        hashMap.put(null,null);
        System.out.println(hashMap);//{null=null, 2222=null}
    }
}
