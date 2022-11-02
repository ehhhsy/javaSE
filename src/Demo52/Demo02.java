package Demo52;

import java.util.ArrayList;
import java.util.Collections;

/*
        【工具类都是静态方法】HSY:可以类名称. 来调用
           java。until。Collections是集合工具类，用来对集合进行操作，部分方法如下：
        public static<T> void sort（list<T> list):将集合中的元素按照默认规则排序

     注意事项：
        sort方法使用前提：
            被排序的集合里边存储的元素，必须实现Comparable，重写接口中的方法compareTo定义排序的规则
     规则：
           自己（this).-（参数）.   升序        return this.getAge()-o.getAge();//升序排序


总结：
    如果是自定义的类型，想用进行sort排序，就必须必须实现Comparable，重写接口中的方法compareTo定义排序的规则
 */
public class Demo02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,3,2);//添加1，3，2元素
        System.out.println(list);//[1, 3, 2]

        Collections.sort(list);//默认是升序
        System.out.println(list);//[1, 2, 3]

        System.out.println("==============================");
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"a","c","b");//添加a,c,b元素
        System.out.println(list1);//[a, c, b]
        Collections.sort(list1);
        System.out.println(list1);//[a, b, c]

        System.out.println("==============================");
        ArrayList<Demo02Person> list2 = new ArrayList<>();
        Collections.addAll(list2,new Demo02Person("张三",12),new Demo02Person("李四",11),new Demo02Person("王五",222));
        System.out.println(list2); //[Demo02Person{name='张三', age=12}, Demo02Person{name='李四', age=11}, Demo02Person{name='王五', age=222}]
        Collections.sort(list2);
        System.out.println(list2);//[Demo02Person{name='李四', age=11}, Demo02Person{name='张三', age=12}, Demo02Person{name='王五', age=222}
    }
}
