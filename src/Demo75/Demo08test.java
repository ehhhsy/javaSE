package Demo75;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author: hsy
 * @Date: 2022/10/18/21:37
 * @Description:  使用传统处理集合
 */
public class Demo08test {
    public static void main(String[] args) {
        ArrayList<String> arrayList_1 = new ArrayList<>();
        Collections.addAll(arrayList_1,"迪丽热巴","宋远桥","苏星河","石破天","老子","庄子","韩非子","王力宏");
        ArrayList<String> arrayList_2 = new ArrayList<>();
        Collections.addAll(arrayList_2,"古力娜扎","张无忌","赵丽颖","张三丰","尼古拉斯赵四","吴亦凡","张二狗");

        //1.第一个队伍只要名字为3的成员名字，存储到新的集合中
        ArrayList<String> arrayList_3 = new ArrayList<>();
        for (String name : arrayList_1) {
            if (name.length()==3){
                arrayList_3.add(name);
            }
        }
        System.out.println(arrayList_3);
        //2.名字为3的队伍只要前三个
        ArrayList<String> skipAarray = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
                skipAarray.add(arrayList_3.get(i));
        }
        System.out.println(skipAarray);
//        ================第二只队伍=========
        //3.只要姓张的
        ArrayList<String> arrayList_4 = new ArrayList<>();
        for (String name : arrayList_2) {
            if (name.startsWith("张")){
                arrayList_4.add(name);
            }
        }
        System.out.println(arrayList_4);
        ArrayList<String> arrayList_5 = new ArrayList<>();
        //4.姓张的不要前两个
        for (int i=2;i<arrayList_4.toArray().length;i++){
            arrayList_5.add(arrayList_4.get(i));
        }
        System.out.println(arrayList_5);

        //5.两张队伍合并，存储到新的集合
        ArrayList<String> arrayList_6 = new ArrayList<>();
        arrayList_6.addAll(skipAarray);
        arrayList_6.addAll(arrayList_5);
        System.out.println(arrayList_6);

        //6.根据名字创建Person对象，存储到一个新的集合中
        ArrayList<Person> arrayList_7 = new ArrayList<>();
        for (String name : arrayList_6) {
            arrayList_7.add(new Person(name));
        }
        System.out.println(arrayList_7);
    }

}
