package demo03;
//ʹ�÷�����ʱ��ע������
// ����Ӧ�ö������൱�У����ǲ����ٷ��������ٶ��巽����'����Ƕ��'
//���������ǰ��˳������ν
//'��������֮�󲻻�ִ��'�����ϣ��ִ�У�һ��Ҫ���ã����������ã���ӡ���ã���ֵ���á���
//��������з���ֵ���Ǳ���д�ϡ�return ����ֵ��������û��
//return����ķ���ֵ���ݣ�����ͷ����ķŻ�ֵ���ͣ���Ӧ����
//����һ��voidû�з���ֵ�ķ���������дreturn����ķ���ֵ��ֻ��д��return����
//����void�����������һ�е�return����ʡ�Բ�д
//һ���������п����ж��return��䣬���Ǳ��뱣֤ͬʱ֪��һ���ᱻִ�е�������return������д

/**
 * @author hsy
 * @since 10.21
 * @version
 */

public class Demo04Methodnotice {
	public static void main (String [] args) {
		System.out.println(getMax(3,5));    //����28�з���
		System.out.println(method1());
		method3();
		System.out.println(zuida(5+5,2+11));  //2020.5.30
	}

	/**
	 * ����10
	 * @return
	 */
   public static int method1() {
	   return 10;   //����ֵҪд
   }
   public static void method2() {
	   return;// û���⣬
   }

	/**
	 * ������
	 */
	public  static void method3() {
	   System.out.println("zzzzzzzzzzzz");
	   System.out.println("ssssssssssss");
	   return;//���һ�п��Բ�дreturn
   }
   //��10�����ӣ���Ŀ������ȡ���ֵ

	/**
	 * ��ȡ���������ֵ
	 * @param a
	 * @param b
	 * @return
	 */
   public static int getMax(int a,int  b) {
//	   int max;
//	   if(a>b) {
//		   max =a;             ��ע�������޹أ�ֻ����Ŀ��д������1
//	   }
//	   else {
//		   max=b;
//	   }	   
	   if (a>b) {
		   return a;          
	   }                           //����ǵ�10������ ,�Ե�
	   else {
		   return b;
	   }
   }
   public static int zuida (int a,int b) {
	   int big =0;
	   if (a>b) {
		   big+=a;
	   }
	   else{
		   big+=b;
	   }
	   return big;
	   
	   /*
	    * if (a>b) {
		   return a;
	   }
	   else{
		   return b;
	   }
	    */
	    
	    
   }
}
