package Demo08.test2022;

public class person {
    String name;
    static String country="����";
    String address;

    public person(String name, String address) {
    this.name=name;
    this.address=address;
    }

    public static void main(String[] args) {
        person p1 = new person("�ϴ�", "2�ź�ͬ");
        person p2 = new person("�϶�", "3�ź�ͬ");
        //��������
//        p1.country="����";  //��Ҫ������Ҫ����.��̬
        person.country="����";

    }
}
