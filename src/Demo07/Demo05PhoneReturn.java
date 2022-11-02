package Demo07;
/*  看图！！！！！！！！！！！！！！！！！！！！！！！
 使用对象类型作为方法的放回值 
  当一个对象作为参数，传递方法当中时，实际传递进去的是对象的地址值
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
			one.brand="华为";
			one.price=8388.00;
			one.color="玫瑰金";
			return one;
		}

	

}
