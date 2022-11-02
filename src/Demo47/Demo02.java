package Demo47;

import java.util.ArrayList;
import java.util.Iterator;

/*
    Iterator迭代器    【注意】【增强for循环（用来遍历数组/集合）】【常用】
    有两个【常用方法】
    boolean hasNext()
          如果仍有元素可以迭代，则返回 true。判断集合中还有没有下一个元素，有就返回true，没有就false

 E next()
          返回迭代的【下一个】元素。（取出集合的下一个元素）
   因为是接口，我们无法直接使用，必须用实现类，【获取实现类比较特殊】
   Collection接口中有一个方法，叫做iterator（）; 返回的就是迭代器的对象
   Iterator<E> iterator();
     返回collection的元素中进行迭代的迭代器

     迭代器的使用步骤【重点】：
     1.先使用集合中的方法iterator（）获取对象，使用iterator接口接收
     2.使用iterator的方法hasNext（）;判断还有没有下一个元素
     3.使用iterator接口的方法next取出集合中的下一个元素

     发现迭代器取出的集合中元素的代码是一个重复的过程
     所以我们可以使用循环优化
     不知道集合有多少元素，使用while循环  【重点】
     循环结束的条件，hasNext方法返回flase

 */
public class Demo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("姚明");
        list.add("科比");
        list.add("麦迪");

        System.out.println("2020.11.11迭代器练习");
        Iterator<String> iterator1 = list.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println("2020.11.11迭代器练习");

        //1.先使用集合中的方法iterator（）获取对象，使用iterator接口接收
        Iterator<String> iterator = list.iterator();

//        while循环
      while(iterator.hasNext()){
          System.out.println(iterator.next());
      }

        //2.使用iterator的方法hasNext（）;判断还有没有下一个元素
//        boolean b1 = iterator.hasNext();//true
//        System.out.println(b1);
//
        System.out.println("=========================");
         //使用增强for循环遍历集合

        //格式：for（数据类型 名称：容器名）{}
        for(String s:list){
            System.out.println(s);
        }
        System.out.println("=========================");
        //小拓展   使用增强for循环遍历数组
        int [] array ={2,1,3,1,233};
        for(int i:array){
            System.out.println(i);
        }

    }
}
