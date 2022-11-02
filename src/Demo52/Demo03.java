package Demo52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
java。until.Collections是集合工具类，用来对集合进行操作，部分方法如下：
public static <T> void sort(List<T> list, Comparator<? super T>) :将集合中的元素【按指定规则】进行排序

    Comparator和Comparable区别
        Comparable：自己和（this）和别人比较（o）参数，自己需要实现Comparable接口，重写比较规则CompareTo方法
        Comparator：相当于找一个第三方的裁判，比较两个

 */
public class Demo03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,3,2);//添加1，3，2元素
        System.out.println(list);

        Collections.sort(list, new Comparator<Integer>() {
            //重写比较的规则
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1-o2; 升序 123
//                return o2-o1; 降序 321
                  return o2-o1;
            }
        });

//===================================================================================
        ArrayList<Students> studentsArrayList = new ArrayList<>();
        Collections.addAll(studentsArrayList,new Students("b王思聪",22),new Students("王思聪",9),new Students("a王室之",22) ,new Students("王曙光",33));
        Collections.sort(studentsArrayList,new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                //按照年龄升序排序
                int i = o1.getAge() - o2.getAge();
                //如果两个人年龄相同，再用第一个字比较          //了解即可
                if (i==0){
                    i=o1.getName().charAt(0)-o2.getName().charAt(0);
                }
                return i;

            }
        });
        System.out.println(studentsArrayList);
        //[Students{name='王思聪', age=9}, Students{name='a王室之', age=22}, Students{name='b王思聪', age=22}, Students{name='王曙光', age=33}]
    }
}
