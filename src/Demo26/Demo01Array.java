package Demo26;
/*
 * ��Ŀ����һ�����飬�����洢3��person����
 * 
 * ����������һ��ȱ�㣺
 * һ�����������������ڼ䳤�Ȳ����Է����ı䡣
 */
public class Demo01Array {

	public static void main(String[] args) {
        Person[] array =new Person[3]; 
		System.out.println(array[0]); //null
		
		Person one =new Person("�����Ȱ�",20);
		Person two =new Person("��������",19);
		Person three =new Person("���զ��",40);
		
	
//				System.out.println(array[0]=new Person("�����Ȱ�",20));
	  
		
		//��one���еĵ�ֵַ���Ƶ������0��Ԫ��λ��
		array[0]=one;
		array[1]=two;
		array[2]=three;
		System.out.println(array[0]); //@28a418fc
		System.out.println(array[1]); //@5305068a
		System.out.println(array[2]); //@1f32e575
		
		System.out.println(array[1].getName());
		//1��Ԫ����two�ĵ�ַ�������ǹ�������

		
		Person person =array[1];
	}
	
	

}
