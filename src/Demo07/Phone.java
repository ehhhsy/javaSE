package Demo07;
 /*
  *����һ���࣬����ģ�⡰�ֻ�������
  *
  *���ԣ�Ʒ�ƣ����ȣ���������ɫ���۸�
  *��Ϊ����绰��������
  *
  *��Ӧ���൱��
  *��Ա���������ԣ�
  * string brand
  * int changdu
  * double weigth
  * 
  * ��Ա��������Ϊ��
  * public void takephone() {}
  * public void play() {}
  *  public  void call(String who) {}
  */
public class Phone {
	String brand="��ǿ��";
     int changdu=33;
     double weigth=12.3;
     double price;
     String color;
     
     public void takephone() {
    	 System.out.println("��绰");
     }
     public void play() {
    	 System.out.println("����Ϸ");
     }
     public  void call(String who) {
    	 System.out.println("��"+who+"��绰");
     }
}
