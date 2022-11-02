package Demo26;

import java.util.ArrayList;
import java.util.Arrays;

/*
  * 题目:定义以指定格式打印集合的方法(ArrayList类型作为参数 ),使用{}括起来,使用@分隔每一个元素.
  * 格式参照{元素@元素@元素}
  * 
  * System.out.print(list.size())  {..,..,..,}
  * printArray(list)          {...@..@..@}
  */
public class Demo07AarrayListTestthree {

	public static void main(String[] args) {
          ArrayList<String> list =new ArrayList<>();
          list.add("现代");
          list.add("汉语");
          list.add("词典");
          System.out.println(list);
          System.out.println("==========");
          printArray(list);
		System.out.println("==========");
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(1022);
		l.add(1022221123);
		print(l);
		System.out.println("==========");
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("武汉");
		list1.add("加油");
		list1.add("！");
		printABC(list1);
	}
	/*定义方法的三要素
	 * 返回值类型:只是进行打印而已,没有运算,没有结果,所以用void
	 *方法名称:printArray，随便
	 * 参数列表:ArrayList
	 */
	public static void printArray(ArrayList<String> list){
		System.out.print("{");
		for (int i = 0; i < list.size(); i++) {
			String name =list.get(i);
			if (i==list.size()-1) {
				System.out.print(name+"}");
			}else {
		  System.out.print(name+"@");
			}
		}


	}
	public static void print(ArrayList <Integer>list){
		System.out.print("[");
		for (int i = 0; i < list.size(); i++) {
			int abc=list.get(i);
			if (i==list.size()-1){
				System.out.print(abc+"]");
			}else {
				System.out.print(abc+"@");
			}
		}
	}



	public static void printABC(ArrayList<String> list){
		System.out.print("[");
		for (int i = 0; i < list.size(); i++) {
			String name=list.get(i);
			if (i==list.size()-1){
				System.out.print(name+"]");
			}else{
				System.out.print(name+"@");
			}
		}
	}
}


