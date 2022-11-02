package Demo50;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*

    list接口带索引的方法（特有的方法）
public void add(int index, E element)
          在列表的指定位置插入指定元素（可选操作）。
public E get(int index)
          返回列表中指定位置的元素。
public E remove(int index)
          移除列表中指定位置的元素（可选操作）。
public E set(int index, E element)
          用指定元素替换列表中指定位置的元素（可选操作）。
     注意：操作索引的时候，要防止索引越界异常
 */
public class Demo01List {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add("a");
        System.out.println(list1);

//        public void add(int index, E element):在列表的指定位置插入指定元素（可选操作）。
           //在c和d之间添加元素
           list1.add(3,"水水水");
        System.out.println(list1);

//        public E remove(int index)移除列表中指定位置的元素（可选操作）。
         //把最后一个a删掉
        list1.remove(5);
        System.out.println(list1);

//        public E set(int index, E element)用指定元素替换列表中指定位置的元素（可选操作）。
         //把b换掉
        list1.set(1,"中心大厦");
        System.out.println(list1);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i)); //public E get(int index)
        }
        System.out.println("===============2020.11.11");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1,666);
        System.out.println(list);
        System.out.println(list.get(1));
        list.set(3,333);
        System.out.println(list);
    }
}
