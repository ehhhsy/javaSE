package Demo07;
/*�ô�������޷�ֱ�ӷ��ʣ��赲�������ݣ���֤����İ�ȫ��
 * private �ؼ���  ˽�е�
 * ����    ����person ������ʱ���޷���ֹ���������ֵ�����ý���
 * �����������private�ؼ��ֽ���Ҫ�����ĳ�Ա������������
 * 
 * һ��ʹ����private�������Σ���ô���൱����Ȼ�����������
 * ���ǣ����������˱��෶Χ֮��Ͳ�����ֱ�ӷ����ˡ�
 * ������������person��������private����Demo07person�Ͳ����ʣ�
 * 
 * ��ô���ʣ��ü�ӷ���
 * ��ӷ��ʣ����Ƕ���һ��getter��get��������/setter��set����������
 * set���������в������޷���ֵ������Ҫset���˱���һ�£�����������������������
 * ���ƹ���set����ĸ��д��setAge
 * 
 * get�����������޲������з���ֵ������ֵ����ĳ�Ա����Ҫ��Ӧ
 * ���ƹ���get����ĸ��д��getAge
 */
public class Person {
    private String name; 
    private int age;
     //�����Ա���������ܼ�static
     public  void show() {
    	 System.out.println("�ҽ�"+name+",�����ǣ�"+age);
     }
     public void setName(String num2) {
    	 name=num2;
     }
     public String getName() {
    	 return name;
     }
     public void setAge(int num) { //�����в������޷���ֵ������Ҫset���˱���һ��
    	 if(num<100&&num>=0) {  //�Ժ����Ե�һ���ж�
    		 age=num;
    	 }else {
    		 System.out.println("��������"+num+ "?");
    	 }
     }
     
     public int getAge() {  //�����޲������з���ֵ������ֵ����ĳ�Ա����Ҫ��Ӧ
    	 return age;
     }
}
