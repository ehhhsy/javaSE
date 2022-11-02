package Demo08;
/*this关键字  作用：主要是在重名的情况下，解决重名的问题
 *  当方法的局部变量和类的成员变量重名的时候，根据“就近原则”，优先使用局部变量（参数） 成员变量中的String name
 *  如果需要访问本类当中的成员变量，需要使用格式： this.关键字
 *
 *  ‘通过谁调用的方法，谁就是this.’  【重点】
 *  one.sayhallo是one.调用的方法，
 *  所以one就是this，所以this.name==one.name；================
 */
public class Person {
 String name; //name和下面的this。name一样的颜色
 
 /*public void sayhallo(String who) {
	 System.out.println(who+"你好，我叫"+name);
 }
 */
 //参数name是对方的名字
 //成员变量name是自己的名字
 public void sayhallo(String name) {
	 System.out.println(name+"你好，我叫"+this.name);
	 System.out.println(this);//地址值@279f2327和one一样
 }
}
