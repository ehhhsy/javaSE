package Demo00;

/*����������������������������������������������
 ����ѭ��������
 1.��������жϴ���û�����������ôforѭ����whileѭ������ִ��0�Σ�����do-whileִ������һ��
 2.forѭ���ı�����С���ŵ��ж��壬֪��ѭ���ڲ��ſ���ʹ��  ����������
 ����while��do-whileѭ����ʼ����䱾���������� �����г���ѭ��֮�󻹿���ʹ��
 */
public class Demo05LoopDifference {
	public static void main(String[] args) {
		for(int i=1;i<0;i++) {
			System.out.println("������");
		} //û������,����forѭ������ִ��0��
		//System.out.println(i);  ����д�� ��forѭ�������i��ֻ��forѭ���Լ�����ʹ��
		System.out.println("=======================");
		int i=1;
		do {
			System.out.println("�����ͽ����");   
			i++;
		}while(i<0);  //û������,����do-whileִ������һ��
		System.out.println(i);   //2 while��do-whileѭ����ʼ����䱾���������� �����г���ѭ��֮�󻹿���ʹ��
		
        /*
         * 2020.7.18   ֤��for����ı���������������ʹ��
         */
		int [] array =new int [3];
		for (int j = 0; j < array.length; j++) {
              System.out.println("2020.7.18 test"+j);
		}
		
//		System.out.println(j); //����֤��for�ж���ı����������ó���ʹ��
		for (int a:array
			 ) {
			System.out.println(a);			//2020.9.13
		}
	}

}
