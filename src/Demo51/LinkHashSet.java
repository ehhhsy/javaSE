package Demo51;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
java。util。linkHashSet集合 extends HashSet集合
linkedHashSet集合的特点：
      【底层是一个哈希表（数据+链表/红黑树）加上链表：比hashSet多了一层链表（记录元素的存储顺序），包装元素有序【重点】】

 */
public class LinkHashSet {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("zbc");
        set1.add("ABC");
        set1.add("ABC");
        set1.add("zzz");
        System.out.println(set1);//HashSet[ABC, zbc, zzz] 无序，并不允许重复【重点】

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("zbc");
        set2.add("ABC");
        set2.add("ABC");
        set2.add("zzz");
        System.out.println(set2);//LinkedHashSet[zbc, ABC, zzz] 有序，不允许重复【重点】

        set2.remove("ABC");
        System.out.println(set2);
    }
}
