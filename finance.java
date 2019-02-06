
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.TextField;
import java.awt.Font;
import java.awt.Button;
import java.awt.Choice;
import java.awt.TextArea;


public class finance extends Applet implements ActionListener
{ 
  private static final long serialVersionUID = 1L;
  public String m;
  private Choice menu;
  private TextArea out;
  private Button calculate;
  private Button reset;
  private TextField principal;
  private TextField savingsGoal;
  private TextField apr;
  private Font monospaced_20;
  public int a;
  public String stringB;
  public String stringC;
  public String stringD;
  private String output;
  private double val;
  public double SavingsGoal;
  public double Apr;
  private String instructions;
  private int time;
  public double interest;
  public String m2;
  public int a2;
  public int b;
  public int c;
  public int d;
  public double val2;
  
  public void init() 
  {
	setSize(600, 400);
    m2 = String.format("%.2f", val);
    super.setLayout(null);
    monospaced_20 = new Font("Monospaced", 1, 20);
    
    menu = new Choice();
    menu.add("Compounding...");
    menu.add("Monthly");
    menu.add("Quarterly");
    menu.add("Annually");
    menu.setBounds(10, 80, 200, 25);
    super.add(menu);
    menu.setFont(monospaced_20);
    
    out = new TextArea();
    out.setText("Waiting...");
    out.setBounds(10, 125, 555, 275);
    super.add(out);
    out.setFont(monospaced_20);
    
    calculate = new Button("Calculate");
    calculate.addActionListener(this);
    calculate.setBounds(300, 75, 100, 40);
    super.add(calculate);
    
    reset = new Button("Reset");
    reset.addActionListener(this);
    reset.setBounds(450, 75, 100, 40);
    super.add(reset);
    
    principal = new TextField();
    principal.setBounds(10, 30, 120, 35);
    super.add(principal);
    principal.setFont(monospaced_20);
    
    savingsGoal = new TextField();
    savingsGoal.setBounds(200, 30, 200, 35);
    super.add(savingsGoal);
    savingsGoal.setFont(monospaced_20);
    
    apr = new TextField();
    apr.setBounds(450, 30, 100, 35);
    super.add(apr);
    apr.setFont(monospaced_20);
    
    principal.requestFocus();
    
    instructions = "Enter dollar amounts (without the $ symbol) \nin the Principal and Savings Goal fields. \nThen enter the Annual Percentage Rate \n(i.e.: 4.5 for 4.5%) and select the \ncompounding frequency. Then press the \nCalculate button. The Reset button will \nclear all fields.";
    output=instructions;
    out.setText(output);
  }
    
  public void paint(Graphics g) 
  {
  g.setFont(monospaced_20);
  g.drawString("Principal:", 10, 20);
  g.drawString("Savings Goal:", 200, 20);
  g.drawString("APR:", 450, 20);
  }
    
  public void actionPerformed(ActionEvent e)
  {
     Button justPressed = (Button) e.getSource();
      if (justPressed == calculate)
        {
          int a = menu.getSelectedIndex();
          String stringB = principal.getText();
          String stringC = savingsGoal.getText();
          String stringD = apr.getText();
          double val = Double.parseDouble(stringB);
          double SavingsGoal = Double.parseDouble(stringC);
          double Apr = (Double.parseDouble(stringD))/100;
          double interest = 0;
          
          output="";
            if (a == 0)
              {
              output="Select a Compounding Frequency!";
              }
            
            else if (a == 1)
              {
                Apr = Apr/12;
                while (val <= SavingsGoal)
                {
                 interest = Apr * val;
                 val += interest;
                 time = time + 1;
                 String q = String.format("%.2f", interest);
                 String b = String.format("%.2f", val);
                 output += "\n\nMonth: " + time;
                 output += "\nInterest: " + q;
                 output += "\nBalance: " + b;
                }
                out.setText("\n" + output);
              }
            
            else if (a == 2)
              {
                Apr = Apr/4;
                while (val <= SavingsGoal)
                {
                 interest = Apr * val;
                 val += interest;
                 time = time + 1;
                 String c = String.format("%.2f", interest);
                 String d = String.format("%.2f", val);
                 output += "\n\nMonth: " + time;
                 output += "\nInterest: " + c;
                 output += "\nBalance: " + d;
                }
                out.setText("\n" + output);
               
              }
              
            else if (a == 3)
              {
                
                while (val <= SavingsGoal)
                {
                 interest = Apr * val;
                 val += interest;
                 time = time + 1;
                 String h = String.format("%.2f", interest);
                 String f = String.format("%.2f", val);
                 output += "\n\nMonth: " + time;
                 output += "\nInterest: " + h;
                 output += "\nBalance: " + f;
                }
                out.setText("\n" + output);
              }
       
        }
       else if (justPressed == reset)
        {
          a2 = 0;
          b = 0;
          c = 0;
          d = 0;
          val2 = 0;
          menu.select(0);
          principal.requestFocus();
          output=instructions;
          //clear all boxes//
        }
    
  out.setText(output);
  }
  { 
    super.repaint();
  }


}