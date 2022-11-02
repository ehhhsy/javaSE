package Demo22;

import java.util.ArrayList;

public class Mainhongbao {
    public static void main(String[] args) {
        qunzhu qunzhu =new qunzhu("古巨基",100);
       qunyuan qunyuan =new qunyuan("群员1",0);
        qunyuan qunyuan2 =new qunyuan("群员3",0);
       qunyuan qunyuan1 =new qunyuan("群员2",0);
//       ArrayList<Integer> list=qunzhu.send(50,2);
//      qunyuan.receive(list);

      qunzhu.show();   //100
      qunyuan.show();  //0
      qunyuan1.show(); //0
      qunyuan2.show(); //0
        System.out.println("===============");
        //qunzhu总共发20快去，分成3个红包
        ArrayList<Integer> list=qunzhu.send(80,3);
        //3个普通成员收红包,随机分给三个人
        qunyuan.receive(list);           //调用receive方法，随机看看自己是不是那个随的
        qunyuan1.receive(list);          ////调用receive方法，随机看看自己是不是那个随的
        qunyuan2.receive(list);

        qunzhu.show(); //80
        qunyuan.show();    //随机3个人，两个6一个8
        qunyuan1.show();
        qunyuan2.show();
    }
}
