package Demo00;

/*
 * Ƕ��ѭ��������������������������������������������������������������������
 */
public class Demo09LoopAndMinute {

	public static void main(String[] args) {
//		for(int hour=0;hour<=24;hour++) { //������Сʱ
//			for(int minute=0;minute<60;minute++) {
//				for(int second=0;second<60;second++) {
//					System.out.println(hour+"��"+minute+"Сʱ"+second+"��");
//				}
//			}
//
//		}
//		for(int hour=0;hour<=24;hour++){
//			for (int minute=0;minute<60;minute++){
//				for(int sec=0;sec<60;sec++){
//					System.out.println(+hour+":"+minute+":"+sec);
//				}
//			}
//		}
		for(int z=1;z<=9;z++){			//2022.9.15
			for (int f=1;f<=z;f++){
				System.out.print(z+"*"+f+'='+z*f+"  ");
			}
			System.out.println();
		}
	}
}
