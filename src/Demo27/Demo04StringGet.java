package Demo27;
/*
 * String当中与获取相关的常用方法有：
 * 
 * public int length();（获取字符串当中含有的字符个数==拿到字符串的长度）
 * 
 * public String concat(String str):将当前字符串和参数字符串拼接成为返回值新的字符串
 * 
 * public char chaAt(int index):获取指定位置的单个字符。（索引从0开始）
 * 
 * public int indexOf(String str):查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值
 *   就是说：
 *   参数字符串是 123，本字符串是123456，首次出现就是1，1的位置在本字符串是0号元素
 *   参数字符串是 3，本字符串是123456，首次出现就是3，3的位置在本字符串是2号元素
 *   参数字符串是 35，本字符串是123456，35没有出现在123456中所以，返回-1   
 */
public class Demo04StringGet {
	public static void main(String[] args) {
  String str="123456";	
  String str1="盲僧";
  String str2 ="-李青";
  String str4="123";
  String str5="35";
  String str6="3";
  
	// public int length(); 获取长度
//  int num=str1.length();
//  System.out.println(num);  //2
//		System.out.println("===============");
  //public String concat(String str): 拼接字符串
//  String str3=str1.concat(str2);
//  System.out.println(str3); // 盲僧-李青    是一个新的字符串
//  System.out.println(str1); // 盲僧      原封不动     字符串的内容永不可变。  【重点】
//  System.out.println(str2); // -李青    原封不动      字符串的内容永不可变。  【重点】
//  System.out.println("===============");
  
  //public char chaAt(int index):获取指定位置的单个字符。
// char ch = str.charAt(3);
// System.out.println(ch);  //4
//
// System.out.println("===============");
//  int a= str.indexOf(str4);
//  System.out.println("123字符串的索引位置是"+a);
//  int b =str.indexOf(str5);
//  System.out.println("35字符串的索引位置是"+b);
//  int c =str.indexOf(str6);
//  System.out.println(("3字符串的索引位置是"+c));
  //也可以这样  
  //int d =str.indexOf("23");
  //System.out.println("helloworld".indexOf("123"));   【小重点】
//
//	  System.out.println("=========");  //2020.7.29
//	 System.out.println("c".concat("f"));  //concat方法 连接字符串
//	 String a1 = "2334333";
//     char a2=a1.charAt(3);                //charAt 取出元素
//     System.out.println(a2);
//     System.out.println(a1.length());      //length 获得长度
//
//     System.out.println(a1.indexOf("434"));  //-1
//     System.out.println(a1.indexOf("433"));  //3   //indexOf首次出现的索引位置，

	//2020.10.15
    String l="13231324Gfsf";
        System.out.println(l.length()); //12
    String ln="谷歌";
        System.out.println(ln.concat(l)); //谷歌13231324Gfsf

        System.out.println(l.charAt(11));//f

        System.out.println(l.toLowerCase().indexOf("g"));
}
}