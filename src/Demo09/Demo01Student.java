package Demo09;

public class Demo01Student {

	public static void main(String[] args) {
		Student stu1= new Student();
		stu1.setName("Ӱ��֮��");
		stu1.setAge(17);
		System.out.println("���֣�"+stu1.getName()+" ���䣺"+stu1.getAge());
		
		Student stu2 =new Student("��ķ",32);
		System.out.println("���֣�"+stu2.getName()+" ���䣺"+stu2.getAge());
        stu2.setName("����֮��");
        System.out.println("���֣�"+stu2.getName()+" ���䣺"+stu2.getAge());
	}

}
