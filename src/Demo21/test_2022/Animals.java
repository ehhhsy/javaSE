package Demo21.test_2022;

public class Animals implements creature {
    @Override
    public void say() {
        System.out.println("Animals language");
    }

    @Override
    public void eat() {
        System.out.println("eating Raw meat");
    }
}
