//Program to find the factorial of a number

import java.util.Scanner;
public class factorial 
{
    public static void main(String args[])
    {
        int i,fact=1;
        System.out.print("Enter the whole number whose factorial is to be found: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0)
        {
            fact = 1;
        }
        else
        {
            for (i = 1; i <= n; i++)
            {
                fact = fact * i;
            }
        }
        System.out.println("The factorial of " + n + " is " + fact);
    }
}