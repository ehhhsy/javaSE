package Demo49;

import java.util.ArrayList;
import java.util.Collections;

public class demo01 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();//��ɫ�ļ���
        list1.add("?");
        list1.add("?");
        list1.add("?");
        list1.add("?");
        ArrayList<String> list2 = new ArrayList<String>();//���ֵļ���
        list2.add("2");
        list2.add("A");
        list2.add("K");
        list2.add("Q");
        list2.add("J");
        list2.add("10");
        list2.add("9");
        list2.add("8");
        list2.add("7");
        list2.add("6");
        list2.add("5");
        list2.add("4");
        list2.add("3");
        ArrayList<String> list3 = new ArrayList<>();//54���Ƶļ���
        list3.add("����");
        list3.add("С��");
        for(int i1=0;i1<list1.size();i1++){  //�Լ���˼·  ����
         for (int i2=0;i2<list2.size();i2++){
           list3.add(list1.get(i1).concat((list2.get(i2))));
         }
        }
//        for (String s1:list1) {
//            for (String s2:list2) { //��ʦ�ķ��� ����
//                list3.add(s1+s2);
//            }
//        }

//        2.ϴ�� ʹ�ù����� Collections�е�s����̬������static void shuffle ʹ��Ĭ��Դ��ָ���б�����û�
         Collections.shuffle(list3);

//        System.out.println(list3);

        /*
        ����
         */
        ArrayList<String> list4 = new ArrayList<>();
        ArrayList<String> list5 = new ArrayList<>();
        ArrayList<String> list6 = new ArrayList<>();
        ArrayList<String> list7 = new ArrayList<>();//������
       for (int i=0;i<list3.size();i++){
       if (i>=51){   //����51��ʣ������
           list7.add(list3.get(i));

       }
           if (i%3==0){
               list4.add(list3.get(i));
           }
           else if(i%3==1){
               list5.add(list3.get(i));
           }
           else if (i%3==2){
               list6.add(list3.get(i));
           }
    }
   //����
        System.out.println("�ƻ���"+list4);
        System.out.println("����"+list5);
        System.out.println("С����"+list6);
        System.out.println("������"+list7);

    }

}
