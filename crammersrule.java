
import java.util.Scanner;

public class crammersrule
{
	 private static java.io.PrintStream screen = System.out;
	private static Scanner kbd;

	  public static void main(String[] args)
	  {
	    kbd = new Scanner(System.in);
	    screen.println("+---------------------------------------+");
	    screen.println("|             Crammer's Rule            |");
	    screen.println("+---------------------------------------+");
	    screen.print("");
	    screen.println("The FIRST equation is Ax + Bx = C");
	    screen.print("Enter A -> ");
	    double a = kbd.nextDouble();
	    screen.print("Enter B -> ");
	    double b = kbd.nextDouble();
	    screen.print("Enter C -> ");
	    double c = kbd.nextDouble();
	    screen.print("");
	    screen.println("The SECOND equation is Dx + Ex = F");
	    screen.print("Enter D -> ");
	    double d = kbd.nextDouble();
	    screen.print("Enter E -> ");
	    double e = kbd.nextDouble();
	    screen.print("Enter F -> ");
	    double f = kbd.nextDouble();
	    screen.print("");
	    screen.println("The system of equations is:");
	    screen.println(a + "x + " + b + "y = " + c);
	    screen.println(d + "x + " + e + "y = " + f);
	    screen.println("Has the solutions:");
	    screen.println(("x = ") + ((c*e) - (b*f)) / ((a*e) - (b*d)));
	    screen.println(("y = ") + ((a*f) - (c*d)) / ((a*e) - (b*d)));
	  }
}
