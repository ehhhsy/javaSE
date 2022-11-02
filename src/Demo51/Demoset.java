package Demo51;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
java.unti.Set接口 extends Collentino接口
Set接口特点：
    1.不允许存储重复的元素
    2。没有索引，没有带索引的方法，也不能使用普通for循环遍历

    java.unti。hashSet集合 implement Set接口
     1.不允许存储重复的元素
     2。没有索引，没有带索引的方法，也不能使用普通for循环遍历
     3.是一个无序的集合
     4。底层是一个哈希表结构（查询的速度非常快）
 */
public class Demoset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(4);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
    }
