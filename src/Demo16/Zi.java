package Demo16;
 /*
  * super�ؼ��ֵ��÷������֣�
  * 1.����ĳ�Ա�����У����ʸ���ĳ�Ա���� 
  * 
  * 2����ĳ�Ա�����У����ʸ���ĳ�Ա����
  * 
  *  3.����Ĺ��췽���У����ʸ���Ĺ��췽��
  */
public class Zi extends Fu {
  int num =10;
  
  public void methodZi() {
	  System.out.println(num);
	  System.out.println(super.num); //�����е�num
//	  1.����ĳ�Ա�����У����ʸ���ĳ�Ա���� 
	 } 
	  public void method() {
		  super.method();//���෽��
//		  2����ĳ�Ա�����У����ʸ���ĳ�Ա���� 
	    	System.out.println("���෽��");
	    }
	   public Zi() {
		   super();
		   System.out.println("���๹�췽��");   
	   }
  
}
