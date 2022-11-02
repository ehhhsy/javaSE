package Demo75;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @Author: hsy
 * @Date: 2022/10/18/18:31
 * @Description: 使用流
 */
public class Demo02 {
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("张无忌");
        arraylist.add("周紫若");
        arraylist.add("赵敏");
        arraylist.add("张强");
        arraylist.add("张三丰");

        //只要开头只有张的元素
        //对名字只有3个长度的过滤
        //遍历集合
        Stream<String> stringStream = arraylist.stream();
        stringStream.filter((name)->{
            return name.startsWith("张")&& name.length()==3;
        }).forEach((name)->{
            System.out.println(name);
        });
    }
}
