import java.util.Scanner;
public class quadraticanalyzer
{
  private static java.io.PrintStream screen = System.out;
private static Scanner kbd;

  public static void main(String[] args)
  {
    char exp2 = (char)178;
    kbd = new Scanner(System.in);
    screen.print("The Quadratic Equation is ax" + exp2 + " + bx + c = 0\n\nEnter a: ");
    double a = kbd.nextDouble();
    screen.print("Enter b: ");
    double b = kbd.nextDouble();
    screen.print("Enter c: ");
    double c = kbd.nextDouble();
   
   
   
    //discrimnant//
    double d = (b*b)-(4*a*c);
   
   
   
   
    //Quadratic Formula//
    double e = (Math.sqrt(((b*b)-(4*a*c))));
    double f = (((-b) + e)/(2*a));
    double g = (((-b) - e)/(2*a));
    
    
    
    
    //Complex//
    double h = ((-b)/(2*a));
    double i = (Math.sqrt((4*a*c)-(b*b))/(2*a));
    
    
    
    screen.println("\n\n\nYour problem is: " + a + "x" + exp2 + " + " + b + " + " + c + " = 0");





    if (a == 0 && b == 0 && c == 0)
    
    
    
    
    {
      screen.println("Infinite Solutions, put some numbers in!");
      
    }
    
    
    
    
    
    else if (a == 0 && b == 0 && c != 0)
    
    
    
    {
      screen.println("There are no x - intercepts!");
      
    }
    
    
    
    
    
    
    else if (a == 0)

    
    {
      screen.println("x = " + ((-c)/b));
      screen.println("Try an equation that's not a line!");
    }
    
    
      
    else if (a != 0 && d == 0)
    
    
    
    {
    screen.println("x = " + (f));
    }
    


      
    else if (a != 0 && d > 0 )
    
    
    
    {
      screen.println("x = " + (f) + " and x = " + (g));
    }
      
      
      
      
      
    else if (a != 0 && d < 0 && h == 0)
      
      //complex//
      
      
    {
      screen.println("x = " + (i) + "i and x = " + (-i));
      screen.println("Get back into Reality!");
    }

      
      
    else if (a != 0 && d < 0 && h != 0)
      
      //complex//
      
      
    {
      screen.println("x = " + (h) + "+" + (i) + "i and x = " + (h) + (-i) + "i");
      screen.println("Try getting numbers that actually exist!");
    } 
      
      
      

}
  }