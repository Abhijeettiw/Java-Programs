// Employee Listing

import java.io.*;
import java.util.regex.*;

public class Employeelisting
{
	public static void main(string[] args)
	{
		bufferedreader b=new Bufferedreader(new filereader("employee.csv"));
		string line=b.readline();
		
		while(line != null)
		{
			pattern p1=patter.compile("Manager,R&D");
			matcher m1=p1.matcher(line);
			
			while(m1.find())
			{		
				printwriter pw1=new Printwriter("Manager.csv");
				pw1.println(line);
			}

			pw1.flush();
			pattern p2=pattern.compile(\\s);
			matcher m2=p2.matcher(line);
			
			while(m2.find())
			{
				printwriter pw2=new Printwriter("single_name_employee.csv");   
				pw2.println(line);
			}

			line=b.readline();
			pw2.flush();
		}
		b.close();
	}
}
