package Demo14.test_2022;

public class iphone extends phone{
    @Override
    public void call() {
        super.call();
        System.out.println("hei，希瑞");
    }

    @Override
    public void lock() {
        super.lock();
        System.out.println("长按开屏键关机");
    }

    @Override
    public void show() {
        super.lock();
        System.out.println("灵动岛");

    }
}
