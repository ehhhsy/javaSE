package Demo27;
/*
 * 分割字符串的方法：
 * public String [] split(String regex):按照参数的规则，将字符串切分成若干份
 *   split方法的参数其实是一个“正则表达式”,今后学习，
 *   今天注意：如果按照英文的句点" .", 不行，必须要写 ”//.“ 
 *      ”（点）. “单独出现的时候，在正则表达式中有特殊含义
 *  */
public class Demo05StringSplit {
 public static void main(String[] args) { 
	 String s1 = "aaa,bbb,ccc,dd,e";
	 String [] array =s1.split(",");  //按照,切分
	 for (int i = 0; i < array.length; i++) {  
		System.out.println(array[i]);    
	}
	 System.out.println("===============");
	 
	 String s2 ="zzz bbb ccc d ax";
	 String[] array2 =s2.split(" ");   ///按照空格切分
	 for (int i = 0; i < array2.length; i++) {
		 System.out.println(array2[i]);
	}
	 System.out.println("===============");
	 String s3 ="zzz.bbb.ccc.d.ax";//这里不用改
	 String[] array3 =s3.split("//.");   ///这里写//.
	 for (int i = 0; i < array3.length; i++) {
		 System.out.println(array3[i]);
	}
}
}
