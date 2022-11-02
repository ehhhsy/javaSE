package Demo24;
/*
 * 创建对象的标准格式：
 * 类名称 对象名 =new 类名称（）；
 * 
 * 匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
 * 注意匿名对象只能使用唯一的一次，下次再用不得不在创建一个新对象
 */
public class Demo01Anonymous {
      public static void main(String[] args) {
		Person one =new Person();
		
		one.name="zbc";
		one.show("哈拉少");//哈拉少我叫  zbc
		
		//匿名对象
		new Person().name="五五开"; 
		new Person().show("zbc");//zbc我叫  null
		// 注意匿名对象只能使用唯一的一次，下次再用不得不在创建一个新对象
		
	}
  }
