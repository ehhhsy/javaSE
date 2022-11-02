
package Demo23;
import java.util.Scanner;  
//1.导包！！！！！！！！！！！
/*
 * Scanner类的功能，可以实现键盘输入数据，到程序当中
 * 
 * 引用类型的一般使用步骤：
 * 1.import 包路径.类名称；
 *   如果需要使用的目标类，和当前类位于同一个包下，则可以省略导包语句不写
 *   只有在java，lang包下的的内容不需要导包，其他包则需要import导入
 *   （比如说定义一个String 变量，而String包是java，lang.string 所以不用import
 *   
 * 2.创建
 * 类名称 对象名 =new 类名称（）；
 * 备注System。in  代表从键盘输入  
 * 
 * 3.使用
 * 对象名，成员方法名（）；
 * 
 * 获取键盘输入的一个int数字：int num = sc.nextInt();
  获取键盘输入的一个String字符串：String str = sc.next();
  
  小提示：屏幕输入的都是字符串
   next();只是原封不动的输入string
   nextInt();而是将屏幕的字符串24（写24）转化为所需要的int数字24
 */

public class Demo01Scanner {
	public static void main(String[] args) {
		System.out.println("please input a String");
		Scanner sc = new Scanner(System.in);
		String sc1 = sc.next();// next();只是原封不动的输入string
		System.out.println("please input a int");
		int i = sc.nextInt();//而是将屏幕的字符串24（写24）转化为所需要的int数字24
		System.out.println(sc1);
		System.out.println(i);
	}
//    public static void main(String[] args) {
////		2.创建      备注System。in  代表从键盘输入   （看构造方法）
//    	Scanner sc =new Scanner(System.in);
//    	//3. 获取键盘输入的一个int数字
//    	System.out.println("请输入一个int数字");
//    	int num=sc.nextInt();
//    	System.out.println(num+"次");
//
//    	//获取键盘输入的一个String字符串
//    	System.out.println("请输入一个名字");
//    	String str =sc.next();
//    	switch(str) {
//    	case "王安石":
//    		System.out.println("《梅花》");
//    		break;
//    	case "杜甫":
//    		System.out.println("《登高》");
//    		break;
//    	case "李白":
//    		System.out.println("《望庐山瀑布");
//    		break;
//    	case "李清照":
//    		System.out.println("《一剪梅·红藕香残玉簟秋》");
//    		break;
//        default:
//        	System.out.println("什么都没有");
//        	//2020.9.27
//    	}
    	
	}
