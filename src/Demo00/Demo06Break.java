package Demo00;

/*
 * ��break�� �ؼ����÷��г��������֣�
 * 1.��������switch����У�һ��ִ�У�����switch������̽���/
 * 2.����������ѭ����䵱�У���һ��ִ�С�������ѭ��������̽��������ѭ����
 * 
 * ����ѭ����ѡ���йء�С���顿��
 * ���Ǵ���ȷ���ĳ�������forѭ�����������whileѭ����do-while�ټ�
 */
public class Demo06Break {
      public static void main(String[] args) {
		  for (int i = 1; i <= 10; i++) {
			  if (i == 4) { //��ǰ�ǵ��Ĵ�
				  break;//��ô��ϡ�����ѭ����
			  }
			  System.out.println("hello" + i);
		  }

//    	  2020.7.18 for+break ��ϰ
		  for (int i = 0; i <= 4; i++) {
			  if (i == 3) {
				  break;
			  }
			  System.out.println("��������֮��killing" + i + "��");
		  }
		  System.out.println("this is new one"); //2022.9.15
		  int[] singer = new int[20];
		  for (int index = 1; index < 20; index++) {
			  if (index % 2 == 0) {
				  singer[index] = index;
				  index++;
			  }else{
				  singer[index] = index;
				  index++;
			  }

		  }
		  for (int i = 0; i < singer.length; i++) {
			  System.out.print(singer[i]+" ");
		  }
	  }
}
