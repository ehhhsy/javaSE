package Demo30;
//用户登录系统   2022
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String account="123@qq.com";
        int passwd=123456;


        int i=0;
        while(true){
            System.out.println("欢迎来到账号管理系统");
            System.out.println("请输入账号");
            Scanner sc1 = new Scanner(System.in);
            String s = sc1.nextLine();
        if (s.equals(account)){
            System.out.println("请输入密码");
            Scanner sc2 = new Scanner(System.in);
            int ps = sc2.nextInt();
            if(ps==passwd){
                System.out.println("登录成功");
                break;
            }else{
                System.out.println("密码错误");
                i++;
            }
        }else{
            System.out.println("账号错误");
            i++;
        }
        if(i>=3){
            System.out.println("输入错误3次以上 结束");
            break;
        }
        }
    }
}
