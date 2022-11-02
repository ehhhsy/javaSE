package Demo51;

import java.util.HashSet;

/*
set集合不允许存储重复元素的原理  //看图
【重点】 Set集合在调用add方法的时候，add方法会调用元素的hashCode方法和equals方法，判断元素是否重复
  hashCode查哈希值，equals判断字符串内容是否相等
 */
public class Demo03HashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String s1="abc";
        String s2="abc";
        set.add(s1);
        set.add(s2);

        set.add("通话");
        set.add("重地");
        System.out.println(set);
//        [通话, 重地, abc]
    }
}
