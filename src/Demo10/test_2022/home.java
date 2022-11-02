package Demo10.test_2022;

public class home {
    public static void main(String[] args) {
        pole_ghost_fu_2022 fu = new pole_ghost_fu_2022();
        pole_ghost_zi_2022 zi = new pole_ghost_zi_2022("黑老八",20);


        System.out.println("fu的名字 "+fu.name);
        System.out.println("==================================================");
        System.out.println("zi的名字" +zi.name);

        fu.eat_person();
        zi.eat_person();
        zi.study();
        System.out.println("======================speed money start============================");
        zi.spend_money();
        System.out.println("======================speed money down=======================");
        System.out.println(fu.name);

        zi.who_isyoufu();
    }
}
