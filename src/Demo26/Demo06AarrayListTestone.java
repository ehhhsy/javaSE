package Demo26;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
    * ��Ŀ:����6��1-33֮����������,��ӵ�����,���ұ�������
    *
    * 1.��Ҫ�洢6������,����һ������<Integer>
    * 2.���������,��Ҫ�õ�Random
    * 3.��ѭ��6��,������6�������,forѭ��
    * 4 .ѭ���ڵ���random.nextInt(33)+1
    * 5.��������ӵ�������:add
    * 6.��������,for.size.get
    */
public class Demo06AarrayListTestone {

	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<>();  //����һ��ArrayList����     ������ Integer
    Random random =new Random();          //����һ��Random����
    for (int i = 0; i < 6; i++) {
		int num=random.nextInt(33)+1; //��ʦ˼·  ��for��������
		list.add(num);
	}
    for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}
  /*  int one =random.nextInt(33)+1;
    int two =random.nextInt(33)+1;    // �Լ���˼·���а�
    int three =random.nextInt(33)+1;
    int four =random.nextInt(33)+1;
    int five =random.nextInt(33)+1;
    int six =random.nextInt(33)+1;
    */
    
   /* list.add(one);
    list.add(two);
    list.add(three);
    list.add(four);
    list.add(five);
    list.add(six);
*/
		/*
		 * ��Ŀ:����6��1-33֮����������,��ӵ�����,���ұ�������
		 *
		 * 1.��Ҫ�洢6������,����һ������<Integer>
		 * 2.���������,��Ҫ�õ�Random
		 * 3.��ѭ��6��,������6�������,forѭ��
		 * 4 .ѭ���ڵ���random.nextInt(33)+1
		 * 5.��������ӵ�������:add
		 * 6.��������,for.size.get
		 */
		System.out.println("=====================");
		ArrayList<Integer> listi = new ArrayList<>();
		for (int i1 = 0; i1 < 6; i1++) {
			int i = new Random().nextInt(33) + 1;
			listi.add(i);
		}
		for (int i = 0; i < listi.size(); i++) {
			System.out.print(listi.get(i)+"  ");
		}

	}

}
