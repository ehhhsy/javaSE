package Demo33;

/*
如果才能知道一个父类应用的对象，本来是什么子类？
hsy：你怎么才能知道是一只猫还是狗呢

Instanceof
对象 instanceof  名称;  animal instanceof Cat
这将会得到一个boolean值结果，也就是判断前面对象能不能当作后面类型的实例
 */
public class Demo04instanceof {
    public static void main(String[] args) {


        Animal animal = new Dog();  //本来是一个猫
        animal.eat();

//        如果希望调用子类特有方法，需要向下转型


        //判断一下父类引用animal本来是不是Dog
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
//          判断一下父类引用animal本来是不是Cat
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
        System.out.println("==========================");
        giveMePet(new Cat());

        //给我一个动物，随便，我要判断一下
//    public  static void giveMePet(Animal animal){
//        if(animal instanceof Dog){
//            Dog dog =(Dog)animal;
//            dog.watchHouse();
//        }
////          判断一下父类引用animal本来是不是Cat
//        if (animal instanceof Cat){
//            Cat cat =(Cat)animal;
//            cat.catchMouse();
//        }
//    }
    }
    public static void giveMePet(Animal animal){
        if(animal instanceof Dog){
            Dog dog =(Dog)animal;
            dog.watchHouse();
        }
    }
}