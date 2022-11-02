package Demo07;
  /*
   任何数据类型都能作为方法的参数  看图看图！！！！！！！！！！！！！！！！！！
   当一个对象作为参数，传递方法当中时，实际传递进去的是对象的地址值
   */
public class Demo05PhoneParam {
	/*public static void main(String[] args) {
              Phone one =new Phone();
              one.brand="苹果";
              one.price=8388.0;
              one.color="土豪金";
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
    	one.brand="小米";
    	one.changdu=133;
    	one.color="红色";
    	zzz(one);
    }
    public static void zzz (Phone param) {
    	System.out.println(param.brand);
    	System.out.println(param.changdu);
    	System.out.println(param.color);
    }
}
