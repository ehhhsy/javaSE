package Demo26;

import java.util.ArrayList;
import java.util.Random;

/*
 * 题目:用一个大集合存入20个随机数,然后筛选其中的偶数元素,放在小集合当中
 * 要求使用自定义的方法来筛选
 * 
 * 分析:
 * 1 需要创建一个大集合,用来存储int数字,<Integer>
 * 2.随机数字就用Random,nextInt
 * 3.循环20次,把随机数字放入集合:for,add方法
 * 4.定义一个方法筛选
 * 三要素:
 * 返回值类型:arrayList小集合(里面元素不确定)
 * 方法名称; 随便
 * 参数列表 : arrayList大集合(20个随机数字)
 * 5.判断用if是偶数
 * 6.如果是偶数就是放入小集合
 */
  
public class Demo08ArrayListReturn {

	public static void main(String[] args) {
           ArrayList<Integer> one =new ArrayList<>();//大集合
           Random r =new Random();
           for (int i = 0; i < 20; i++) { //放入20个int数字到one集合中
			  int num =r.nextInt(10)+1; //1-10
			  one.add(num);                  
		}
           System.out.println(one);
           System.out.println("随机数有"+one.size()+"随机数");
           
           System.out.println(SX(one));
           System.out.println("偶数有"+SX(one).size()+"个");

		System.out.println("===========================");
		ArrayList<Integer> sss = sss(new ArrayList<Integer>());
		System.out.println(sss);
	}
     
	//定义一个方法,筛选
	public static  ArrayList<Integer> SX ( ArrayList<Integer> one){  //自己写的
		ArrayList<Integer> two =new ArrayList<>();
		for (int i = 0; i < one.size(); i++) {
			if (one.get(i)%2!=0) {
				one.remove(i);
				}else {
				two.add(one.get(i));
				}			
		}
		return two;
	}

	public static ArrayList<Integer> sss(ArrayList<Integer>list){
		for (int i1 = 0; i1 < 20; i1++) {
			int i = new Random().nextInt(10)+1;
			if (i%2==0){
				list.add(i);
			}//2020.10.15
		}
		return list;
	}
}
