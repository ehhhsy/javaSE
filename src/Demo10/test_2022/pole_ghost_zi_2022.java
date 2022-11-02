package Demo10.test_2022;

public class pole_ghost_zi_2022 extends pole_ghost_fu_2022 {
    String name="黑儿子";
    int age=20;

    public pole_ghost_zi_2022(String name, int age)
    {

        this.name=name;
        this.age=age;
    }
    @Override
    public void eat_person() {

        System.out.println(super.name);
        super.eat_person();
    }



    public void study(){
        System.out.println("瀛︿範");
    }
    public void spend_money(){
        System.out.println(super.name+"  赚钱给  "+this.name);
        System.out.println(super.name);
        System.out.println(this.name);
    }
    public void who_isyoufu(){
        System.out.println("my fu is"+super.name);
    }
}
