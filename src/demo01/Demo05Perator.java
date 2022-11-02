package demo01;
/*
 * 自增：++
 * 自减：--
 * 使用格式：可以++num，num++，    --num，++num 但是👇
 * 
 * 使用方法：
 * 1.单独使用：不和其他操作混合，自己独立成为一个步骤
 * 2。在混合的时候，有【重大区别】
 *   A。如果是【前++】那么变量【马上+1】。然后拿着结果在进行使用            【先加后用】
 *   B.如果是【后++】那么首先使用变量原来的数值，【然后再让变量+1】      【先用后加】
 *   
 *   注意事项：
 *   只是变量才能使用自增，自减，常量不可以发生改变，所以不能用    （30++  //错误）
 */
public class Demo05Perator {

	public static void main(String[] args) {
		int num1=10;
		System.out.println(num1); //10
		num1++;  //单独使用
		//++num1;//单独使用
		System.out.println(num1); //11
          System.out.println("================");
          
          //与打印混合使用
          int num2=20;
          System.out.println(++num2); //【先加后用】 21
          System.out.println(num2);//21
          System.out.println(num2++);  //【先用后加】 21
          System.out.println(num2);//22
          System.out.println("================");
          
          int num3=40;
          //和赋值混用
          int result1=--num3;//混合使用，前--，变量立刻马上-1变成39.然后将结果交给result1变量
          System.out.println(result1); //39
         System.out.println(num3);   // 39  已经减了回不去了
         System.out.println("================");
         
         int num4 =50;
         int result2 =num4--;
         System.out.println(result2); // 50   说了是先用再减 ，所以还没用是50
         System.out.println(num4); //49
         System.out.println("================");
         
         int x =10;
         int y=20;
         int result3 =++x +y--;
         System.out.println(result3);//31   只是练习，正常情况代码应该简洁明了
         System.out.println(x);//11
         System.out.println(y);//19

        //2020.9.13

        System.out.println("this is new one======"); //2022.9.15
        int w=20;
        int q=10;
        System.out.println(w);
        System.out.println(q);
        System.out.println(w++);
        System.out.println(w);
        System.out.println(--w);

	}

}
