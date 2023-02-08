// Perfect Number
import java.util.Scanner;
public class main {

        public static void main(String[] args)
        {
            int a=0;
            Scanner s = new Scanner(System.in);15
            System.out.println("Enter the number :");
            a=s.nextInt();
            int b=a-1;
            int sum=0;

            for(int i =1;i<=b;i++)
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

