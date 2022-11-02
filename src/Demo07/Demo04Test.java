package Demo07;
/*//看图看图看图！！！！！
 *用main方法就可以启动，
 */
public class Demo04Test {

	public static void main(String[] args) {
		
		Phone stu =new Phone();
		System.out.println(stu.brand); 
		System.out.println(stu.changdu);
		System.out.println(stu.weigth);
		
		//phone.brand="ss"; 可以这里赋值，然后打印出【ss】
		 stu.play();
		 stu.takephone();
		 stu.call("蛙蛙");
	}

}
