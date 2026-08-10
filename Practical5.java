import java.awt.*;

public class Practical5 extends Frame
{
  Practical5()
  {
    setSize(500,500);
    setTitle("ALL THE BEST");
    setVisible(true);

  }
  public void paint(Graphics g)
  {
    g.setColor(Color.RED);
    g.drawString("ALL THE BEST ",100,100);

    g.setColor(Color.GREEN);
    g.drawString("ALL THE BEST ",100,150);
    g.setColor(Color.BLUE);
    g.drawString("ALL THE BEST ",100,200);

    g.setColor(Color.ORANGE);
    g.drawString("ALL THE BEST ",100,250);

    g.setColor(Color.BLACK);
    g.drawString("ALL THE BEST ",100,300);


  }
  public static void main(String[] args)
  {
    new Practical5();
  }
}