package Demo27;

import java.util.Scanner;
//public int indexOf(String str):
/*
 * 题目：
 * 键盘输入一个字符串，并且统计其中各种字符出现的次数。
 * 种类有：大写字母，小写字母，数字，其他
 * 3.定义四个变量，分别代表四种字符各自出现的次数
 * 4.需要对字符串一个字，一个字检查，String --》char[] 方法就是tocharAarray() 
 * 5.遍历char【】数组，对当前字符的种类进行判断，并且用四个变量进行++动作
 * 6.打印输入四个变量，分别代表四种字符出现次数
 *  
 *  */
public class Demo08StringCount {
   public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
	  System.err.println("请输入一个字符串");
	  String s1 =sc.next();  //获取字符串
	  
	  int countUpper=0;  //大写字母
	  int countLower=0;  //小写字母
	  int countNumber=0; //数字
	  int countOther=0;  //其他字符
	  char [] array =s1.toCharArray();
	  for (int i = 0; i < array.length; i++) {
	        char ch =array[i];  //当前字符
	        if('A' <=ch&&ch <='Z'){
	        		countUpper++;
	} else if ('a' <=ch&&ch <='z') {
		            countLower++;
	}else if('0' <=ch&&ch <='9') {
		countNumber++;
	}else {
		countOther++;
	}
}
	    System.out.println("大写字母有 "+countUpper);
	    System.out.println("小写字母有 "+countLower);
	    System.out.println("数字有  "+countNumber);
	    System.out.println("其他字符有  "+countOther);
}
}
