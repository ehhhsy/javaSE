package Demo26;

import java.util.ArrayList;
/*
 * 题目:
 * 1.自定义4个学生对象,添加到集合,并遍历集合
 * 2.创建一个集合,用来存储学生对象,泛型<Students>
 * 3.根据类,创建4个学生对象
 * 4.将4个学生对象添加到集合中:add
 * 5.遍历集合:for,size,get
 */
public class Demo06AarrayListTestTwo {
	public static void main(String[] args) {
          ArrayList<Students> list =new ArrayList<>();   
	  Students s1 =new Students("光辉", 20);
	  Students s2 =new Students("译者瑞尔", 23);
	  Students s3 =new Students("德莱文", 30);
	  Students s4 =new Students("龙王", 2000);
	  
	  list.add(s1);
	  list.add(s2);
	  list.add(s3);
	  list.add(s4);
	  //[Demo26.Students@28a418fc, Demo26.Students@5305068a, Demo26.Students@1f32
//	  System.out.println(list);//输出的是对象的地址值
	  
	  for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}
		/*
		 * 题目:
		 * 1.自定义4个学生对象,添加到集合,并遍历集合
		 * 2.创建一个集合,用来存储学生对象,泛型<Students>
		 * 3.根据类,创建4个学生对象
		 * 4.将4个学生对象添加到集合中:add
		 * 5.遍历集合:for,size,get
		 */
		System.out.println("=======================");
		ArrayList<Students> st = new ArrayList<>();
		st.add(new Students("海洋之灾",11));
		st.add(new Students("猩红收割者",12));
		st.add(new Students("荒漠屠夫",22));
		st.add(new Students("钢铁大使",13));
		for (int i = 0; i < st.size(); i++) {
			System.out.println(st.get(i));
		}
	}

}
