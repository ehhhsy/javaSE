package Demo00;

/*
 * do -whileѭ���ı�׼��ʽ��
 * do{          //do ��������ִ�У������ܺ���������жϣ���Ҫִ�С�
 *   ѭ����
 * }whlie�������ж�)��    ����ķֺŲ�Ҫ���ǣ�����
 * 
 *  ��չ��ʽ��
 *  
 *  ��ʼ�����
 *  do{
 *     ѭ����
 * �������
 * }whlie�������жϣ��� 
 */
public class Demo03DoWhile {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.println("����������"+i);
			}
			System.out.println("============");
			
			int a=1; //��ʼ�����  
			do {  
				System.out.println("���ı�˯��"); //ѭ����
				a++; //�������
			}while(a<=3); //�����ж�
			System.out.println(a); //4
		
		    /*
		     * do-while
		     * 1����ʼ�����
		     * do{ 
		     *    ѭ����
		     *  �������
		     * }��
		     * while(�����ж�);
		     */
			System.out.println("===========");
			int sum=0;
		  do {
			  System.out.println(sum);   //2020.7.18
			  sum+=10;
		  }
		  while(sum<=40);

		System.out.println("===========");    //2020.9.12
		int hsy=0;
		do {
			System.out.println("hsynb,zhende");
			hsy++;
		}while (hsy<2);

		System.out.println("this is a new myself");	//2022.9.15
		String s="h";
		char c='d';
		do{
			s+=c;
			c++;
		}while(c<=117);
		System.out.println("the string is "+s);
	}

}
