package Demo27;
  /*
   * String 当中与转换相关的常用方法有：
   * 
   * public char [] toCharArray(); 将当前字符串拆分成为字符数组作为方法的返回值
   * 
   *  public byte[] getBytes(); 获得当前字符串底层的字节数组      后面ao流用得上
   *  
   *  public String replace(CharSequence OldString,ChatSequence newString)
   *  将所有出现的老字符串替换成新的字符串，返回替换之后的结果新字符串        hsy:就是world文档里面的替换
   *  备注CharSequence意思就是说可以接受字符串类型。
   *  什么时候用到呢？     玩游戏骂人是的时候
   *   String lang1=("菜狗");           系统不让你骂
    	 String lang2=lang1.replace("狗", "*");
    	 System.out.println(lang2);   //菜*
   *      */
  
public class Demo06 {
  public static void main(String[] args) {
	  //toCharArray();
	  String a1 ="艾尼阿索哟";
	  char [] char1 =a1.toCharArray();
	  System.out.println(char1);
	  System.out.println(char1[0]);  //h     可以单拿出来处理
 	  System.out.println(char1.length);  //5
	  
      System.out.println("=========");
      //getBytes();
//      byte [] by1=a1.getBytes();
//      System.out.println(by1);
      byte [] by="abc".getBytes();
      for (int i = 0; i < by.length; i++) {
		 System.err.println(by[i]);    //97.98.99  后面ao流用得上
	}
      System.out.println("==========");
              
      // replace(CharSequence OldString,ChatSequence newString)
      String a2 ="卡西奥佩娅-zbc";
      String a3=a2.replace("zbc","无情哈拉少"); //a2内容没变，返回一个新的内容
      System.out.println(a3);
 
      String lang1=("菜狗");
    	 String lang2=lang1.replace("狗", "*");
    	 System.out.println(lang2);
  }
  
  
  
}
