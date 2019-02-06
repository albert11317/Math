import java.awt.Button;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.Color.*;
import java.awt.TextField;
import java.awt.Font;

public class cylinder extends Applet implements ActionListener
{
	private static final long serialVersionUID = 1L;
  private TextField textRadius;
  private TextField textHeight;
  private String stringRadius;
  private String stringHeight;
  public Double surfaceArea;
  public Double volume;
  private Button calculate;
  private Font ariel_24;
  private int radius;
  private int height;
  public void init() 
  {
	setSize(600,400);
    ariel_24 = new Font("Ariel", 1, 24);
    super.setLayout(null);
    textRadius = new TextField();
    textRadius.setBounds(80, 5, 100, 35);
    super.add(textRadius);
    textRadius.setFont(ariel_24);
    textHeight = new TextField();
    textHeight.setBounds(280, 5, 100, 35);
    super.add(textHeight);
    textHeight.setFont(ariel_24);
    surfaceArea= ((2 * 3.14159 * radius * height)+(2 * 3.14159 * radius * radius));
    volume= height* radius* radius * 3.14159;
    
    calculate = new Button("Calculate");
    calculate.addActionListener(this);
    calculate.setBounds(385, 10, 100, 25);
    super.add(calculate);
  }
    
  public void paint(Graphics g) 
  {
  g.drawString("Enter Radius: ", 0, 25);
  g.drawString("Enter Height: ", 200, 25);
  if(radius>0&&height>0)
  {
  g.setColor(red);
  g.fillOval(50, 50, radius*2, radius/2);
  g.fillOval(50, 50 + height, radius*2, radius/2);
  
  g.setColor(black);
  g.drawString("Height = "+height, 55 + radius *2, 50 + (radius / 4) + (height / 2));
  g.drawString("Surface Area: "+((2 * 3.14159 * radius * height)+(2 * 3.14159 * radius * radius)), 0, 300);
  g.drawString("Volume: "+(height* radius* radius * 3.14159), 0, 350);
  g.drawString("Radius: "+radius, 40 + (radius), 50 + (radius/4));

  g.setColor(red);
  g.fillRect(51, 50 + (radius / 4), radius * 2, height);

  g.setColor(black);
  g.drawOval(50, 50, radius*2, radius/2);
  g.drawLine(50 + (radius), 50 + (radius/4), 50 + (radius * 2), 50 + radius/4);
  g.drawLine(50, 50 + (radius/4), 50, height + 50);
  g.drawLine(50 + (radius), 50 + (radius/4), 50 + (radius * 2), 50 + radius/4);
  
  }
  }
    
  public void actionPerformed(ActionEvent e)
  {
    Button justPressed = (Button) e.getSource();
    if (justPressed == calculate)
    {
      stringRadius = textRadius.getText();
      radius = Integer.parseInt(stringRadius);
      stringHeight = textHeight.getText();
      height = Integer.parseInt(stringHeight);
    }
    
    super.repaint();
  }
}