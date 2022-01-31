//Program to print the sum of series 1 - 1/2 + 1/3 - 1/4 + 1/5 - ....... 1/n

import java.util.Scanner;
public class sum_of_series2 
{
    public static void main(String args[])
    {
        float i, res=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total no of terms in the series: ");
        float n = sc.nextFloat();
        for(i = 1; i<=n; i++)
        {
            if(i % 2 == 0)
            {
                res = res - 1/i;
            }
            else
            {
                res = res + 1/i;
            }
        }
        System.out.println("The sum of series 1 - 1/2 + 1/3 - 1/4 .... till " + n + " terms is: " + res);
    }
}