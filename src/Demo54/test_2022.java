package Demo54;

import java.util.Scanner;

/*
  Ҫ������ģ��ע�����������û��Ѵ��ڣ����׳��쳣����ʾ���ף����û����Ѿ�ע��
 ������
    1.ʹ�����鱣���Ѿ�ע������û��������ݿ⣩
    2.ʹ��Scanner��ȡ��ע���û���
    3.����һ�����������û������ע���û��������ж�
        �������ݣ���ȡÿһλ�������ж�
            true:
                �û������ڣ��׳�RegisterExceptionAAA����쳣���û����Ѿ���ע���ˡ�
            flase��
                ���������Ƚ�
              ���ѭ�������ˣ���û���ҵ��ظ����û�������ʾ�û�����ϲע��ɹ�"
 */
public class test_2022 extends Exception {
    static String [] array={"��ʩ��","��ʱ��","��˼��"};

    public test_2022() { //���һ���ղ����Ĺ��췽��
    }


    //���һ�����쳣��Ϣ�Ĺ��췽��
    public test_2022(String message){
        super(message);
    }

    public static void main(String[] args)throws RegisterExceptionAAA {
        Scanner sc = new Scanner(System.in);

        System.out.println("������");
        String s = sc.next();
        CheckUsername(s);
    }

    public static void CheckUsername(String name){
        for (String s:array
        ) {
            if (name.equals(array)){
                //true:Exception�Ǳ������쳣��Ҫ����
                try {
                    throw new RegisterExceptionAAA("�û����Ѿ���ע��");
                } catch (RegisterExceptionAAA registerExceptionAAA) {
                    registerExceptionAAA.printStackTrace();
                    return;
                }
            }
        }
        System.out.println("��ϲ�㣬ע��ɹ�");

    }

}
