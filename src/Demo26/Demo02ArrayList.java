package Demo26;

import java.util.ArrayList;

/*
  * ����ĳ��Ȳ����Է����ı�
  * ����ArrayList���ϵĳ����ǿ�������仯��
  * 
  * ����ArrayList��˵����һ��������<E>������
  * ���ͣ�Ҳ����װ�ڼ��ϵ��е�����Ԫ�أ�ȫ������ͳһ��ʲô����
  * ע�⣺����ֻ�����������ͣ������ǻ������͡�
  * 
  * ע�����
  * ����ArrayList������˵��ֱ�Ӵ�ӡ�õ��Ĳ��ǵ�ֵַ����������
  * ��������ǿգ��õ����ǿգ�����
  */
public class Demo02ArrayList {
	public static void main(String[] args) {
		//������һ��ArrayList���ϣ����ϵ�������List������װ��ȫ����String�ַ������͵�����
		//��ע����jdk1.7+��ʼ���Ҳ�ļ������ڲ����Բ�д���ݣ�����<>������Ҫд
		   ArrayList<String>  one =new ArrayList<>();
		   System.out.println(one);//���ǵ�ֵַ�������ݣ�
		   //��������ǿգ���õ�����
          one.add("����ӱ");
          System.out.println(one);
          one.add("��������֮��");   //add����
          one.add("�������ǻ���");
          one.add("��������֮��");
          System.out.println(one);//[����ӱ, ��������֮��, �������ǻ���, ����
          
//          one.add(123);//����д������Ϊ������ʱ������ŷ����Ѿ�˵�����ַ�������ӽ�ȥ��Ԫ�ر������ַ���

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
    }

}
