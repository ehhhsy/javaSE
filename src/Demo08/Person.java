package Demo08;
/*this�ؼ���  ���ã���Ҫ��������������£��������������
 *  �������ľֲ���������ĳ�Ա����������ʱ�򣬸��ݡ��ͽ�ԭ�򡱣�����ʹ�þֲ������������� ��Ա�����е�String name
 *  �����Ҫ���ʱ��൱�еĳ�Ա��������Ҫʹ�ø�ʽ�� this.�ؼ���
 *
 *  ��ͨ��˭���õķ�����˭����this.��  ���ص㡿
 *  one.sayhallo��one.���õķ�����
 *  ����one����this������this.name==one.name��================
 */
public class Person {
 String name; //name�������this��nameһ������ɫ
 
 /*public void sayhallo(String who) {
	 System.out.println(who+"��ã��ҽ�"+name);
 }
 */
 //����name�ǶԷ�������
 //��Ա����name���Լ�������
 public void sayhallo(String name) {
	 System.out.println(name+"��ã��ҽ�"+this.name);
	 System.out.println(this);//��ֵַ@279f2327��oneһ��
 }
}
