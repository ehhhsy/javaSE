package Demo08.test2022;
//ֲ���ս��ʬ
public class client {
    public static void main(String[] args) {
        plant ben = new plant("����ǹ", "�㶹����", 100, 2);
        ghost ghost = new ghost("pole_ghost", "pole", 20, 6);
        ben.fight(ghost);
        System.out.println(ghost.getHP());  //18

        ghost.eat_plant(ben);
        System.out.println(ben.getHP());
    }
}
