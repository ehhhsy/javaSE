package Demo26;

import java.util.ArrayList;
import java.util.Arrays;

/*
  * ��Ŀ:������ָ����ʽ��ӡ���ϵķ���(ArrayList������Ϊ���� ),ʹ��{}������,ʹ��@�ָ�ÿһ��Ԫ��.
  * ��ʽ����{Ԫ��@Ԫ��@Ԫ��}
  * 
  * System.out.print(list.size())  {..,..,..,}
  * printArray(list)          {...@..@..@}
  */
public class Demo07AarrayListTestthree {

	public static void main(String[] args) {
          ArrayList<String> list =new ArrayList<>();
          list.add("�ִ�");
          list.add("����");
          list.add("�ʵ�");
          System.out.println(list);
          System.out.println("==========");
          printArray(list);
		System.out.println("==========");
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(1022);
		l.add(1022221123);
		print(l);
		System.out.println("==========");
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("�人");
		list1.add("����");
		list1.add("��");
		printABC(list1);
	}
	/*���巽������Ҫ��
	 * ����ֵ����:ֻ�ǽ��д�ӡ����,û������,û�н��,������void
	 *��������:printArray�����
	 * �����б�:ArrayList
	 */
	public static void printArray(ArrayList<String> list){
		System.out.print("{");
		for (int i = 0; i < list.size(); i++) {
			String name =list.get(i);
			if (i==list.size()-1) {
				System.out.print(name+"}");
			}else {
		  System.out.print(name+"@");
			}
		}


	}
	public static void print(ArrayList <Integer>list){
		System.out.print("[");
		for (int i = 0; i < list.size(); i++) {
			int abc=list.get(i);
			if (i==list.size()-1){
				System.out.print(abc+"]");
			}else {
				System.out.print(abc+"@");
			}
		}
	}



	public static void printABC(ArrayList<String> list){
		System.out.print("[");
		for (int i = 0; i < list.size(); i++) {
			String name=list.get(i);
			if (i==list.size()-1){
				System.out.print(name+"]");
			}else{
				System.out.print(name+"@");
			}
		}
	}
}


