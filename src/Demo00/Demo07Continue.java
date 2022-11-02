package Demo00;

/*
 * continue关键字
 * 另一种循环控制语句
 * 一旦执行，立刻跳过当前循环剩余内容，马上开启下一次循环。
 *
 */
public class Demo07Continue {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            if (i == 4) {  //到了4层
                continue; //跳过4层，马上开始下一次（5层）
            }
            System.out.println(i + "层到了");
        }
        System.out.println("==============");
//       2020.7.18 while+continue 练习
        int w = 1;
        while (w <= 4) {
            if (w % 2 == 0) {
                w++;
                continue;
            }
            System.out.println("2020.7.18 while+continue 练习" + w);
            w++;
        }
        int c = 1;
        do {
            if (c == 4) {
                c++;
                continue;
            }
            System.out.println("这栋楼有" + c + "层");    //2020.7.18 do-while+continue 练习
            c++;
        } while (c <= 6);

        System.out.println("==============");
        for (int i = 1; i < 6; i++) {
            if (i == 5) {                                //"2020.9.13"
                i++;
                continue;
            }
            System.out.println("2020.9.13" + i);
        }
		System.out.println("==============");
		int abc = 1;
        while (abc<=5){
        	if (abc==4){
				abc++;
        		continue;							//"2020.9.13"
			}
			System.out.println(abc);
			abc++;
        }
        for (int louti = 1; louti <= 10; louti++) {
            if(louti==4){
                System.out.println(louti-1+"*楼到了");
                continue;
            }
            System.out.println(louti+"楼到了");
        }

    }
}