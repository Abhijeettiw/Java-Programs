// Combination Sort

import java.util.scanner.*;
import java.util.*;

public class Combinationsort
{
	int k=0,m=0;
	int size=0;
	public static void main(string[] args)
	{
		Scanner s1=new Scanner(system.in);
		Arraylist<String> l1=new Arraylist<String>();
		System.out.println("Enter size of list:");
		size=s1.nextInt();

		for(int i =0;i<size;i++)
		{
			l1.add(s1.nextString());
		}

		Scanner s2=new Scanner(system.in);
		Arraylist<Integer> l2=new Arraylist<Integer>();
		
		for(int i =0;i<size;i++)
		{
			l1.add(s2.nextInt());
		}

		collections.sort(l1);
		Arraylist<String> l3=new Arraylist<String>();
		
		for(int i =0;i<size;i++)
		{
			l3[k]=l1[i]+l2[i];
			k++;
		}

		System.out.println(l3);
		Arraylist<Integer> l4=new Arraylist<integer>(new Mycomparator);
		Arraylist<Character> l5=new Arraylist<Character>();
		
		for(int i=0;i<size;i++)
		{
			l5.add(l1.toChar(i));
		}
		
		Arraylist<integer> l6 = new Arraylist<integer>();
		
		for(char c ='a';c<'z';c++)
		{
			for(int i = 0; i < size; i++)
			{	
				if(c==l5[i])
				{
					l4.add(l2[i]);
				}
				l6.addall(l4);
				l4.clear();
			}
		}
	
		
		Arraylist<String> l7=new Arraylist<String>();

		for(int i =0 ;i<size; i++)
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













		
