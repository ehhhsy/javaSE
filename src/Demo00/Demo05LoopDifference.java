package Demo00;

/*！！！！！！！！！！！！！！！！！！！！！！！
 三种循环的区别：
 1.如果条件判断从来没有满足过，那么for循环和while循环将会执行0次，但是do-while执行至少一次
 2.for循环的变量在小括号当中定义，知有循环内部才可以使用  看下面例子
 但是while和do-while循环初始化语句本来就在外面 ，所有出来循环之后还可以使用
 */
public class Demo05LoopDifference {
	public static void main(String[] args) {
		for(int i=1;i<0;i++) {
			System.out.println("机器人");
		} //没有满足,但是for循环将会执行0次
		//System.out.println(i);  错误写法 在for循环定义的i，只能for循环自己才能使用
		System.out.println("=======================");
		int i=1;
		do {
			System.out.println("法外狂徒张三");   
			i++;
		}while(i<0);  //没有满足,但是do-while执行至少一次
		System.out.println(i);   //2 while和do-while循环初始化语句本来就在外面 ，所有出来循环之后还可以使用
		
        /*
         * 2020.7.18   证明for定义的变量出来，不可以使用
         */
		int [] array =new int [3];
		for (int j = 0; j < array.length; j++) {
              System.out.println("2020.7.18 test"+j);
		}
		
//		System.out.println(j); //报错，证明for中定义的变量，不能拿出来使用
		for (int a:array
			 ) {
			System.out.println(a);			//2020.9.13
		}
	}

}
