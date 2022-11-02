package Demo14;


public class ZiPhone  extends FuPhone{
    @Override
    public void show() {
    	super.show();//把父类的show方法拿过来重复利用
    	//自己子类再来添加更多内容
        System.out.println("显示名字");
        System.out.println("显示头像");
    }
}
