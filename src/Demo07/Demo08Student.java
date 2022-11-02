package Demo07;
//不能直接访问，就用set放进去，get拿出来
public class Demo08Student {
	public static void main(String [] args) {
	Student one= new Student();
	one.setName("王");
	one.setAge(19);
	one.setMale(true);
	one.setName("陈");
	one.setMale(false);
	System.out.println("年龄是"+one.getAge()
	  +"  名字是"+one.getName()+"   性别是 "+one.isMale());
	 
	System.out.println(one.getName());
	System.out.println("他是男的？ "+one.isMale());
}
}