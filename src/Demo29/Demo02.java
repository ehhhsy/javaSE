package Demo29;
  //看图
/*           NICE,HSY
   题目：
   计算在-10.8到5.9之间，绝对值大于6 或者小于2.1的整数有多少个？

   思路：
   1.既然确定了范围，for循环
   2.起点位置-10.8应该转换成为-10，两种方法：
      2.1可以使用Math.ceil方法，向上取整 变成-10
      2.2强行转换成为int，自动舍弃所有小数位
   3.每一个数字都是整数，所以步进表达式应该是num++;这样每次都是+1的
   4.如果拿到绝对值：Math.abs方法
   5.一旦发现了一个数字，需要让计算器++进行统计

   备注：如果使用Math.ceil方法，-10.8变成-10.0。注意double也是可以++的
 */
public class Demo02 {
      public static void main(String[] args) {

          int sum=0;
          double max=5.9;
          double min=-10.8;
          for (double i=min; i <max ; i++) {
              double v = Math.ceil(Math.abs(i));
              if (v>6||v<2.1){
                  sum+=1;
              }
          }
          System.out.println("2020.11.11 一共有"+sum);




        /*  int count = 0;                 //计数器  方法1
          double min = -10.8;
          double max = 5.9;
          for (int i = (int) min; i < max; i++) { //这样处理就是区分子内所有的整数
              int abs = Math.abs(i);       //-10.8到5.9之间所有的整数
              if (abs > 6 || abs < 2.1) {       //筛选
                  count++;
              }
          }
          System.out.println("总共有 " + count);  //总共有 9
*/

//         int count =0;          //方法2
//          double min =-10.8;
//          double max =5.9;
//          double da =Math.ceil(max);   //之前错误1，不能写在条件判断 现位置（xiao<da）,单独写
//          for (double xiao =Math.ceil(min); xiao < da ;xiao++) {
//              double abs=Math.abs(xiao);
//                   if (abs>6||abs<2.1){
//                       count++;
//                   }
//          }
//          System.out.println("ceil方法2 总共有"+count);  //ceil方法2 总共有9
      }


      }
