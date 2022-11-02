package Demo23;
/*
 * 题目：键盘输入3个int数字，然后求出其中的最大值
 * 
 * 思路：
 * 1.既然是键盘输入，肯定需要用到Scanner
 * 2.Scanner三个步骤：导包，创建，使用
 * 3.既然是三个数字，那么调用三次nextInt（）方法，得到三个int变量
 * 4.无法同时判断三个数字最大，应该转换为前两次步骤
 * 4.1首先判断前两个当中谁最大，拿前两个的最大值
 * 4.2拿着前两个中的最大值，再和第三个数字比较，得到三个数字当中的最大值
 * 5.打印结果
 */
import java.util.Scanner;

public class Demo03Scanner {
       public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int num3= sc.nextInt();
		/*if(num1>num2&&num1>num3) {   //自己的思路 if实现
			System.out.println("最大值是"+num1);
		}else if(num2>num1&&num2>num3) {
			System.out.println("最大值是"+num2);
	}else if(num3>num1&&num3>num2) {
		System.out.println("最大值是"+num3);
}*/
	 int a = num1>num2 ?num1:num2;  //教程的方法
	 int b= a>num3?a:num3;
	 System.out.println("最大的数是"+b);

		   System.out.println("================");
		   System.out.println("请输入3个int数字");
		   int a1=new Scanner(System.in).nextInt();
		   int a2=new Scanner(System.in).nextInt();
		   int a3=new Scanner(System.in).nextInt();
			int aa=a1>a2?a1:a2;
			int bb=aa>a3?aa:a3;
		   System.out.println(bb);
}
}
