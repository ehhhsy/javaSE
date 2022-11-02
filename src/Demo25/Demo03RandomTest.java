package Demo25;
/*
 * 题目要求：
 * 根据int变量n的值，来获取随机数字，范围是{1，n} 可以取到1也可以娶到n
 * 
 * 思路：
 * 1.顶一个int变量n，随意赋值
 * 2.要使用Random：三个步骤，导包，创建，使用
 * 3.如果写上10，那么就是0-9   
 * 4.打印随机数
 */
import java.util.Random;

public class Demo03RandomTest {

	public static void main(String[] args) {
		int n=5;
		Random one =new Random();
	    for (int i = 0; i < 10; i++) {
	    	//本来范围是[0,n），整体+1之后变成【1.n+1），也就是【1，n）
		   int result=one.nextInt(n)+1;
		   System.out.println(result);
		}


		System.out.println("===================");
	    print(5);


	}
	public static void print(int n){			//打印10次指定的1-n的随机数
		for (int i = 0; i < 10; i++) {
			System.out.println(new Random().nextInt(n)+1); //2020.9.28
		}
	}
}
