package Demo00;

/*
 * continue�ؼ���
 * ��һ��ѭ���������
 * һ��ִ�У�����������ǰѭ��ʣ�����ݣ����Ͽ�����һ��ѭ����
 *
 */
public class Demo07Continue {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            if (i == 4) {  //����4��
                continue; //����4�㣬���Ͽ�ʼ��һ�Σ�5�㣩
            }
            System.out.println(i + "�㵽��");
        }
        System.out.println("==============");
//       2020.7.18 while+continue ��ϰ
        int w = 1;
        while (w <= 4) {
            if (w % 2 == 0) {
                w++;
                continue;
            }
            System.out.println("2020.7.18 while+continue ��ϰ" + w);
            w++;
        }
        int c = 1;
        do {
            if (c == 4) {
                c++;
                continue;
            }
            System.out.println("�ⶰ¥��" + c + "��");    //2020.7.18 do-while+continue ��ϰ
            c++;
        } while (c <= 6);

        System.out.println("==============");
        for (int i = 1; i < 6; i++) {
            if (i == 5) {                                //"2020.9.13"
                i++;
                continue;
            }
            System.out.println("2020.9.13" + i);
        }
		System.out.println("==============");
		int abc = 1;
        while (abc<=5){
        	if (abc==4){
				abc++;
        		continue;							//"2020.9.13"
			}
			System.out.println(abc);
			abc++;
        }
        for (int louti = 1; louti <= 10; louti++) {
            if(louti==4){
                System.out.println(louti-1+"*¥����");
                continue;
            }
            System.out.println(louti+"¥����");
        }

    }
}