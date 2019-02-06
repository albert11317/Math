import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.Color.*;


public class triangle extends Applet implements ActionListener
{
	private static final long serialVersionUID = 1L;


public void init() 
  {
    setSize(600,400);
  }
    
  public void paint(Graphics g) 
  {
  /*Axis*/
  g.drawLine(300, 0, 300, 400);
  g.drawLine(0, 200, 600, 200);
  /*Triangle*/
  g.setColor(RED);
  int x1 = 100, y1 = 175;
  int x2 = 200, y2 = -50;
  int x3 = -50, y3 = 50;
  int sx1 = 300+x1;
  int sy1 = 200-y1;
  int sx2 = 300+x2;
  int sy2 = 200-y2;
  int sx3 = 300+x3;
  int sy3 = 200-y3;
  g.drawLine(sx1, sy1, sx2, sy2);
  g.drawLine(sx2, sy2, sx3, sy3);
  g.drawLine(sx3, sy3, sx1, sy1);
  /*Coordinates*/
  String a = "150,100";
  String b = "200,-75";
  String c = "-200,25";
  g.drawString(a , sx1, sy1);
  g.drawString(b , sx2, sy2);
  g.drawString(c , sx3, sy3);
  /*Perimeter*/
  double d = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
  double e = Math.sqrt(((x2-x3)*(x2-x3))+((y2-y3)*(y2-y3)));
  double f = Math.sqrt(((x3-x1)*(x3-x1))+((y3-y1)*(y3-y1)));
  String h = "Perimeter : " + (d + e + f);
  g.drawString(h, 10, 10);
  /*Area*/
  double i = (0.25)*Math.sqrt((d+e+f)*((-1*d)+e+f)*((-1*e)+d+f)*((-1*f)+e+d));
  String j = "Area = " + (i);
  g.drawString (j, 10, 20);
  }
    
  public void actionPerformed(ActionEvent e)
  {
    
    
    super.repaint();
  }
}