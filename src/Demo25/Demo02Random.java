package Demo25;

import java.util.Random;
/*
 * //获取一个随机int数字 (参数代表了范围，左闭右开取键） int num =r.nextInt(3);
	//实际上代表的含义是：【0，3} 也代表0~2  ！！！！！！！！！！！
 */
public class Demo02Random {
  public static void main(String[] args) {
	Random r =new Random();
	
	for(int i=1;i<100;i++) {
		//匿名对象+random的使用
//		System.out.println(new Random().nextInt(11));
		int num =r.nextInt(11);
		System.out.println(num);

		System.out.println("===================");
		for (int j = 0; j < 10; j++) {
			System.out.println(new Random().nextInt(10)+1);   //1-10
		}
	}
			}
}
