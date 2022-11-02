package Lesson03;

import java.awt.*;

public class TestPaimt {
    public static void main(String[] args) {
    MyPaint myPaint=new MyPaint();
    myPaint.loadFrame();
    }
}

class MyPaint extends  Frame{
  public void loadFrame(){
      setBounds(200,200,600,500);
      setVisible(true);
        }

    @Override
    public void paint(Graphics g){
     //画笔，需要有颜色
     g.setColor(new Color(38, 91, 226));
      //画一个实心的圆
     g.fillOval(100,100,100,100);


        g.setColor(Color.yellow);
        g.fillRect(150,200,200,200);
  }
}
