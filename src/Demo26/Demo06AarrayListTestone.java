package Demo26;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
    * 题目:生成6个1-33之间的随机整数,添加到集合,并且遍历集合
    *
    * 1.需要存储6个数字,创建一个集合<Integer>
    * 2.产生随机数,需要用到Random
    * 3.用循环6此,来产生6个随机数,for循环
    * 4 .循环内调用random.nextInt(33)+1
    * 5.把数字添加到集合中:add
    * 6.遍历数组,for.size.get
    */
public class Demo06AarrayListTestone {

	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<>();  //创建一个ArrayList对象     泛型是 Integer
    Random random =new Random();          //创建一个Random对象
    for (int i = 0; i < 6; i++) {
		int num=random.nextInt(33)+1; //老师思路  用for添加随机数
		list.add(num);
	}
    for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}
  /*  int one =random.nextInt(33)+1;
    int two =random.nextInt(33)+1;    // 自己的思路不行啊
    int three =random.nextInt(33)+1;
    int four =random.nextInt(33)+1;
    int five =random.nextInt(33)+1;
    int six =random.nextInt(33)+1;
    */
    
   /* list.add(one);
    list.add(two);
    list.add(three);
    list.add(four);
    list.add(five);
    list.add(six);
*/
		/*
		 * 题目:生成6个1-33之间的随机整数,添加到集合,并且遍历集合
		 *
		 * 1.需要存储6个数字,创建一个集合<Integer>
		 * 2.产生随机数,需要用到Random
		 * 3.用循环6此,来产生6个随机数,for循环
		 * 4 .循环内调用random.nextInt(33)+1
		 * 5.把数字添加到集合中:add
		 * 6.遍历数组,for.size.get
		 */
		System.out.println("=====================");
		ArrayList<Integer> listi = new ArrayList<>();
		for (int i1 = 0; i1 < 6; i1++) {
			int i = new Random().nextInt(33) + 1;
			listi.add(i);
		}
		for (int i = 0; i < listi.size(); i++) {
			System.out.print(listi.get(i)+"  ");
		}

	}

}
