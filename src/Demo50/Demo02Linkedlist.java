package Demo50;

import java.util.LinkedList;

/*
java.until.linkedlist集合 impl  list接口
listedlist集合
有大量的首，未方法
    特点：
        1.底层是链表结构：查询慢，增删快
        2.里面包含了大量操作首尾元素的方法
        注意：使用了linkedlist集合特有的方法，不能使用多态
   void addFirst(E e) 将指定元素插入此列表的开头。
   void addLast(E e) 将指定元素添加到此列表的结尾。
   void push(E e)将元素推入此列表所表示的堆栈。==【addFirst(E e) 方法】

   E getFirst() 返回此列表的第一个元素。
   E getLast() 返回此列表的最后一个元素     【==add方法】

   E removeFirst()移除并返回此列表的第一个元素。
   E removeLast() 移除并返回此列表的最后一个元素。

   。 ==【removeFirst()】


   boolean isEmpty()；如果列表不包含元素，则返回true，可以配合取反！使用
 */
public class Demo02Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        //void addFirst(E e) 将指定元素插入此列表的开头。
        list.addFirst("java");

        // void addLast(E e) 将指定元素添加到此列表的结尾。
        list.addLast("视频");
        System.out.println("==========================");
        //E getFirst() 返回此列表的第一个元素。
        String listFirst = list.getFirst();
        System.out.println(listFirst);

        //E getLast() 返回此列表的最后一个元素
        String listLast = list.getLast();
        System.out.println(listLast);

        System.out.println(list);

        System.out.println("==========================");
//        E removeFirst()移除并返回此列表的第一个元素。
//        E removeLast() 移除并返回此列表的最后一个元素
        String s = list.removeFirst();
        System.out.println(s);
        System.out.println(list);

        String s1 = list.removeLast();
        System.out.println(s1);
        System.out.println(list);
        System.out.println("==========================");
       // E pop() 从此列表所表示的堆栈处弹出一个元素。
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        String s2 = list.pop();
        System.out.println(list); //【removeFirst()】
//        void push(E e)将元素推入此列表所表示的堆栈。
        list.push("fsfs");
        list.push("八八八八八八八");
        System.out.println(list);

        System.out.println("2020.11.11=====================");
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.addFirst(11);
        integers.addLast(33);
        System.out.println(integers);

    }
    }

