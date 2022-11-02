package Demo00;

/*
 * 【break】 关键字用法有常见的两种：
 * 1.可以用在switch语句中，一旦执行，整个switch语句立刻结束/
 * 2.还可以用在循环语句当中，【一旦执行【整个】循环语句立刻结束，打断循环】
 * 
 * 关于循环的选择，有关【小建议】：
 * 凡是次数确定的场景多用for循环，否则多用while循环，do-while少见
 */
public class Demo06Break {
      public static void main(String[] args) {
		  for (int i = 1; i <= 10; i++) {
			  if (i == 4) { //当前是第四次
				  break;//那么打断【整个循环】
			  }
			  System.out.println("hello" + i);
		  }

//    	  2020.7.18 for+break 练习
		  for (int i = 0; i <= 4; i++) {
			  if (i == 3) {
				  break;
			  }
			  System.out.println("德玛西亚之力killing" + i + "人");
		  }
		  System.out.println("this is new one"); //2022.9.15
		  int[] singer = new int[20];
		  for (int index = 1; index < 20; index++) {
			  if (index % 2 == 0) {
				  singer[index] = index;
				  index++;
			  }else{
				  singer[index] = index;
				  index++;
			  }

		  }
		  for (int i = 0; i < singer.length; i++) {
			  System.out.print(singer[i]+" ");
		  }
	  }
}
