import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class MonteCarlo extends Applet
{
	private static final long serialVersionUID = 1L;
	int height = 1000;
	int width = height;
	int CircleCounter = 1;
	int TotalCounter = 1;
	double PI;

	public void init()
	{
		setSize(height, width);
	}

	public void paint(Graphics g)
	{
		//g.setColor(Color.BLACK);
		//g.drawRect(10, 10, height - 10, width - 10);
		g.setColor(Color.BLACK);
		g.drawOval(0, 0, height, width);
		while (true)
		{
			//System.out.println("while loop working");
			int x = (int) (Math.random() * 1001);
			int y = (int) (Math.random() * 1001);
			TotalCounter++;
			//System.out.println(x);
			//System.out.println(y);
			if (Math.pow((500 - x), 2) + Math.pow((500 - y), 2) < Math.pow(500, 2))
			{
				//System.out.println("circle dots working");
				g.setColor(Color.RED);
				g.drawRect(x, y, 1, 1);
				CircleCounter++;
			}
			else
			{
				//System.out.println("outside circle dots working");
				g.setColor(Color.BLUE);
				g.drawRect(x, y, 1, 1);
			}
			g.drawRect(x, y, 1, 1);
			PI = ((double) CircleCounter / TotalCounter) * 4;
			System.out.println("BLUE = " + TotalCounter);
			System.out.println("RED = " + CircleCounter);
			System.out.println("PI = " + PI);
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, 146, 37);
			g.setColor(Color.BLACK);
			//g.drawRect(0, 0, 145, 40);
			g.drawString("BLUE = " + TotalCounter, 1, 11);
			g.drawString("RED = " + CircleCounter, 1, 24);
			g.drawString("PI = " + PI, 1, 37);
			try {Thread.sleep(10);}
				catch (InterruptedException e) {}
		}
	}
}