 //题目：创建两个键盘输入的int数字，并且求和
/*
 * 思路：
 * 1.既然需要键盘输入，那么就用Scanner
 * 2.Scanner的三个步骤：导包，创建，使用
 * 3.需要的是两个数字，所以要调用两次nextInt方法
 * 4.得到了两个数字，就需要加在一起
 * 5.将结果打印输出
 */
package Demo23;
  import java.util.Scanner;
  //1.导包
public class Demo02ScannerTest {
public static void main(String[] args) {
//	2.创建
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入第一个");
	int num = sc.nextInt();
	System.out.println("请输入第二个");
	int num2 = sc.nextInt();
	System.out.println("这两个数的求和"+(num+num2));
//	System.out.println("这两个数的求和"+num+num2);错误，变成字符串相加

	System.out.println("====================");
	System.out.println("请连续输入两个数字");
	System.out.println(new Scanner(System.in).nextInt()+new Scanner(System.in).nextInt());
}
}
