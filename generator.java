import java.util.Scanner;
public class generator
{
  private static java.io.PrintStream screen = System.out;
private static Scanner kbd;

  public static void main(String[] args)
  {
    kbd = new Scanner(System.in);
    screen.print("Chose a type of problem from the list below:\n\n   1) Addition\n   2) Substraction\n   3) Multiplication\n   4) Division\n\nEnter Choice (1-4):");
    int a = kbd.nextInt();
    
    
    for (int k = 1; k > 0; k++)
    
    
    if (a==1)
    {
    int b = (int) (Math.random() * 50);
    int c = (int) (Math.random() * 50);
    screen.print(b + " + " + c + " = ");
    int x = kbd.nextInt();
    if (c+b==x)
    {
    screen.println("Good Job!");
    } 
    if (c+b!=x)
    {
    screen.println("Sorry, the answer is " + (c+b));
    }

    
  }
    else if (a==2)
    {
    int b = (int) (50 + Math.random() * 50);
    int c = (int) (Math.random() * 50);
    screen.print(b + " - " + c + " = ");
    int x = kbd.nextInt();
    if (b-c==x)
    {
    screen.println("Good Job!");
    } 
    if (b-c!=x)
    {
    screen.println("Sorry, the answer is " + (b-c));
    }

    
  }    
    else if (a==3)
    {
    int b = (int) (3 + Math.random() * 10);
    int c = (int) (3 + Math.random() * 10);
    screen.print(b + " x " + c + " = ");
    int x = kbd.nextInt();
    if (c*b==x)
    {
    screen.println("Good Job!");
    } 
    if (c*b!=x)
    {
    screen.println("Sorry, the answer is " + (c*b));
    }

    
  }    
    else if (a==4)
    {
    int b = (int) (3 + Math.random() * 10);
    int c = (int) (3 + Math.random() * 10);
    screen.print((b*c) + " / " + b + " = ");
    int x = kbd.nextInt();
    if ((c*b)/b==x)
    {
    screen.println("Good Job!");
    } 
    if ((c*b)/b!=x)
    {
    screen.println("Sorry, the answer is " + ((c*b)/b));
    }

    
  }    
    else
    {
    screen.println("Sorry, you can only pick a number between 1 and 4. Learn to count.");
    }

    
  }
}