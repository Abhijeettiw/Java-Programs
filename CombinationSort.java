// Combination Sort

import java.util.scanner.*;
import java.util.*;

public class combinationsort
{
	int k=0,m=0;
	int size=0;
	public static void main(string[] args)
	{
		scanner s1=new Scanner(system.in);
		arraylist<string> l1=new Arraylist<string>();
		system.out.println("Enter size of list:");
		size=s1.nextint();

		for(int i =0;i<size;i++)
		{
			l1.add(s1.nextstring());
		}

		scanner s2=new Scanner(system.in);
		arraylist<integer> l2=new Srraylist<integer>();
		
		for(int i =0;i<size;i++)
		{
			l1.add(s2.nextint());
		}

		collections.sort(l1);
		arraylist<string> l3=new Arraylist<string>();
		
		for(int i =0;i<size;i++)
		{
			l3[k]=l1[i]+l2[i];
			k++;
		}

		system.out.println(l3);
		arraylist<Integer> l4=new Arraylist<integer>(new mycomparator);
		arraylist<character> l5=new Arraylist<character>();
		
		for(int i=0;i<size;i++)
		{
			l5.add(l1.toChar(i));
		}
		
		arraylist<integer> l6=new Arraylist<integer>();
		
		for(char c ='a';c<'z';c++)
		{
			for(int i =0;i<size;i++)
			{	
				if(c==l5[i])
				{
					l4.add(l2[i]);
				}
				l6.addall(l4);
				l4.clear();
			}
		}
	
		
		arraylist<string> l7=new Arraylist<string>();

		for(int i =0;i<size;i++)
		{
			l7[m]=l1[i]+l6[i];
			m++;
		}

		System.out.println(l7);
	}
}

class Mycomparator implements Comparator
{
	public int compare(object o1, object o2)
	{
		int i1=(Integer).o1;
		int i2=(Integer).o2;
		return i2.compareTo(i1);
	}
}













		