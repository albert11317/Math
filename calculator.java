
import java.util.Scanner;
public class calculator
{
  private static java.io.PrintStream screen = System.out;
  private static Scanner kbd;

  public static void main(String[] args)
  {
    kbd = new Scanner(System.in);
    screen.println("This app can solve problems such as...\n  A + B  A - B  A * B  A / B\nWhere A and B are real numbers.\nPlease put a space before and after the operator.");

    for (int k = 1; k > 0; k++)
    {
    screen.println("Enter your problem: ");
    double a = kbd.nextDouble();
    String b = kbd.next();
    double c = kbd.nextDouble();
    if (b.equals("+"))
    {
    screen.println("The sum of " + a + " and " + c + " is "+ (a+c));
    }
    else if (b.equals("-"))
    {
    screen.println("The difference of " + a + " and " + c + " is "+ (a-c));
    }
    else if (b.equals("*"))
    {
    screen.println("The product of " + a + " and " + c + " is "+ (a*c));
    }
    else if (b.equals("/"))
    {
    screen.println("The quotient of " + a + " and " + c + " is "+ (a/c));
    }    
      else
    {
    screen.println("Reread what is written above and try again, \nit's not that hard unless you lost your keyboard.");
    }
    }
   }
  }