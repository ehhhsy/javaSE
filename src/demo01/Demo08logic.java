package demo01;
/*
 * 与（并且） &&  全是true ，才是true 否则就是false
 * 或（或者） ||  至少一个是true ，就是ture，全是false，才是false
 * 非（取反） ！    本来是true 变成false 本来是false 变成true
 * 
 * 与&&，或 ||,具有短路效果，如果根据左边已经可以判断得到最终结果，那么右边的代码不再执行，节省性能
 *  👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇
 *
 *  注意事项：
 *  1.逻辑运算符只能用于boolean值
 *  2.与，或两个需要左右各自一个boolean值，但是取反只要唯一一个boolean值就行了
 *  3.与，或两种运算符，如果有多个条件，可以连续写
 *  两个条件        条件a&&条件b
 *  多个条件        a&&条件b&&条件c
 */
public class Demo08logic {
	public static void main(String[] args) {
		 System.out.println( true && false); //false
		 
		 System.out.println( true && true); //true
		 
		 //true && true --> true
		 System.out.println( 3<4 && 10>5); //true
		 
		 System.out.println("=============");
		 System.out.println( true || true); //true
		 System.out.println(true || false); //true
		 
		 System.out.println("=============");
		System.out.println(true); //true
		System.out.println(!true);//false    但是取反只要唯一一个boolean值就行了
		 System.out.println("=============");
		int a=10;
		//false && ..  &&要全部都是true才是true  如果根据左边已经可以判断得到最终结果，那么右边的代码不再执行
		System.out.println(3>4 && ++a<100); //false
		System.out.println(a);   //10   右边的代码没有执行
		
		 System.out.println("=============");
		 
		 int b=20;
		 //true || ...   ||只要任意一个true都是ture 如果根据左边已经可以判断得到最终结果，那么右边的代码不再执行
		 System.out.println(3<4 || ++b<100); //true
		 System.out.println(b); //20 右边的代码不再执行

		System.out.println("=====================");
		int aaa=10;
		int bbb=20;
		System.out.println(aaa>4&&bbb<=20);//true
		System.out.println(aaa<4&&bbb<=20);//false				2020.9.13
		System.out.println(aaa<4||bbb<=20);//true
		System.out.println(aaa<4||bbb>20);//false
	}

}
