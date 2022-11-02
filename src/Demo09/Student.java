package Demo09;
/*自动生成set/get    source===Generate Getters and Setters
 * 自动生成：构造方法                        source===Constructor using fieds
 * 一个标准的类通常要满足下面四个组成部分
 * 
 * 1. 所有的成员变量都要用private关键字修饰
 * 2.所有的成员变量都要编写一对getter/seterr方法
 * 3.要写一个无参数构造方法
 * 4.要写一个有参构造方法
 */
public class Student {
      private String name; //姓名
      private int age; //年龄
     /* public Student() {
    	  System.out.println("无参构造方法实现了");
      }
     /* public Student(String name,int age) {
    	  System.out.println("全参构造方法实现了");
    	  this.name=name;
    	  this.age=age;
      }
     /* public void setName( String name) {
    	  this.name=name;
      }
      public String getName() {
    	  return name;
      }
      public void setAge(int age) {
    	  this.age=age;
      }
      public int getAge() {
    	  return age;
      }*/
      //以下都是自动生成的
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public Student() {
		
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
}
