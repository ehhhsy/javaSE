package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ABC {
    public static void main(String[] args) {
        //启动！
        new MyFrame();

    }
}

class MyFrame extends Frame {
    public MyFrame() {
        //文本框
        TextField textField = new TextField();
        add(textField);

        //监听这个文本框输入的文字
        MyActionListener myActionListener = new MyActionListener();
        //按下enter，就会触发监听时间
        textField.addActionListener(myActionListener);
      pack();
      setVisible(true);

      //设置替换编码，输入的时候会变成*号，下面获取正常的数字
        textField.setEchoChar('*');
    }
}
class MyActionListener implements ActionListener {
    public MyActionListener() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField  textField = (TextField)e.getSource();//获得一些资源
       textField.getText();//获得输入框的文本
        System.out.println(textField.getText());
       textField.setText(""); //null 回车就清空
    }
}





