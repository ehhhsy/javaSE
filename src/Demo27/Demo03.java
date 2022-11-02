package Demo27;
/*
 * ==是进行对象的地址值比较，如果确实需要【字符串的内容】比较，可以使用【两个方法】
 * public boolean equals(object obj);       参数可以是任何对象
 * 只有参数是一个字符串并且内容相同的才会给true，否则返回false
 * 备注：任何对象都能用object进行接收
 * 
 * 注意实现：
 * equals方法具有对称性，也就是a.equals（b）和b.equals（a）效果是一样的
 * 如果比较双方一个常量（"Hello"），一个变量s1，推荐把常量字符串写在前面
 * 推荐："Hello".equals(s3)   不推荐s3.equals("Hello")
 * 
 * public boolean equalsIgnoreCase(String str):忽略大小写，直接进行内容的比较
 *  public boolean equals(object obj);      区分大小写，进行内容的比较
 */
public class Demo03 {
   public static void main(String[] args) {
	 String s1="Hello";
	 String s2="Hello";
	 char [] a1= {'H','e','l','l','o'};
   	   String s3= new String(a1);
   	   //就想要内容的比较
   	   System.out.println(s1.equals(s2)); //true
   	   System.out.println(s1.equals(s3)); //true
   	   System.out.println(s3.equals("Hello")); //true 不推荐
   	   System.out.println("Hello".equals(s3));  //true  推荐
   	   
   	   String s4="hello";
   	   System.out.println(s2.equals(s4));//false  不一样
   	   System.out.println("================");
   	   String s5=null;
   	   System.out.println("Hello".equals(s5)); //false
//   	   System.out.println(s5.equals("Hello")); //报错，空指针异常 NullPointerException

   	   System.out.println("=================");
       String s6="java";
       String s7="JAVA";
       System.out.println(s6.equals(s7)); //false
       System.out.println(s6.equalsIgnoreCase(s7)); //tue
        
       //只有英文字母区分大小写，其他不区分
       System.out.println("abc-123".equalsIgnoreCase("abc-壹23"));//结果当然是false

	   String anm="11";
	   System.out.println("一一".equals(anm)); //false
	   String ammm="AWDWDAG";
	   System.out.println("awdwdag".equalsIgnoreCase(ammm));  //true
   }
}
