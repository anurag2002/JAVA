//Program to find the Fibonacci Series

import java.util.Scanner;
public class fibonacci 
{
    public static void main(String args[])
    {
        int i,a=0,b=1,fib=0;
        System.out.print("Enter the no of terms to be printed: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fibonacci Series: ");
        if(n == 1)
        {
            System.out.print(a);
        }
        else if(n == 2)
        {
            System.out.print(a + " " + b);
        }
        else
        {
            fib = a+b;
            System.out.print(a + " " + b + " ");
            a = b;
            b = fib;
            for (i = 3; i <= n; i++)
            {
                System.out.print(fib + " ");
                fib = a + b;
                a = b;
                b = fib;
            }
        }
    }    
}