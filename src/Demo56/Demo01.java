package Demo56;

import Demo55.MyThread;

/*
    �����ڲ���ʵ�ַ���ʵ�ֽ��̵Ĵ���

    ������û������
    �ڲ��ࣺд���������ڲ�����

    �����ڲ������ã��򻯴���
        ������̳и��࣬��д����ķ�����������������һ�����
        ��ʵ����ʵ�ֽӿڣ���д�ӿڵķ���������ʵ��������һ�����
    �����ڲ�������ղ������/ʵ������󣬶������û������

    ��ʽ��
        new ����/�ӿڣ���{
        �ظ�����/�ӿ��еķ���
        }��
 */
public class Demo01 {
    public static void main(String[] args) {
        //�̵߳ĸ�����Thread
        //new MyThead������start������

        new Thread() {
            //��дrun�����������߳�����
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"����");
                }
            }

        }.start();
//============================================================================
        //�̵߳Ľӿ�Runnable
        //Runnable r =new Runnable
        Runnable r = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(i + "aaa");
                    System.out.println(Thread.currentThread().getName() + "��");
                }
            }
        };

        new Thread(r).start();


    //�򻯴���
        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(i + "aaa");
                    System.out.println(Thread.currentThread().getName() + "��");
                }
            }
        }).start();
    }
}

