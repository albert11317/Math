import java.util.Scanner;

public class converter 
{
	private static java.io.PrintStream screen = System.out;
	private static Scanner kbd;

	  public static void main(String[] args)
	  {
	    kbd = new Scanner(System.in);
	    screen.print("Enter the major unit: ");
	    String a = kbd.nextLine();
	    screen.print("Enter the minor unit: ");
	    String b = kbd.nextLine();
	    screen.print("How many " + b + " in a " + a + (": "));
	    int c = kbd.nextInt();
	    screen.print("How many " + b + " do you have: ");
	    int d = kbd.nextInt();
	    screen.println("You have " + (d / c) + (" ") + a + (" ") + (d % c) + (" ") + b + (" "));
	  }
}
