//Program to find x^y

import java.util.Scanner;
public class x_power_y
{
    public static void main(String args[])
    {
        int i,b=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x in x^y: ");
        int x = sc.nextInt();
        System.out.print("Enter y in x^y: ");
        int y = sc.nextInt();
        for (i=1; i<=y; i++)
        {
            b = b * x;
        }
        System.out.println(x + " raise to the power " + y + " is " + b);
    }
}