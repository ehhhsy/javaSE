package Demo6Array;

import java.util.Random;

/*
���ص㡿   											������double
��switch(expression)����У�expression����������ֻ�ܷ��ء�int��byte��short��char�����͡�
 * swicth ���     
 *    default �����break����ʡ�ԣ����ǲ��Ƽ���
    ԭ����Ϊʡ����break��default������case�Ļ����ͻ����ִ��ֱ��break��
 */
public class Demo06Switch {
	public static void main(String[] args) {
		int num=7;
		switch (num) {    //����
		case 1:   //ð��
			System.out.println("����һ");
			break;   //break��
		case 2:
			System.out.println("����2");
			break;
		case 3:
			System.out.println("����3");
		case 4:
			System.out.println("����4");
			break;
		case 5:
			System.out.println("����5");
			break;
		case 6:
			System.out.println("����6");
			break;
		case 7:
			System.out.println("����7");
			break;
			default:
				System.out.println("���ݲ�����");
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
			System.out.println("�������");
		}
//         2020.7.20  switch
		String ahc="�Ÿ�";
		switch (ahc) {
		case "���":
			System.out.println("�����������뾡����Īʹ���׿ն��¡������Ҳı����ã�ǧ��ɢ������������");
			break;
		case "��ά":
		System.out.println("�ຣ���ư�ѩɽ���³�ң�����Źء���ɳ��ս����ף�����¥���ղ���");
		break;
		case "½��":
			System.out.println("������űߣ���į�����������ǻƻ���Գ��������ꡣ�����������һ��Ⱥ���ʡ�" + "���������������ֻ������ʡ�");
		default:
			System.out.println("���ö���");
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
				System.out.println("�治��");
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
//		System.out.println("��������ķ���");   //�д�
//		Random random = new Random();
//		int i1 = random.nextInt();
//		switch (i1){
//			case (100):
//				System.out.println("�ϸ�");
//				break;
//			default:
//				System.out.println("���ϸ�");
//		}
	}

}
