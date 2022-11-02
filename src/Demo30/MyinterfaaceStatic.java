package Demo30;
/*
   从java 8开始，接口允许定义静态方法，
   hsy:静态方法，跟对象没关系，跟类有关系，
   比如说小红，小王调用static方法，但是跟他们两个没关系，只跟学生类有关系

   格式：
   public static 返回值类型 方法名称（参数列表）{
       方法体
   }
   提示：就是将abstract或者default换成staitc即可，带方法体

   hsy：在接口中直接，接口.静态方法
 */
public interface MyinterfaaceStatic {

   public static void methodStatic(){
       System.out.println("这是静态方法");
   }

}
