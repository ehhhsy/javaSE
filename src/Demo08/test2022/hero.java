package Demo08.test2022;
//https://www.bilibili.com/video/BV1pJ411y7UK?p=7  �������ϰ
public class hero {
    private String name;
    private String weapon;
    private String personal_mount;  //��������

    public void kill(int people){
        System.out.println(this.name+"��"+this.weapon+"ɱ��"+people+"��");
    }

    public hero(String name, String weapon) {
        this.name = name;
        this.weapon = weapon;
    }
    //���ع��췽��
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
