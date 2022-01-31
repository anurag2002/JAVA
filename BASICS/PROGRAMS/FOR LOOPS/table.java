//Program to print the table of a number

import java.util.Scanner;
public class table 
{
    public static void main(String args[])
    {
        int i;
        System.out.print("Enter the no whose table is to be printed: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (i=1; i<=10; i++)
        {
            System.out.println(n + " X " + i + " = " + n*i);
        }
    }
}