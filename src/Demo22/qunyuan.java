package Demo22;

import java.util.ArrayList;
import java.util.Random;
//��ͨ��Ա
public class qunyuan extends  User {
    public qunyuan(String name, int money) {  //���췽��
        super(name, money);
    }

    public qunyuan() {             //���췽��
    }

    public void receive (ArrayList<Integer> list){
          //�Ӷ�������������ȡһ���������Լ��������0-2��Ԫ�أ���Ա��
        int index =new Random().nextInt(list.size()); //���ɵ� 0-size-1
        //��������ɾ�������õ���ɾ���ĺ���������Լ�
        int delta=list.remove(index); //�������0-2��Ԫ�أ���Ա��
       //�������ж���Ǯ
        int money=super.getMoney(); //�������0-2��Ԫ�أ���Ա��
        //�ӷ��������������û�ȥ
        super.setMoney(money+=delta);
    }
}
