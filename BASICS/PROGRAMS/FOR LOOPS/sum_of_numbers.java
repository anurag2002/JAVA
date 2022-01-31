//Program to find the sum of first n numbers

import java.util.Scanner;
public class sum_of_numbers 
{
    public static void main(String args[])
    {
        int i,sum=0;
        System.out.print("Enter the total no of digits whose sum is to be calculated: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (i = 0; i <= x; i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of "+ x + " numbers is: " + sum);
    }
}