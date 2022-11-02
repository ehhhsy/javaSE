package Demo75;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * @Author: hsy
 * @Date: 2022/10/19/14:59
 * @Description: 使用Stream流，处理集合
 */
public class Demo09test {
    public static void main(String[] args) {
        ArrayList<String> arrayList_1 = new ArrayList<>();
        Collections.addAll(arrayList_1,"迪丽热巴","宋远桥","苏星河","石破天","老子","庄子","韩非子","王力宏");
        ArrayList<String> arrayList_2 = new ArrayList<>();
        Collections.addAll(arrayList_2,"古力娜扎","张无忌","赵丽颖","张三丰","尼古拉斯赵四","吴亦凡","张二狗");

        Stream<String> stringStream_1 = arrayList_1.stream();
        //1.第一个队伍只要名字为3的成员名字，存储到新的集合中
        Stream<String> stringStream_2 = stringStream_1.filter(name -> name.length() == 3).limit(3);
        //2.名字为3的队伍只要前三个
        Stream<String> stringStream_3 = stringStream_2.limit(3);

//        第二支队伍=========================
        //3.只要姓张的
        Stream<String> stringStream_4 = arrayList_2.stream();
        Stream<String> stringStream_5 = stringStream_4.filter(name -> name.startsWith("张")).skip(2);
        //4.姓张的不要前两个
        Stream<String> stringStream_6 = stringStream_5.skip(2);

        //5.两个集合放一起然后输出
        Stream<String> stringStream_Sum = Stream.concat(stringStream_3, stringStream_6);


        //6.根据名字创建Person对象，存储到一个新的集合中
        stringStream_Sum.map(str -> {
            Person person = new Person(str);
            return person;
        }).forEach(System.out::println);

        System.out.println("==========================================");
    }
}
