package Demo08;

public class Demo01Person {

	public static void main(String[] args) {
		Person one = new Person();
		
		one.name="小李飞刀";
		one.sayhallo("王一");  //没有加this之前。王一你好，我叫王一
        System.out.println(one); //地址值@279f2327和this一样
	}

}
