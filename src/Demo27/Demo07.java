package Demo27;
 /*练习1
  * 题目：
  * 定义一个方法，把数组{1，2，3}按照指定格式拼接成一个字符串。
  * 格式是[word1#world2#world3]
  * 
  * 分析：
  * 1.首先准备一个int[]数组，内容是1,2,3
  * 2.定义一个方法.用来将数组变成字符串    
  * 三要素
  * 返回值类型：String
  方法名称：随便
  参数列表：int []
  3.格式是[word1#world2#world3]
  用到for循环，字符串拼接，每个数组元素之前都有一个word字样，分隔使用#，区分一下是不是最后一个
  4.调用方法
  */
public class Demo07 {
  public static void main(String[] args) {
	  int [] array = {1,2,3,4};
	  
	  String s2 =Pj(array);
	  System.out.println(s2);
	 }
     public static String Pj (int[] array1) {
    	String s1 = "[";
    	for (int i = 0; i < array1.length; i++) {
			if(i==array1.length-1) {
				 s1 +="world"+array1[i]+"]";
		}else {
		      s1 +="world"+array1[i]+"#";
		}
     }
		return s1;
}

}