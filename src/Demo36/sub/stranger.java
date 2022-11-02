package Demo36.sub;

import Demo36.myClass;

//不同包非子类
public class stranger {

    public void methodStranger(){
        System.out.println(new myClass().num);
    }
}
