import java.util.Scanner;

public class projectile
{
	private static java.io.PrintStream screen = System.out;
	private static Scanner kbd;
	
	public static void main(String[] args)
	{
		kbd = new Scanner(System.in);
		screen.println("This program will calculate the height and speed of a projectile that is \nthrown straight up into the air on planet earth (in a situation where air \n resistance is ignored)");
		screen.println("Enter Starting Height (in meters): ");
		int height = kbd.nextInt();
		
		screen.println("Enter Starting Speed (in meters/second): ");
		int speed = kbd.nextInt();
		
		screen.println("Enter Time at which you desire to know the height and speed of the projectile \n(in seconds): ");
		int time = kbd.nextInt();
		
		screen.println("The height of the projectile is " + ((height) + (speed*time) - (4.9*(time)*(time))));
		screen.println("The speed of the projectile is " + ((speed) - 9.8*(time)) + "\n");
	}

}
