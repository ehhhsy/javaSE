package Demo47;

import java.util.ArrayList;
import java.util.Arrays;

/*        Collection顶层的共性方法
  boolean add(E e)          向集合添加数据
  boolean remove（E e)      删除集合中的某个元素，索引
  void cLear（）;           清空集合中所有的元素，集合还在
  boolean contains（E e)    判断集合中是否包含某个元素
  boolean isEmpty();        判断集合是否为空
  int size（);              获取集合的长度
  Object [] toArray();     将集合转成一个数组
 */
public class Demo01 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();//创建集合对象

        list.add("aa");  //向集合添加数据
        list.add("bb");
        list.add("cc");
        list.add("dd");

        int size = list.size();  //获得集合的长度  4
        System.out.println(size);

        Object[] array = list.toArray();
        System.out.println(list);//直接打印集合，[aa, bb, cc, dd]
//        System.out.println(Arrays.toArrays());

        list.remove("aa");  //删除集合中的某个元素
        list.remove("dd");

        list.clear();    //清空集合中所有的元素

        boolean contains = list.contains("bb"); //判断集合中是否包含bb元素
        System.out.println(contains);

        boolean listEmpty = list.isEmpty();  //判断集合是否为空
        System.out.println(listEmpty);

        System.out.println("==================2020.11.11");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1333);
        list1.add(232);                 //add
        System.out.println(list1);
        /*
        boolean add(E e)          向集合添加数据
  boolean remove（E e)      删除集合中的某个元素,索引
  void cLear（）;           清空集合中所有的元素，集合还在
  boolean contains（E e)    判断集合中是否包含某个元素
  boolean isEmpty();        判断集合是否为空
  int size（);              获取集合的长度
  Object [] toArray();     将集合转成一个数组
         */
        Integer remove = list1.remove(0);
        System.out.println(list1);  //[1333, 232]
        boolean contains1 = list1.contains(123);
        System.out.println(contains1);
        Object[] objects = list1.toArray();
        System.out.println(Arrays.toString(objects));
        list1.clear();
        System.out.println(list1);
        boolean empty = list.isEmpty();
        System.out.println(empty);
        System.out.println(list1.size());

    }
}
