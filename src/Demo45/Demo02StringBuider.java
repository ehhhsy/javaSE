package Demo45;

import java.util.Arrays;

/*StringBuilder�����췽����
StringBuilder()
          ����һ�������κ��ַ����ַ��������������ʼ����Ϊ 16 ���ַ�
StringBuilder(String str)
          ����һ���ַ���������������ʼ��Ϊָ�����ַ������ݡ�
 */
public class Demo02StringBuider {
    public static void main(String[] args) {
        //����һ�������κ��ַ����ַ��������������ʼ����Ϊ 16 ���ַ�
        StringBuilder stringBuilder1 = new StringBuilder();
        System.out.println("������" + stringBuilder1);

//        StringBuilder stringBuilder2 = new StringBuilder("aaa","bbb");//���ܶ�����
        StringBuilder stringBuilder3 = new StringBuilder("aaa");
        System.out.println(stringBuilder3);


        //����Ա������
//        StringBuilder append(������)
//        �� ��ӡ������������ݡ����ַ�����ʽ���������������

        //ʹ��append���������������
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append(111);
//        stringBuilder4.append(2.33,22.1);//
        stringBuilder4.append(2.33);
        stringBuilder4.append(" �����");

        /*
        ��ʽ��̣������ķ���ֵ��һ�����󣬿��Ը��ݶ���������÷���
         */
//        ��������д
        stringBuilder4.append(1).append(233.1).append(true);

        System.out.println(stringBuilder4);

        //���鷴ת
        stringBuilder4.reverse();
        System.out.println(stringBuilder4);

    }
}
