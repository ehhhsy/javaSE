package Demo22;

import java.util.ArrayList;

public class qunzhu extends User {
    public qunzhu() {
    }

    public qunzhu(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer> array = new ArrayList<>();  //����һ������

        int leftMoney = super.getMoney();//Ⱥ����ǰ���
        //��send���������totalMoney��super.getMoney();�Լ�User����ı���money���бȽ�
        if (totalMoney > leftMoney) {
            System.out.println("����");
            return array;  //���ؿռ���
        }
//         ��Ǯ ��ʵ���������������
        super.setMoney(leftMoney - totalMoney);  //set���¸�ֵ

        //�����
        int avg = totalMoney / count;
        int mod = totalMoney % count; //������Ҳ������ͷ
        //����������ͷ���������һ�����
        //����Ѻ��һ��һ�����ڼ��ϵ���
        for (int i = 0; i < count - 1; i++) {  //Ҫʣ��һ��ƽ�ֺ������װƽ��+��ͷ
            array.add(avg);
        }
        //���һ�����
        int last = avg + mod;  //��һ��ƽ�ֺ������װƽ��+��ͷ
        array.add(last);
        return array;
    }
}
