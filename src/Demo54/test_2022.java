package Demo54;

import java.util.Scanner;

/*
  要求：我们模拟注册操作，如果用户已存在，则抛出异常并提示：亲，该用户名已经注册
 分析：
    1.使用数组保持已经注册过的用户名（数据库）
    2.使用Scanner获取的注册用户名
    3.定义一个方法，对用户输入的注册用户名进行判断
        遍历数据，获取每一位进，行判断
            true:
                用户名存在，抛出RegisterExceptionAAA这个异常”用户名已经被注册了“
            flase：
                继续遍历比较
              如果循环结束了，还没有找到重复的用户名，提示用户“恭喜注册成功"
 */
public class test_2022 extends Exception {
    static String [] array={"黄施予","黄时雨","黄思雨"};

    public test_2022() { //添加一个空参数的构造方法
    }


    //添加一个带异常信息的构造方法
    public test_2022(String message){
        super(message);
    }

    public static void main(String[] args)throws RegisterExceptionAAA {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入");
        String s = sc.next();
        CheckUsername(s);
    }

    public static void CheckUsername(String name){
        for (String s:array
        ) {
            if (name.equals(array)){
                //true:Exception是编译期异常，要处理
                try {
                    throw new RegisterExceptionAAA("用户名已经被注册");
                } catch (RegisterExceptionAAA registerExceptionAAA) {
                    registerExceptionAAA.printStackTrace();
                    return;
                }
            }
        }
        System.out.println("恭喜你，注册成功");

    }

}
