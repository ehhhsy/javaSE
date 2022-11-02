package Demo37;

public class Body { //外部类


    public class Heart { //外部类
      public  void beat(){
          System.out.println("心脏跳");
          System.out.println(name+"的心脏");//真确写法！
      }

    }
    //外部成员变量
    private String name;

    //外部类的方法
    public void methodBody() {
        System.out.println("外部类的方法");

//  1.在外部类的方法当中，使用内部类，然后main只是调用外部类的方法。【间接使用】
       Heart heart =new Heart();
       heart.beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void methodBodyTwo(){
        System.out.println("外部类方法222");
    }
}
