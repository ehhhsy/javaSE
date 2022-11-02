package Demo27;
/*
 * 字符串的截取方法：
 * 
 * public String substring(int index):截取参数位置一直到字符串末尾，返回新字符串
 *  
 * public String substring(int begin,int end):截取到从begin，一直到end结束，中间的字符串
 * 备注：[begin,end) 包含左边，不是右边
 */
public class  Demo05 {
  public static void main(String[] args) {
	 String str1 ="人生苦短，我用python";
	 String str2 =str1.substring(7); //包括7号元素
	 System.out.println(str2);  //python
	 String str3=str1.substring(2, 4); //包括2，4
	 System.out.println(str3);   //苦短
	 
	 System.out.println(str1); //字符串的长度是永不可变的
    
	 
      String str4="helloworld";
      System.out.println(str4.substring(4,7));
      
      //下面这种写法，字符串内容仍然是没有改变的
      //下面有两个字符串："hallo","java"
      //strA当中保存的是地址值
      //本来地址值是hello的0x666
      //后来地址值变成java的0x999
      String strA ="Hallo";
      System.out.println(strA); //Hallo
      strA="JAVA";
      System.out.println(strA); //JAVA


      //2020.10.15
      String payth = strA.concat("PAYTH");
      System.out.println(payth); //JAVAPAYTH
      System.out.println(payth.substring(4));
      System.out.println(payth.substring(0,4));
  }
}
