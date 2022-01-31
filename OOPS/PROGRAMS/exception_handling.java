import java.util.Scanner;

public class exception_handling 
{
    public static void input()
    {
        Scanner sc = new Scanner(System.in);           
        System.out.print("Enter the number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number2: ");
        int num2 = sc.nextInt();
        divide(num1, num2);

    }
    public static void divide(int num1, int num2) throws ArithmeticException
    {
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
    }
    public static void main(String [] args)
    {
        try
        {
            input();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Dividing by 0 not allowed");
            input();
        }        
        finally
        {
            System.out.println("Code Completed");
        }
    }
}