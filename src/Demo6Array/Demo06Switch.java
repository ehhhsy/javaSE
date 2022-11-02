package Demo6Array;

import java.util.Random;

/*
【重点】   											不能是double
在switch(expression)语句中，expression的数据类型只能返回【int、byte、short和char】类型。
 * swicth 语句     
 *    default 后面的break可以省略，但是不推荐，
    原因：因为省略了break，default后面有case的话，就会继续执行直到break；
 */
public class Demo06Switch {
	public static void main(String[] args) {
		int num=7;
		switch (num) {    //括号
		case 1:   //冒号
			System.out.println("星期一");
			break;   //break；
		case 2:
			System.out.println("星期2");
			break;
		case 3:
			System.out.println("星期3");
		case 4:
			System.out.println("星期4");
			break;
		case 5:
			System.out.println("星期5");
			break;
		case 6:
			System.out.println("星期6");
			break;
		case 7:
			System.out.println("星期7");
			break;
			default:
				System.out.println("数据不合理");
				break;
			
		}
		int a=90;   //2020.6.4
		switch (a) {
		case 1:
		System.out.println("111");
		break;
		case 2:
			System.out.println("2222");
			break;
		case 3:
			System.out.println("3333");
			break;
		case 4:
			System.out.println("4444");
			break;
			default:
			System.out.println("输入错误");
		}
//         2020.7.20  switch
		String ahc="杜甫";
		switch (ahc) {
		case "李白":
			System.out.println("“人生得意须尽欢，莫使金樽空对月。天生我材必有用，千金散尽还复来。”");
			break;
		case "王维":
		System.out.println("青海长云暗雪山，孤城遥望玉门关。黄沙百战穿金甲，不破楼兰终不还");
		break;
		case "陆游":
			System.out.println("驿外断桥边，寂寞开无主。已是黄昏独自愁，更著风和雨。无意苦争春，一任群芳妒。" + "零落成泥碾作尘，只有香如故。");
		default:
			System.out.println("懂得都懂");
			break;
		}
		System.out.println("========================");
		Random r = new Random();
		int i = r.nextInt();
		switch (i){
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			case 1:
				System.out.println("1");
				break;
			case 4:
				System.out.println(i);
				break;
			default:
				System.out.println("真不行");
		System.out.println("========================");
		byte by=23;
		switch (by){
			case 20:
				System.out.println("20");
				break;
			case 23:
				System.out.println("23");
			case 21:
				System.out.println("21");
			default:
				System.out.println("gggg");	//2020.9.27
		 System.out.println("========================");

		}
		}
//		System.out.println("-----------2022-----------------");
//		System.out.println("请输入你的分数");   //有错
//		Random random = new Random();
//		int i1 = random.nextInt();
//		switch (i1){
//			case (100):
//				System.out.println("合格");
//				break;
//			default:
//				System.out.println("不合格");
//		}
	}

}
