package Demo07;
  /*
   �κ��������Ͷ�����Ϊ�����Ĳ���  ��ͼ��ͼ������������������������������������
   ��һ��������Ϊ���������ݷ�������ʱ��ʵ�ʴ��ݽ�ȥ���Ƕ���ĵ�ֵַ
   */
public class Demo05PhoneParam {
	/*public static void main(String[] args) {
              Phone one =new Phone();
              one.brand="ƻ��";
              one.price=8388.0;
              one.color="������";
              method(one);
		}
		public static void method (Phone param) {
			System.out.println(param.brand);
			System.out.println(param.price);
			System.out.println(param.color);
		}
*/
	
    public static void main (String [] args) {  //2020.6.8
    	Phone one = new Phone();
    	one.brand="С��";
    	one.changdu=133;
    	one.color="��ɫ";
    	zzz(one);
    }
    public static void zzz (Phone param) {
    	System.out.println(param.brand);
    	System.out.println(param.changdu);
    	System.out.println(param.color);
    }
}
