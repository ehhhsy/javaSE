package Demo22;

import java.util.ArrayList;

public class Mainhongbao {
    public static void main(String[] args) {
        qunzhu qunzhu =new qunzhu("�ž޻�",100);
       qunyuan qunyuan =new qunyuan("ȺԱ1",0);
        qunyuan qunyuan2 =new qunyuan("ȺԱ3",0);
       qunyuan qunyuan1 =new qunyuan("ȺԱ2",0);
//       ArrayList<Integer> list=qunzhu.send(50,2);
//      qunyuan.receive(list);

      qunzhu.show();   //100
      qunyuan.show();  //0
      qunyuan1.show(); //0
      qunyuan2.show(); //0
        System.out.println("===============");
        //qunzhu�ܹ���20��ȥ���ֳ�3�����
        ArrayList<Integer> list=qunzhu.send(80,3);
        //3����ͨ��Ա�պ��,����ָ�������
        qunyuan.receive(list);           //����receive��������������Լ��ǲ����Ǹ����
        qunyuan1.receive(list);          ////����receive��������������Լ��ǲ����Ǹ����
        qunyuan2.receive(list);

        qunzhu.show(); //80
        qunyuan.show();    //���3���ˣ�����6һ��8
        qunyuan1.show();
        qunyuan2.show();
    }
}
