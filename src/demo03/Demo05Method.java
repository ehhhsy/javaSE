package demo03;
 /*定义一个方法格式：
public static void 方法名称（）{
方法体

方法名称的命名规则和变量，使用小驼峰
方法体：也就是大括号当中包含任意语句
*/
public class Demo05Method {
  public static void mian (String[] args) {
	  farmer();
	  seller();
	  joeyHeipo();//2020
	  barneystatin();//2022
  }
  public static void farmer() {
	  System.out.println("播种");
	  System.out.println("浇水");
	  System.out.println("施肥");
	  System.out.println("除虫");
	  System.out.println("收割");
	  System.out.println("卖给小商贩");
  }
  public static void seller() {
	  System.out.println("运输到农贸市场");
	  System.out.println("抬高价格");
	  System.out.println("吆喝");
	  System.out.println("卖给橱子");
	  //商贩
  }
  public static void cook() {
	  System.out.println("洗菜");
	  System.out.println("切菜");
	  System.out.println("炒菜");
	  System.out.println("装盘");
	  //厨子
  }
  public static void me() {

	  System.out.println("吃");
	  //我
  }

  public static void joeyHeipo() {
	  System.out.println("2020.7.18 simply");
  }
  public static void barneystatin(){ System.out.println("2022.9.17 fire"); }
 }
