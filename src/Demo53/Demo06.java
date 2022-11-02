package Demo53;

import java.util.List;
import java.util.Set;

/*
jdk9新特性:
    [list,set,map接口]:里面增加了一个静态方法of,可以一次性添加多个元素
    使用前提:
        当集合中存储的元素的个数已经确定了,不在改变时使用使用   hsy:就是不能再增加了

    注意:
        1.of方法只是用于list,set,map接口[不适用于接口的实现类]            [注意]
        2.of的返回值是一个不能改变的集合,集合不能在使用add,put方法添加元素了
        3.set接口和map接口在调用of方法的时候,不能有重复的元素
 */
public class Demo06 {
    public static void main(String[] args) {
//        List<String> list=List.of("a","b","c");
//        System.out.println(list);//[a, b, c]
//        list.add("aa");  //报错.不能添加了

//        Set<Integer> set=Set.of(1,1,2,3,4,5);IllegalArgumentException,不能有重复的
//        Set<Integer> set=Set.of(1,2,3,4,5);
//        System.out.println(set);
//        ....
    }
}
