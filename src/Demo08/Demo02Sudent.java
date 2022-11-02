package Demo08;

public class Demo02Sudent {

	public static void main(String[] args ) {
		
		Student one =new Student();  //无参构造方法执行了
		//其实就是在使用构造方法，一样的
		
        Student two =new Student("黄老邪",32);
        System.out.println("姓名 :"+two.getName()+",年龄:"+two.getAge());
        //如果需要改变对象当中的成员变量数据内容，任然需要使用setXxx方法
        two.setAge(44);
        System.out.println("姓名 :"+two.getName()+",年龄:"+two.getAge());
	}

}
