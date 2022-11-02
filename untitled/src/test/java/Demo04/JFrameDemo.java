package Demo04;

import javax.swing.*;

public class JFrameDemo {
    //init();初始化
    public void init(){
        JFrame jFrame = new JFrame("这是一个JFrame窗口");
        jFrame.setVisible(true);
        jFrame.setBounds(100,100,200,200);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        JFrameDemo one = new JFrameDemo();

    }
}
