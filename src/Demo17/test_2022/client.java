package Demo17.test_2022;

import Demo39.LOL;

public class client {
    public static void main(String[] args) {
        game cs = new CS();
        game lol = new LoL();
        game yongjiewujian = new yongjiewujian();
        player player = new player();
        player.have_fun(yongjiewujian);
        weapon weapon = new weapon();
        String choose_weapon = weapon.choose_weapon();
        yongjiewujian=(yongjiewujian)yongjiewujian;
        ((yongjiewujian) yongjiewujian).attack(choose_weapon);
    }
}
