package Demo07;
/*
 * 
 */
public class Demo07Person {

	public static void main(String[] args) {
		Person one =new Person();
        //set������д�Ⱥţ���Ϊ�ǵ��÷������ѣ�
       one.show();
       one.setName("wangwu");
      // one.age=-20;//ֱ�ӷ���private���ݣ�����д��
       one.setAge(-20); //�������ðѹأ��Ѹ���ȥ��
       one.show();
	}

}
