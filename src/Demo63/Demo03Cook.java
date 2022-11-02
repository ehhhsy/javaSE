package Demo63;
/*
 使用lambda的标准格式调用incokeCook方法，打印输出“吃饭了”
 */
public class Demo03Cook {
    public static void main(String[] args) {
        //定义一个方法，参数传递Cook接口，床底Cook接口的匿名内部类对象
        incokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });

        //使用lambda表达式，简化匿名内部类的书写
//        incokeCook(()->{});       【重点】
          incokeCook(()->{
              System.out.println("吃饭了");
          });




    }
    //定义一个方法，传递cook接口，方法内部调用cook接口中的方法makeFood
    public static void  incokeCook(Cook cook){
          cook.makeFood();
            };
    }



