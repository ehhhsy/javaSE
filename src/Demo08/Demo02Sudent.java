package Demo08;

public class Demo02Sudent {

	public static void main(String[] args ) {
		
		Student one =new Student();  //�޲ι��췽��ִ����
		//��ʵ������ʹ�ù��췽����һ����
		
        Student two =new Student("����а",32);
        System.out.println("���� :"+two.getName()+",����:"+two.getAge());
        //�����Ҫ�ı�����еĳ�Ա�����������ݣ���Ȼ��Ҫʹ��setXxx����
        two.setAge(44);
        System.out.println("���� :"+two.getName()+",����:"+two.getAge());
	}

}
