package Demo22;

import java.util.ArrayList;
import java.util.Random;
//普通成员
public class qunyuan extends  User {
    public qunyuan(String name, int money) {  //构造方法
        super(name, money);
    }

    public qunyuan() {             //构造方法
    }

    public void receive (ArrayList<Integer> list){
          //从多个红包当中随便抽取一个，给我自己（随机的0-2号元素，成员）
        int index =new Random().nextInt(list.size()); //生成的 0-size-1
        //根据索引删除，并得到被删除的红包，给我自己
        int delta=list.remove(index); //（随机的0-2号元素，成员）
       //看看我有多少钱
        int money=super.getMoney(); //（随机的0-2号元素，成员）
        //加法，并且重新设置回去
        super.setMoney(money+=delta);
    }
}
