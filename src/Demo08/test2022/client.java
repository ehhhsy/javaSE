package Demo08.test2022;
//植物大战僵尸
public class client {
    public static void main(String[] args) {
        plant ben = new plant("机关枪", "豌豆射手", 100, 2);
        ghost ghost = new ghost("pole_ghost", "pole", 20, 6);
        ben.fight(ghost);
        System.out.println(ghost.getHP());  //18

        ghost.eat_plant(ben);
        System.out.println(ben.getHP());
    }
}
