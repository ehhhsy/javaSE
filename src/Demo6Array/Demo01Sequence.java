package Demo6Array;

import java.util.ArrayList;

/*
   * 单if 语句 
   * 
   */
public class Demo01Sequence {

	public static void main(String[] args) {
		
    int age =19;
    if(age>18) {
    	System.out.println("来吧老弟");
    	System.out.println("遇到..");
    	System.out.println("心态爆炸，回家");
    }
    else {
    	System.out.println("滚吧老弟");
    }
	
	System.out.println("====================");
	String dui ="王安石";
	if (dui.equals("王安石")) {
		System.out.println("墙角数枝梅，凌寒独自开。");
		System.out.println("遥知不是雪，为有暗香来。");
	}
	else {
		System.out.println("不是王安石");
	}
     
	float hun =3.14F;
	if(hun==3.14F) {
		System.out.println("π=3.1415926535 8979323846");   //2020.7.20
	}else {
		int a=1;
	}
		System.out.println("====================");
		boolean [] booleans =new boolean[2];
		if (booleans[1]==false){
			System.out.println("真不错");				//2020.9.16
		}else{
			System.out.println("我觉得不行");
		}

		System.out.println("====================");
		int a=3;
		if (a < 2) {
			a++;
		}else{
			a--;
		}
		System.out.println(a);  //2
		System.out.println("-----------------2022------------");
		String s="fare1";
		if ("fare".equals(s)){
			System.out.println("right, is fare");
		}else {
			System.out.println("sorry");
		}
	}
}
