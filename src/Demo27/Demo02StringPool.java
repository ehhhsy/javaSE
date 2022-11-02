package Demo27;

public class Demo02StringPool {
/*
 * 字符串常量池：程序当中直接写上的双引号字符串，就在字符串常量池中。String s1=  "abc";
 * 只有双引号直接写才在池里，有new的话就跟池没关系了，new的不在池中
 *  
 *  对于基本类型来说，==是进行数值的比较。
  对于引用类型来说，==是进行【地址值的比较】的比较
  
  两点问题：
  1.对于引用类型来说，==进行的是地址值的比较
  2.双引号直接写的字符串在常量池当中，new的不在池当中
 *  
 */
	public static void main(String[] args) {
          String s1=  "abc";  
          String s2= "abc";
          
          char [] charArray= {'a','b','c'};
          String s3= new String(charArray);
          
//          看图
          System.out.println(s1==s2);  //true 说明s1和s2地址一样
          System.out.println(s1==s3);  //false
          System.out.println(s2==s3);  //false
          
          System.out.println("==============");
          boolean a1=s1.equals(s3);
          System.out.println(a1);
          boolean a2 =s2.equalsIgnoreCase(s3);
          System.out.println(a2);
          
	}

}
