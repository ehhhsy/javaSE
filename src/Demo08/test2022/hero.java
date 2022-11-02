package Demo08.test2022;
//https://www.bilibili.com/video/BV1pJ411y7UK?p=7  面向对象复习
public class hero {
    private String name;
    private String weapon;
    private String personal_mount;  //个人坐骑

    public void kill(int people){
        System.out.println(this.name+"用"+this.weapon+"杀了"+people+"人");
    }

    public hero(String name, String weapon) {
        this.name = name;
        this.weapon = weapon;
    }
    //重载构造方法
    public hero(String name, String weapon, String personal_mount) {
        this.name = name;
        this.weapon = weapon;
        this.personal_mount = personal_mount;
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

    public String getPersonal_mount() {
        return personal_mount;
    }

    public void setPersonal_mount(String personal_mount) {
        this.personal_mount = personal_mount;
    }
}
