package Demo6Array;
  /*     default 后面的break可以省略，但是不推荐，
   * 原因：因为省略了break，default后面有case的话，就会继续执行直到break；
   * switch语句使用的注意事项：
   * 1，多个case后面的数值不可以重复  （不能case1   后面又来给case1）
   * 2，switch后面小括号当中只能是下列数据类型！！！！！！！！！！！
   *                基本数据类型：byte/short/char/int
   *                引用数据类型：string字符串，enum枚举
   * 3.switch语句可以很灵活：前面顺序可以颠倒，而且break语句还可以省略。！！！！！！！！！！！！！！！！！
   *  “匹配到哪一个case就向下执行，直到遇到了break或者整体结束为止”！！！！！！！！！！！！！！！！！！！！
   */
public class Demo07Switch2 {
	public static void main(String[] args) {
		int num=2;
		switch(num) {
		case 1:                                   
		System.out.println("那就是case1啦");
		break;
		case 2:                                       //前面顺序可以颠倒 case2 -case4
			System.out.println("那就是case2啦");
			//break;         break可以省略，省略的话就要找到下一个break才能返回，因此输出                        那就是case2啦  那就是case4啦   
		case 4:
			System.out.println("那就是case4啦");
			break;
		default:
			System.out.println("那就是default啦");    //default---case5
			break;
		case 5:
		System.out.println("那就是case5啦");
		break;
}
	
	
	String aa = "1334";     //2020.6.4
	switch(aa) {
	case "1334":
		System.out.println("密码正确");
		break;
	
	default:
		System.out.println("密码错误");
	 break;
	}
          
	int a=3;
	switch (a) {
	case 1:
		           int b=1;
        break;
	case 2:
		           int b1=2;                  //2020.7.20
		break;
	case 3:
		           int b2=3;
		break;
	default:
		           int b3=3;
		break;
	}
}
}