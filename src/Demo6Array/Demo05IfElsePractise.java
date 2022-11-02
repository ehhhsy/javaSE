package Demo6Array;

import java.util.Scanner;

/* 可以学到三元运算符
 * 题目：使用三元运算符和标准的if -else语句分别实现，取两个数字当中的最大值
 */
public class Demo05IfElsePractise {
	public static void main(String[] args) {
		int a=10;
		int b =20;
		/*
		int x = a>b ? a:b;    boolean x=a==b ? true:false;
		System.out.println(x);
		*/
	    System.out.println("====================");
          int max;
          if(a>b) {
        	  max=a;
          }
          else {
        	  max =b;
          }
          System.out.println(max);
          System.out.println("====================");
          int  big = a>b ? a:b;  //2020.6.4
          System.out.println(big);
          System.out.println("====================");
          int xxx ;
          if (a>b) {
        	  xxx =a;
          }else {
        	  xxx=b;
          }
          System.out.println(xxx);
          System.out.println("================2020.7.18");
          int a1=23;
          int b1=21;
          int big1 =a1>b1?a1:b1;
          System.out.println(big);
        System.out.println("====================");
        System.out.println("请输入第一个数字比较");
        int abc=new Scanner(System.in).nextInt();
        System.out.println("请输入第二个数字比较");
        int abca=new Scanner(System.in).nextInt(); //2020.9.27
        System.out.println(abc>abca?abc:abca);

    }
           
}
