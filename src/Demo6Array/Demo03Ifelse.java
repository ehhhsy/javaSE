package Demo6Array;
/*
 * Сѧ��Ŀ 3��ѡ��һ
 * ���x>=3 ��ô������
 * ���x>=1,x<3 ��ô������
 * ���x<0 ��ô������
 */
public class Demo03Ifelse {
	public static void main(String[] args) {
		double x=3.9;
		int y=0;
		if(x>=3) {
			y=2*(int)x+ 30;
			System.out.println("��һ�ֽ����"+y);  //
		}
		else if(x>=1 && x<3) {
			y=5*(int)x+10;
			
			System.out.println("�����"+y);
		}
		else {
			System.out.println("99");
		}
		
		/*
		 * int a=555;
		if(a<1) {
			System.out.println("gg");
		}
		else if(a<10){
			System.out.println("ggg");
		}
		else if(a<100) {
			System.out.println("��gggg");
		}
		else if(a<1000) {
			System.out.println("��ggggggggg");
		}
		System.out.println("���");
		*/

/* Сѧ��Ŀ 3��ѡ��һ
* ���x>=3 ��ô������
* ���x>=1,x<3 ��ô������
* ���x<0 ��ô������   2020.6.4
*/
int z =1;
if(z>=3) {
	System.out.println("1");
}else if(z<=3&&z>=1) {
	System.out.println("2");					//2020.9.16
}else if(z<0) {
	System.out.println("3");
}else {
	System.out.println("���ڸ���");
}

		System.out.println("=================");
int h=2;
if (h>=3){
	h--;
	System.out.println(h);
}else if(h>=1&&h<3) {
	++h;
	System.out.println(h);  //?

}else if (h<1){
	System.out.println("2020.9.27");
}
		/* Сѧ��Ŀ 3��ѡ��һ
		 * ���x>=3 ��ô������
		 * ���x>=1,x<3 ��ô������
		 * ���x<0 ��ô������   2020.6.4
		 */
		System.out.println("------------------2022-------------");

}
}
















	