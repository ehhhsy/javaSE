package Demo26;

import java.util.ArrayList;

/*
 * ArrayList���еĳ��÷�����
 * 
 * public boolean add (E):�򼯺������Ԫ�أ��������ͺͷ���һ��
 * ��ע������ArrayList������˵��add��Ӷ���һ���ǳɹ��ģ����Է���ֵ���ò�����
 * �����Ƕ����������ϣ����ѧϰ����˵��add��Ӷ�����һ���ɹ�����
 * 
 * public e get(int index):�Ӽ����е�ǰ��ȡԪ�أ�������������ţ�����ֵ���Ƕ�Ӧλ�õ�Ԫ��
 *  
 *  public E remove��int index��:�Ӽ�����ɾ��Ԫ�أ�������������ţ�����ֵ���Ƕ�Ӧλ�õ�Ԫ��
 *  
 *  public int size()����ȡ���ϵĳߴ糤�ȣ�����ֵ�Ǽ����а�����Ԫ�ظ���
 */
public class Demo03ArrayListMethod {
	public static void main(String[] args) {
      ArrayList<String> one =new ArrayList<String>();
      
      //public boolean add (E):�򼯺������Ԫ�أ���Ϊ��boolean�з���ֵ�ģ�����ֵ�ǣ�����Ƿ�ɹ���
      boolean success =one.add("ʱ��̿�");
      System.out.println(success);
      one.add("ŵ��");
      
      //public e get(int index):�Ӽ����е�ǰ��ȡԪ�أ�
      System.out.println(one.get(0));  //ʱ��̿�
      
      //public int size()����ȡ���ϵĳߴ糤�ȣ�
      System.out.println(one.size());   //2
      
      System.out.println(one);

      //public E remove��int index��:�Ӽ�����ɾ��Ԫ�أ�
      String whoremove =one.remove(0);//�з���ֵ      ɾ������ʱ��̿�
      System.out.println("��ɾ�������� "+whoremove);
      System.out.println(one.size());  //1
      System.out.println(one);


          System.out.println("===================");
          ArrayList<Integer> list = new ArrayList<>();
          list.add(10);
          list.add(20);
          list.add(30);
          //add
          list.add(222);
          //get
          System.out.println(list.get(0));//10
          //size
          System.out.println(list.size());//4
          //remove
          System.out.println(list.remove(2));//30
          System.out.println(list);//[10, 20, 222]

	
	}

}
