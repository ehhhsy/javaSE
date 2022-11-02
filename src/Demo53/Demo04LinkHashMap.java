package Demo53;

import java.util.LinkedHashMap;

/*      有序的  LinkedHashMap
public class LinkedHashMap<K,V> extends HashMap<K,V>
    底层原理：
    哈希表+链表（记录顺序）
 */
public class Demo04LinkHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put("aa","AA");
        linkedHashMap.put("bb","BB");
        linkedHashMap.put("cc","CC");
        linkedHashMap.put("aa","d");
        System.out.println(linkedHashMap);//key不允许重复，有序
        //{aa=d, bb=BB, cc=CC}


    }
}
