\\ Shortest Distance of Manhattan Path

import java.util.scanner.*;
import static java.util.math.*;

public class ManShortPath
{
	int hori=0,verti=0;
	int start=0;
	int x=0,y=0;
	int sd=0;
	string end=null;
	boolean yes=false;

	public void input(int[][] area)
	{
		
		scanner s=new Scanner(system.in);
		System.out.println("Enter the coordinate for X axis :");
		x=s.nextint();
		System.out.println("Enter the coordinate for Y axis :");
		y=s.nextint();
		start=area[x][y];
		scanner s1=new Scanner(system.in);
		System.out.println("Enter the End Point in directions(eg- NWES) :");
		end=s1.nextline();
	}

	public boolean validation()
	{
		while(end != null)
		{
			char[] ch=end.tochar();
			
			for(int i =0;i<ch.length;i++)
			{
				if(i != N || i != E || != S || i != W)
				{
					system.out.println("Invalid End point");
				}
				else
				{
					yes=true;
				}
			}
		}
	}

	public int shortestdist()
	{
		if(yes==true)
		{
			char[] ch1=end.tochar();
			
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]==N)
				{
					verti +=1;
				}

				else if(ch1[i]==E)
				{
					hori +=1;
				}

				else if(ch1[i]==S)
				{
					verti -=1;
				}

				else(ch1[i]==W)
				{
					hori -=1;
				}
			}

			sd=math.sqrt((verti-x)^2 + (hori-y)^2);
			return sd;
		}
	}

	public static void main(string[] args)
	{
		int[][] area=new int[10][10];
		ManShortPath msp=new ManShortPath();
		msp.input(area[][]);	
		msp.validation();
		msp.shortestdist();	
	}
}	











