package Demo08.test2022;

public class person {
    String name;
    static String country="大清";
    String address;

    public person(String name, String address) {
    this.name=name;
    this.address=address;
    }

    public static void main(String[] args) {
        person p1 = new person("老大", "2号胡同");
        person p2 = new person("老二", "3号胡同");
        //大清亡了
//        p1.country="明国";  //不要这样。要类名.静态
        person.country="明国";

    }
}
