// Perfect Number

import java.util.scanner.*;
public class Perfectno
{
	public static void main(string[] args)
	{
		int a=0;
		Scanner s=new Scanner(system.in);
		System.out.println("Enter the number :")
		a=s.nextInt();
		int b=a-1;
		int sum=0;
		
		for(int i =0;i<=b;i++)
		{
			if(a%i==0)
			{
				sum += i;
			}
		}
		
		if(sum==a)
		{
			System.out.println("True");
		}
		else
		{	
			System.out.println("False");
		}
	}
}
