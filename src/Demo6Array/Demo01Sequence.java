package Demo6Array;

import java.util.ArrayList;

/*
   * ��if ��� 
   * 
   */
public class Demo01Sequence {

	public static void main(String[] args) {
		
    int age =19;
    if(age>18) {
    	System.out.println("�����ϵ�");
    	System.out.println("����..");
    	System.out.println("��̬��ը���ؼ�");
    }
    else {
    	System.out.println("�����ϵ�");
    }
	
	System.out.println("====================");
	String dui ="����ʯ";
	if (dui.equals("����ʯ")) {
		System.out.println("ǽ����֦÷���躮���Կ���");
		System.out.println("ң֪����ѩ��Ϊ�а�������");
	}
	else {
		System.out.println("��������ʯ");
	}
     
	float hun =3.14F;
	if(hun==3.14F) {
		System.out.println("��=3.1415926535 8979323846");   //2020.7.20
	}else {
		int a=1;
	}
		System.out.println("====================");
		boolean [] booleans =new boolean[2];
		if (booleans[1]==false){
			System.out.println("�治��");				//2020.9.16
		}else{
			System.out.println("�Ҿ��ò���");
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
