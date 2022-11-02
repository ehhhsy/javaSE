package Demo48;

import java.util.ArrayList;
import java.util.Iterator;

/*
泛型：未知的数
public class ArrayList<E>
public boolean add（E e){}
public E get（int index）{}
 */
public class Demo01 {
    public static void main(String[] args) {
     show1();
        System.out.println("=========");
        show2();
    }
   /*
   创建集合对象，使用泛型
   好处：
   1.避免了类型转化的麻烦，存储的是什么类型，取出就是什么类型
   2。把运行期异常（代码运行后会抛出的异常），提升到编译期（写代码容易出错）
   坏处：
   泛型是什么类型，就是存储这种类型的数据
    */
    private static void show2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("zzz");
//        list.add(1);报错，提升到编译期
        for (String s:
             list) {
            System.out.println(s);
        }
    }

    /*
    创建集合对象，不使用泛型
    好处：
    集合不使用泛型，默认是object类型，可以存储任意类型的数据
    坏处：
    不安全，会引发异常
     */
    private static void show1() {
        ArrayList list = new ArrayList();
        list.add("黄慧婷");
        list.add(1);

        //使用迭代器遍历数组
        Iterator iterator = list.iterator(); //获取迭代器
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
