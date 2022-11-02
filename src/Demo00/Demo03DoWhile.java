package Demo00;

/*
 * do -while循环的标准格式：
 * do{          //do 无条件先执行，【不管后面的条件判断，都要执行】
 *   循环体
 * }whlie（条件判断)；    后面的分号不要忘记！！！
 * 
 *  扩展格式：
 *  
 *  初始化语句
 *  do{
 *     循环体
 * 步进语句
 * }whlie（条件判断）； 
 */
public class Demo03DoWhile {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.println("张三起来把"+i);
			}
			System.out.println("============");
			
			int a=1; //初始化语句  
			do {  
				System.out.println("李四别睡了"); //循环体
				a++; //步进语句
			}while(a<=3); //条件判断
			System.out.println(a); //4
		
		    /*
		     * do-while
		     * 1。初始化语句
		     * do{ 
		     *    循环体
		     *  步进语句
		     * }；
		     * while(条件判断);
		     */
			System.out.println("===========");
			int sum=0;
		  do {
			  System.out.println(sum);   //2020.7.18
			  sum+=10;
		  }
		  while(sum<=40);

		System.out.println("===========");    //2020.9.12
		int hsy=0;
		do {
			System.out.println("hsynb,zhende");
			hsy++;
		}while (hsy<2);

		System.out.println("this is a new myself");	//2022.9.15
		String s="h";
		char c='d';
		do{
			s+=c;
			c++;
		}while(c<=117);
		System.out.println("the string is "+s);
	}

}
