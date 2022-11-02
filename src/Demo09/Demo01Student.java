package Demo09;

public class Demo01Student {

	public static void main(String[] args) {
		Student stu1= new Student();
		stu1.setName("影流之主");
		stu1.setAge(17);
		System.out.println("名字："+stu1.getName()+" 年龄："+stu1.getAge());
		
		Student stu2 =new Student("塔姆",32);
		System.out.println("名字："+stu2.getName()+" 年龄："+stu2.getAge());
        stu2.setName("河流之主");
        System.out.println("名字："+stu2.getName()+" 年龄："+stu2.getAge());
	}

}
