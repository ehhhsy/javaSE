package Demo26;

import java.util.ArrayList;
import java.util.Random;

/*
 * ��Ŀ:��һ���󼯺ϴ���20�������,Ȼ��ɸѡ���е�ż��Ԫ��,����С���ϵ���
 * Ҫ��ʹ���Զ���ķ�����ɸѡ
 * 
 * ����:
 * 1 ��Ҫ����һ���󼯺�,�����洢int����,<Integer>
 * 2.������־���Random,nextInt
 * 3.ѭ��20��,��������ַ��뼯��:for,add����
 * 4.����һ������ɸѡ
 * ��Ҫ��:
 * ����ֵ����:arrayListС����(����Ԫ�ز�ȷ��)
 * ��������; ���
 * �����б� : arrayList�󼯺�(20���������)
 * 5.�ж���if��ż��
 * 6.�����ż�����Ƿ���С����
 */
  
public class Demo08ArrayListReturn {

	public static void main(String[] args) {
           ArrayList<Integer> one =new ArrayList<>();//�󼯺�
           Random r =new Random();
           for (int i = 0; i < 20; i++) { //����20��int���ֵ�one������
			  int num =r.nextInt(10)+1; //1-10
			  one.add(num);                  
		}
           System.out.println(one);
           System.out.println("�������"+one.size()+"�����");
           
           System.out.println(SX(one));
           System.out.println("ż����"+SX(one).size()+"��");

		System.out.println("===========================");
		ArrayList<Integer> sss = sss(new ArrayList<Integer>());
		System.out.println(sss);
	}
     
	//����һ������,ɸѡ
	public static  ArrayList<Integer> SX ( ArrayList<Integer> one){  //�Լ�д��
		ArrayList<Integer> two =new ArrayList<>();
		for (int i = 0; i < one.size(); i++) {
			if (one.get(i)%2!=0) {
				one.remove(i);
				}else {
				two.add(one.get(i));
				}			
		}
		return two;
	}

	public static ArrayList<Integer> sss(ArrayList<Integer>list){
		for (int i1 = 0; i1 < 20; i1++) {
			int i = new Random().nextInt(10)+1;
			if (i%2==0){
				list.add(i);
			}//2020.10.15
		}
		return list;
	}
}
