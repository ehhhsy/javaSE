package Demo08.test2022;

public class plant {
    private String gun;
    private String name;
    private int HP;
    private int attack;
    //´ò½©Ê¬
    public void fight(ghost g){
        int hp = g.getHP();
        hp-=this.attack;
        g.setHP(hp) ;
        System.out.println(this.name+" attacking "+g.getName()+" ,the ghost have "+g.getHP()+" hp now");
    }

    public plant(String gun, String name, int HP, int attack) {
        this.gun = gun;
        this.name = name;
        this.HP = HP;
        this.attack = attack;
    }

    public String getGun() {
        return gun;
    }

    public void setGun(String gun) {
        this.gun = gun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
