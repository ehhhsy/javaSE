package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestCalc {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

    }
}



//计算器类
class Calculator extends Frame{
    public Calculator()  {
        //3个文本框
        TextField num1 = new TextField(10);//字符数
        TextField num2 = new TextField(20);//字符数
        TextField num3 = new TextField(30);//字符数

//        1个按钮
        Button button = new Button("=");
//        button.addActionListener(new MyActionListener(num1,num2,num3));

//       1个标签
        Label label = new Label("+");

        //流式布局
        setLayout(new FlowLayout());

        add(num1);
        add(label);

        add(num2);
        add(button);

        add(num3);
        //设置可见
        setVisible(true);
//        设置自动对齐
        pack();
    }
}

//监听器类
class MyCalculator implements ActionListener{
    //获取三个遍历
    private TextField num1,num2,num3;
    public void MyCalculatorListener(TextField num1, TextField num2, TextField num3){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
          //1.获得加数和被加数
      int n1=Integer.parseInt(num1.getText());
      int n2=Integer.parseInt(num1.getText());

        //2.将这个值进行+法运算，放在第三个框
        num3.setText(""+(n1+n2));

        //清除前两个框
        num1.setText("");
        num2.setText("");

    }
}
