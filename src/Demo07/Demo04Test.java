package Demo07;
/*//��ͼ��ͼ��ͼ����������
 *��main�����Ϳ���������
 */
public class Demo04Test {

	public static void main(String[] args) {
		
		Phone stu =new Phone();
		System.out.println(stu.brand); 
		System.out.println(stu.changdu);
		System.out.println(stu.weigth);
		
		//phone.brand="ss"; �������︳ֵ��Ȼ���ӡ����ss��
		 stu.play();
		 stu.takephone();
		 stu.call("����");
	}

}
