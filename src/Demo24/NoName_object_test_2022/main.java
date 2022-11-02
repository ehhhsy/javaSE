package Demo24.NoName_object_test_2022;
//2022.9 ÄäÃû¶ÔÏóÁ·Ï°
public class main {
    public static void main(String[] args) {
        person p1 = new person();
        p1.setName("barney");
        p1.setAge(20);
        p1.say_something("sandwich");
        p1.pick_age(30);

        System.out.println("=========bound==============");
        new person("jeoy",30).pick_age(20);
        new person("jeoy",30).say_something("strawberry");
    }
}
