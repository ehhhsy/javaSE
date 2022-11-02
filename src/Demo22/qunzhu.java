package Demo22;

import java.util.ArrayList;

public class qunzhu extends User {
    public qunzhu() {
    }

    public qunzhu(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer> array = new ArrayList<>();  //创建一个集合

        int leftMoney = super.getMoney();//群主当前余额
        //用send方法输入的totalMoney和super.getMoney();自己User定义的变量money进行比较
        if (totalMoney > leftMoney) {
            System.out.println("余额不足");
            return array;  //返回空集合
        }
//         扣钱 其实就是重新设置余额
        super.setMoney(leftMoney - totalMoney);  //set重新赋值

        //发红包
        int avg = totalMoney / count;
        int mod = totalMoney % count; //余数，也就是零头
        //除不开的零头，抱在最后一个红包
        //下面把红包一个一个放在集合当中
        for (int i = 0; i < count - 1; i++) {  //要剩下一个平分红包，来装平方+零头
            array.add(avg);
        }
        //最后一个红包
        int last = avg + mod;  //下一个平分红包，来装平方+零头
        array.add(last);
        return array;
    }
}
