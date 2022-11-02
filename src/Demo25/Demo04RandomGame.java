package Demo25;

import java.util.Random;
import java.util.Scanner;

/*
 * 题目：
 * 用代码模拟猜数字的游戏
 * 
 * 思路：
 * 1.首先需要产生一个随机数字，并且一旦产生不再发生变化。Random的nextInt（）方法
 * 2.需要键盘输入，所以用到了Scanner
 * 3.获取键盘输入的数字，用Scanner当中的nextInt（）方法
 * 4.已经得到了两个数字，判断（if）一下：
 *            如果太大了，提升太大，并且重试：
 *            如果太小了，提升太小，并且重试：
 *           如果猜中了，提升结束。
 * 5.重试就是再来一次，循环次数不确定，用while（true）。可以用break结束
 *    
 */
public class Demo04RandomGame {

	public static void main(String[] args) {
           Random r =new Random();   //创建一个随机对象
           int randdomNum=r.nextInt(100)+1;   //1-100
           Scanner sc =new Scanner(System.in);//创建一个
           System.out.println("请输入你猜的数字  ");

           while(true) {
        	        int guessNum =sc.nextInt(); //键盘输入猜测的数字
        	   if(guessNum>randdomNum) {
            	   System.out.println("太大了，请重试");
               }else if(guessNum<randdomNum) {
            	   System.out.println("太小了，请重试");
               }else {
            	   System.out.println("中了");
            	   break;
               }
           }
           System.out.println("游戏结束");


        System.out.println("======================");
        System.out.println("2020.9.28---请输入");
        int a=new Random().nextInt(50)+1;

        while (true){
            int sca=new Scanner(System.in).nextInt();
            if (sca>a){
                System.out.println("大了");
            }else if (sca<a){
                System.out.println("小了");
            }else{
                System.out.println("对了");
                break;
            }
        }
	}

}
