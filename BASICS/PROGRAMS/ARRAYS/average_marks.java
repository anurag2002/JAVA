//Program to find average marks of students in a class

import java.util.Scanner;
public class average_marks
{
    public static void main(String args[])
    {
        float i,sum=0,avg;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of students: ");
        float n = sc.nextFloat();
        for(i = 0; i < n; i++)
        {
            System.out.print("Enter marks student" + i+1 + ": ");
            float m = sc.nextFloat();
            sum = sum + m;
        }
        avg = sum/n;
        System.out.println("Average marks of students is: "+avg);
    }
}