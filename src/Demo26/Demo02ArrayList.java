package Demo26;

import java.util.ArrayList;

/*
  * 数组的长度不可以发生改变
  * 但是ArrayList集合的长度是可以随意变化的
  * 
  * 对于ArrayList来说，有一个尖括号<E>代表泛型
  * 泛型：也就是装在集合当中的所有元素，全部都是统一的什么类型
  * 注意：泛型只能是引用类型，不能是基本类型。
  * 
  * 注意事项；
  * 对于ArrayList集合来说，直接打印得到的不是地址值，而是内容
  * 如果内容是空，得到的是空，【】
  */
public class Demo02ArrayList {
	public static void main(String[] args) {
		//创建了一个ArrayList集合，集合的名称是List，里面装的全都是String字符串类型的数据
		//备注：从jdk1.7+开始，右侧的尖括号内部可以不写内容，但是<>本身还是要写
		   ArrayList<String>  one =new ArrayList<>();
		   System.out.println(one);//不是地址值而是内容，
		   //如果内容是空，则得到【】
          one.add("赵丽颖");
          System.out.println(one);
          one.add("德玛西亚之力");   //add方法
          one.add("德玛西亚皇子");
          one.add("德玛西亚之翼");
          System.out.println(one);//[赵丽颖, 德玛西亚之力, 德玛西亚皇子, 德玛
          
//          one.add(123);//错误写法，因为创建的时候尖括号泛型已经说了是字符串，添加进去的元素必须是字符串

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
    }

}
