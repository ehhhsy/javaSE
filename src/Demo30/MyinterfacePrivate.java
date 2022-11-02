//package Demo30;
///*
//问题描述：
//我们需要抽取一个公共方法，用来解决默认方法之间重复代码的问题
// hsy:就是默认方法1和2都要输出aaabbbccc，就该抽取一个公共方法
//但是这个公共方法不应该让实现类使用，而是私有化
//
//解决方案：
//从java9开始，接口当中允许定义私有方法。
//1.普通私有方法，解决多个默认方法之间重复代码问题
//格式：
//private 返回值类型 方法名称（参数列表）{
//  //方法体
//}
//2.1.静态私有方法，解决多个静态方法之间重复代码问题
//private static 返回值类型 方法名称（参数列表）{
//  //方法体
//}
// */
//public interface MyinterfacePrivate {
//   public default void methodDefault1(){
//       System.out.println("默认方法1");
//       methodCommon();  ///设置了private之后，只能methodDefault1和methodDefault2内使用
////       System.out.println("AAA");
////       System.out.println("BBB");
////       System.out.println("CCC");
//   }
//    public default void methodDefault2(){
//        System.out.println("默认方法2");
//        methodCommon();  ///设置了private之后，只能methodDefault1和methodDefault2内使用
////        System.out.println("AAA");
////        System.out.println("BBB");
////        System.out.println("CCC");
//    }//设置了private之后，只能methodDefault1和methodDefault2内使用
////     void methodCommon(){
////        System.out.println("AAA");
////        System.out.println("BBB");
////        System.out.println("CCC");
////    }
////}
