package Demo05;
/*
 数组：是一个容器，可以同时存放多个数据值。（跟变量差不多，变量只能存放单个，数据可以存放多个
 特点：
 1.数据是一种引用类型
 2.数组中的多个数据，类型必须统一
 3.数组的长度在程序运期间不可以改变
 
 数组的初始化：在内存中创建一个数组，并且向其中赋予一些默认值
 两种常见的初始化方式：
 1.动态初始化（指定长度）
 2.静态初始化（指定内容）
 
 动态初始化数组格式：
 数据类型 【】 数组名称 =new 数据类型 【数组长度】；
 
 解析含义：
 左边的数据类型：也是数组中保持的数据，全都是统一的什么类型
 左边的中括号：代表我是一个数组
 左边数组名称：给数组取名字
 右边的new ：代表创建数组的动作
 右边数据类型：必须和左边的数据类型保持一致
 右边中括号的长度：也就是数组中，到底可以保持多少个数据，是一个int数字

  */
public class Demo5Array {
	public static void main(String[] args) {
		int score1 =100;
		int score2 =98;
		int score3=99;
		System.out.println(score3);
		//创建一个数组，长度为300，int类型
		int[] arrayA =new int[300];
		
		//创建一个数组，长度为10，double类型
		double [] arrayB =new double [10];
		
		//创建一个数组，长度为5，String类型
		String [] arrayC =new String [5];
		
		long []  arrayd ={1,3,4,5};

          float [] a= {2,2,3.1f,21};

          String [] str ={"l","j"};
		for (String abc:str
			 ) {
			System.out.println(abc);
		}
		System.out.println("-----------2022=================="); //2022.9
		double[] doubles = new double[4];
		doubles[0]=0;
		doubles[1]=1;
		doubles[2]=2;
		doubles[3]=3;
		for (double d:doubles
			 ) {
			System.out.println(d);
		}
	}
}