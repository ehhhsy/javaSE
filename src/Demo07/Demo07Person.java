package Demo07;
/*
 * 
 */
public class Demo07Person {

	public static void main(String[] args) {
		Person one =new Person();
        //set。不用写等号，因为是调用方法而已）
       one.show();
       one.setName("wangwu");
      // one.age=-20;//直接访问private内容，错误写法
       one.setAge(-20); //可以设置把关，把负的去掉
       one.show();
	}

}
