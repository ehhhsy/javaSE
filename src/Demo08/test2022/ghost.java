package Demo08.test2022;

public class ghost {
   private String name;
   private String weapon;
   private int HP;
   private int attack;

   public void eat_plant(plant p){
       int hp = p.getHP();
       p.setHP(hp-=this.attack);
       System.out.println(this.name+" eating "+ p.getName()+",the plant have"+p.getHP()+" HP now");
   }
    public ghost(String name, String weapon, int HP, int attack) {
        this.name = name;
        this.weapon = weapon;
        this.HP = HP;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
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
