package Demo05;
/*
 * ʹ�ö�̬��ʼ�����飬���е�Ԫ�ؽ����Զ�ӵ��һ��Ĭ��ֵ����������
 * ������������ͣ���ôĬ��Ϊ0��
 * ����Ǹ��������ͣ���ôĬ��Ϊ0.0��
 * ������ַ����ͣ���ôĬ��Ϊ'/u0000'
 * �����boolean���ͣ���ôĬ��Ϊfalse��
 * ������������ͣ���ôĬ��Ϊnull��
 * 
 * Сע�����
 * ��̬��ʼ����ʵҲ��Ĭ��ֵ�Ĺ��̣�ֻ���� ϵͳ���ϰ�Ĭ��ֵ�滻��Ϊ�˴����ŵ��еľ�����ֵ
 *   ����˵��int[] array ={1,3,4}   ����Ĭ��ֵ��{0��0��0}��Ȼ��ϵͳ�����滻��1��3��4
 */
public class DemoArrayUse {

	public static void main(String[] args) {
	 int [] array =new int[3];
	 System.out.println(array);//�ڴ��ֵַ
	 System.out.println(array[0]); //0
	 System.out.println(array[1]);//0
	 System.out.println(array[2]);//0
	 System.out.println("=======");
	
	  //������123��ֵ��������array���е�1��Ԫ��
	 array[1] =123;
	 System.out.println(array);//�ڴ��ֵַ
	 System.out.println(array[0]); //0
	 System.out.println(array[1]);//123
	 System.out.println(array[2]);//0
	 
	 
	 char [] a=new char[3];
	 System.out.println(a[3]);
	 
	 

	}

}
