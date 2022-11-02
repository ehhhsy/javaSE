package Demo07;
/*好处，外边无法直接反问，阻挡错误数据，保证代码的安全性
 * private 关键词  私有的
 * 问题    定义person 的年龄时，无法阻止不合理的数值被设置进来
 * 解决方案：用private关键字将需要保护的成员变量进行修饰
 * 
 * 一旦使用了private进行修饰，那么本类当中任然可以随意访问
 * 但是！！！超出了本类范围之外就不能再直接访问了。
 * （就是你现在person类设置了private，就Demo07person就不访问）
 * 
 * 怎么访问，用间接访问
 * 间接访问，就是定义一对getter（get。。。）/setter（set。。）方法
 * set。。必须有参数，无返回值，和你要set的人保持一致！！！！！！！！！！！！
 * 名称规则set首字母大写。setAge
 * 
 * get。。。必须无参数，有返回值，返回值和你的成员变量要对应
 * 名称规则get首字母大写。getAge
 */
public class Person {
    private String name; 
    private int age;
     //定义成员方法，不能加static
     public  void show() {
    	 System.out.println("我叫"+name+",年龄是："+age);
     }
     public void setName(String num2) {
    	 name=num2;
     }
     public String getName() {
    	 return name;
     }
     public void setAge(int num) { //必须有参数，无返回值，和你要set的人保持一致
    	 if(num<100&&num>=0) {  //对合理性的一个判断
    		 age=num;
    	 }else {
    		 System.out.println("你年龄有"+num+ "?");
    	 }
     }
     
     public int getAge() {  //必须无参数，有返回值，返回值和你的成员变量要对应
    	 return age;
     }
}
