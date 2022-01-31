//Program to check whether the given number is prime or not

import java.util.Scanner;
public class prime_number 
{
    public static void main(String args[])
    {
        int i,count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        int n = sc.nextInt();
        for (i = 2; i < n; i++)
        {
            if(n % i == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.println(n + " is a prime number");
        }
        else
        {
            System.out.println(n + " is not a prime number");
        }
    }
}