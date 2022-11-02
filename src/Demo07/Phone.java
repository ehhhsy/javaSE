package Demo07;
 /*
  *定义一个类，用来模拟“手机”事物
  *
  *属性：品牌，长度，重量，颜色，价格
  *行为：打电话，发短信
  *
  *对应到类当中
  *成员变量（属性）
  * string brand
  * int changdu
  * double weigth
  * 
  * 成员方法（行为）
  * public void takephone() {}
  * public void play() {}
  *  public  void call(String who) {}
  */
public class Phone {
	String brand="华强北";
     int changdu=33;
     double weigth=12.3;
     double price;
     String color;
     
     public void takephone() {
    	 System.out.println("打电话");
     }
     public void play() {
    	 System.out.println("玩游戏");
     }
     public  void call(String who) {
    	 System.out.println("给"+who+"打电话");
     }
}
