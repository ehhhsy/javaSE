package Demo34;

public class notebook {
  public void powerOn(){
      System.out.println("笔记本开机");
  }
    public void powerOff(){
        System.out.println("笔记本关机");
    }
    //使用usb设备的方法,使用借用作为方法的参数
    public void  UseDeive(USB usb){
        usb.open();  //打开设备
        if(usb instanceof  mouse){
            mouse mouse =(mouse)usb;   ////向下转型
            mouse.click();
        }
        else if (usb instanceof  keyboard){
            keyboard keyboard =(keyboard)usb;  //向下转型
            keyboard.type();
        }
        usb.shut();  //关闭设备


    }


}
