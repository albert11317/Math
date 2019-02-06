import java.util.Scanner;
public class shapes
{
  private static java.io.PrintStream screen = System.out;
private static Scanner kbd;

  public static void main(String[] args)
  {
    kbd = new Scanner(System.in);
    screen.print("Chose a Shape from the list below:\n\n   1) Rectangle\n   2) Right Triangle\n   3) Circle\n\nEnter Choice (1-3):");
    int x = kbd.nextInt();
    if (x == 1)
    {
    screen.print("Enter length: ");
    double a = kbd.nextDouble();
    screen.print("Enter width: ");
    double b = kbd.nextDouble();
    screen.println("The Rectangle is a " + a + " x " + b + " Rectangle");
    screen.println("The Area is: " + a*b);
    screen.println("The Perimeter is: " + (a+a+b+b));
    }    
     else if (x == 2)
    {
    screen.print("Enter base length:");
    double a = kbd.nextDouble();
    screen.print("Enter height:");
    double b = kbd.nextDouble();
    screen.println("The Triangle is " + b + " tall and has a base length of " + a);
    screen.println("The Area is: " + (a*b)/2);
    double c = Math.sqrt((a*a)+(b*b));
    screen.println("The Perimeter is: " + (a+b+c));
    }    
     else if (x == 3)
    {
    screen.print("Enter radius:");
    double a = kbd.nextInt();
    screen.println("The Circle has a Radius of " + a + " and a Diameter of " + (a+a));
    screen.println("The Area is: " + (a*a*3.14));
    screen.println("The Perimeter is: " + (2*3.14*a));
    }   
      else
    {
    screen.println("You need to Enter an Integer between 1 and 3 (1, 2, or 3).\nThis isn't Computer Science!");
}
  }
}