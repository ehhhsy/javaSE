package Demo75;

import java.util.ArrayList;

/**
 * @Author: hsy
 * @Date: 2022/10/18/18:21
 * @Description:  传统方式过滤集合元素，并输出
 */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("张无忌");
        arraylist.add("周紫若");
        arraylist.add("赵敏");
        arraylist.add("张强");
        arraylist.add("张三丰");

        //只要开头只有张的元素，存储到一个新的集合中
        ArrayList<String> nameZhangList = new ArrayList<>();
        for (String name : arraylist) {
            if (name.startsWith("张")){
                nameZhangList.add(name);
            }
        }
        //对名字只有3个长度的过滤，
        ArrayList<String> length3List = new ArrayList<>();
        for (String name : nameZhangList) {
            if (name.length()==3){
                length3List.add(name);
            }
        }
        for (String s : length3List) {
            System.out.println(s);
        }



    }
}
