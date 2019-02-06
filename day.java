
import java.util.Scanner;
public class day
{
  private static java.io.PrintStream screen = System.out;
  private static Scanner kbd;

  public static void main(String[] args)
  {
    kbd = new Scanner(System.in);
    int lastDate = 0;
    int mm = 0;
    int my = 0;
    boolean leapYear;
    screen.print("Enter year: ");
    int year = kbd.nextInt();
    if (year <= 1752)
       {
       screen.println("Invalid year.");
       }
    else if (year > 1752)
       {
          int one = year%400;
          int two = year%100;
          int three = year%4;
    if (one == 0)
          {
          leapYear = true;
          }  
    else if (two == 0)
          {
          leapYear = false;
          }
    else if (three == 0)
          {
          leapYear = true;
          }
    else
          {
          leapYear = false;
          }
    screen.println("Leap Year = " + leapYear);
    //Month//
    screen.print("Enter month (1-12): ");
    int m = kbd.nextInt();
    if (m>12 || m<1)
        {
        screen.println("Invalid month.");
        } 
    else if (m<13 && m>0)
        {
        if (leapYear == false && m == 2)
            { 
            lastDate = 28;
            }
        else if (leapYear == true && m == 2)
            { 
            lastDate = 29;
            }
        else if (m == 4 || m == 6 || m == 9 || m == 11)
            {
            lastDate = 30;
            }
        else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
            {
            lastDate = 31;
            }
            screen.print("Enter day (1-" + lastDate + "): ");
            int d = kbd.nextInt();
         
            
      if (d > lastDate || d < 1)
      {
       screen.println("Invalid day.");    
      }
            
            
     else if (d <= lastDate && d >= 0)
    //Day of the week//
    {
    if  (m==1||m==2)
        {
        mm = m + 12;
        my = year - 1;
        } 
    else 
      {
       mm = m;
       my = year;
      }
    int w = ( ((d) + ( ( 26 * ( mm + 1 ) ) / 10 ) + ( my ) + ( my / 4 ) + ( ( 6 ) * ( my / 100 ) ) + ( my / 400 ) ) % 7);
    if (w == 0)
        {
        screen.print("Saturday, ");
        }
    if (w == 1)
        {
        screen.print("Sunday, ");
        }
    if (w == 2)
        {
        screen.print("Monday, ");
        }
    if (w == 3)
        {
        screen.print("Tuesday, ");
        }
    if (w == 4)
        {
        screen.print("Wednesday, ");
        }
    if (w == 5)
        {
        screen.print("Thursday, ");
        }
    if (w == 6)
        {
        screen.print("Friday, ");
        }
     
    screen.println(m + "-"+ d +"-" + year);
        }
   }
}
}
  }