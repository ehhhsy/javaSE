 package Demo6Array;
/*
 * if else .. else if ...else if  ..else
 */
public class Demo04IfElsePractise {

	public static void main(String[] args) {
		int score=766;
		if(score>=90 &&score<=100) {
			System.out.println("�����ϵ�");
		}
		else if (score>=80 &&score<=90) {
			System.out.println("�����ϵ�");
		}
		else if (score>=70 &&score<=80) {
			System.out.println("���а�,�ϵ�");
		}
		else if (score>=60 &&score<=70) {
			System.out.println("�����ϵ�");
		}
		else if (score>=0 &&score<=60) {
			System.out.println("�������ϵ�");
		}
		else {
			System.out.println("��ĳɼ��������ϵ�");
		}

	int SL = 3;
	if(SL>5) {

		System.out.println("��̫����");
	}
	else if(SL<5&&SL>3) {
		System.out.println("����");
	}
	else if(SL<3&&SL>0) {
		System.out.println("��Ե�");
	}
	else {
		System.out.println("Ӫ������");
	}
  System.out.println("===============");
	 int S=1;
	 if(S==11) {
		 System.out.println(1);
	 }else if (S==2){
		 System.out.println(2);
	 }else if(S==3){
		 System.out.println(3);
	 }else if (S==4){
		 System.out.println(4);
	 }else {
		 System.out.println("wu");
	 }
	 System.out.println("===============");

	}
} 