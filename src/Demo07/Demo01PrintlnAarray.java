package Demo07;

import java.util.Arrays;

/*
  面向过程：当需要实现一个功能的时候，每个具体步骤都要亲力亲为，详细处理每一个细节(自己干）
 面向对象：当需要实现的一个功能的时候，不关心具体的步骤，而是找到一个具有该功能的人，来帮我做（找人干）
 */
public class Demo01PrintlnAarray {

	public static void main(String[] args) {
		int [] array= {10,20,30,40,50};
		//要求打印格式为： [10,20,30,40,50]
		//使用【面向过程】，每个步骤细节都要亲历亲为。
		System.out.print("[");
		for(int i=0;i<array.length;i++) {
			if(i==array.length - 1) {
				System.out.print(array[i]+"]");
				}else {
					System.out.print(array[i]+",");
				
			}
		}
		//使用面向对象
		//找一个jdk提供给我们的Arrays类
		//其中有一个toString方法，能直接把数组变成想要的格式的字符串
             System.out.println("========================");
             System.out.println(Arrays.toString(array));

             //2020.9.18
	}

}
