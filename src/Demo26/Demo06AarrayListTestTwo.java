package Demo26;

import java.util.ArrayList;
/*
 * ��Ŀ:
 * 1.�Զ���4��ѧ������,��ӵ�����,����������
 * 2.����һ������,�����洢ѧ������,����<Students>
 * 3.������,����4��ѧ������
 * 4.��4��ѧ��������ӵ�������:add
 * 5.��������:for,size,get
 */
public class Demo06AarrayListTestTwo {
	public static void main(String[] args) {
          ArrayList<Students> list =new ArrayList<>();   
	  Students s1 =new Students("���", 20);
	  Students s2 =new Students("�������", 23);
	  Students s3 =new Students("������", 30);
	  Students s4 =new Students("����", 2000);
	  
	  list.add(s1);
	  list.add(s2);
	  list.add(s3);
	  list.add(s4);
	  //[Demo26.Students@28a418fc, Demo26.Students@5305068a, Demo26.Students@1f32
//	  System.out.println(list);//������Ƕ���ĵ�ֵַ
	  
	  for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}
		/*
		 * ��Ŀ:
		 * 1.�Զ���4��ѧ������,��ӵ�����,����������
		 * 2.����һ������,�����洢ѧ������,����<Students>
		 * 3.������,����4��ѧ������
		 * 4.��4��ѧ��������ӵ�������:add
		 * 5.��������:for,size,get
		 */
		System.out.println("=======================");
		ArrayList<Students> st = new ArrayList<>();
		st.add(new Students("����֮��",11));
		st.add(new Students("�ɺ��ո���",12));
		st.add(new Students("��Į����",22));
		st.add(new Students("������ʹ",13));
		for (int i = 0; i < st.size(); i++) {
			System.out.println(st.get(i));
		}
	}

}
