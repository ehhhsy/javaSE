package Demo08;
//���췽�����أ����෽ʽ��������
public class test2 {
    String color;
    int price;
    int seat;

    public test2(String color, int price, int seat) {
//        this.color = color;  д��1
//        this.seat = seat;
        this(color, seat);    //д��2  this �����Ե��õ�ǰ���������ķ���
        this.price = price;

    }
    //���췽�������أ���Щ����û��price
    public test2(String color,int seat){
        this.color=color;
        this.seat=seat;
    }

    public static void main(String[] args) {
        test2 baoma = new test2("��ɫ",200000,4);//�õĵ�һ�����췽��
        test2 huangyan_pai = new test2("��ɫ",20);    //�õĵڶ������췽��
    }

}
