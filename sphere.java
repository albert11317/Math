
import java.awt.Button;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.Color.*;
import java.awt.TextField;
import java.awt.Font;

public class sphere extends Applet implements ActionListener
{
	private static final long serialVersionUID = 1L;
	private TextField textRadius;
	private String stringRadius = "";
	private Button calculate;
	private Font ariel_24;
	private int radius;
  public void init() 
  {
	setSize(600, 400);
    ariel_24 = new Font("Ariel", 1, 24);
    super.setLayout(null);
    textRadius = new TextField();
    textRadius.setBounds(80, 5, 100, 35);
    super.add(textRadius);
    textRadius.setFont(ariel_24);
    calculate = new Button("Calculate");
    calculate.addActionListener(this);
    calculate.setBounds(185, 10, 100, 25);
    super.add(calculate);
  }
    
  public void paint(Graphics g) 
  {
  g.drawString("Enter Radius: ", 0, 25);
  g.setColor(red);
  g.fillOval(300-(radius), 200-(radius), radius*2, radius*2);
  g.setColor(black);
  //prime meridian
  g.drawArc(300-(radius/2), 200-(radius), radius, radius*2, 270, 180);
  //equator
  g.drawArc(300-(radius), 200-(radius/2), radius*2, radius, 180, 180);
  //SA
  g.drawString("Surface Area: "+(4 * 3.14159 * radius * radius), 0, 300);
  //Volume
  g.drawString("Volume: "+((4/3)* radius* radius* radius * 3.14159), 0, 350);
  }
    
  public void actionPerformed(ActionEvent e)
  {
    Button justPressed = (Button) e.getSource();
    if (justPressed == calculate)
    {
      stringRadius = textRadius.getText();
      radius = Integer.parseInt(stringRadius);
    }
    
    super.repaint();
  }
}