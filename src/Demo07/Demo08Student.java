package Demo07;
//����ֱ�ӷ��ʣ�����set�Ž�ȥ��get�ó���
public class Demo08Student {
	public static void main(String [] args) {
	Student one= new Student();
	one.setName("��");
	one.setAge(19);
	one.setMale(true);
	one.setName("��");
	one.setMale(false);
	System.out.println("������"+one.getAge()
	  +"  ������"+one.getName()+"   �Ա��� "+one.isMale());
	 
	System.out.println(one.getName());
	System.out.println("�����еģ� "+one.isMale());
}
}