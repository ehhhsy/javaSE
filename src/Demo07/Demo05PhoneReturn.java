package Demo07;
/*  ��ͼ����������������������������������������������
 ʹ�ö���������Ϊ�����ķŻ�ֵ 
  ��һ��������Ϊ���������ݷ�������ʱ��ʵ�ʴ��ݽ�ȥ���Ƕ���ĵ�ֵַ
 */
public class Demo05PhoneReturn {

	public static void main(String[] args) {
		Phone two= getPhone();
		System.out.println(two.brand);
		System.out.println(two.price);
		System.out.println(two.color);
		}
		public static Phone getPhone() {
			Phone one =new Phone();
			one.brand="��Ϊ";
			one.price=8388.00;
			one.color="õ���";
			return one;
		}

	

}
