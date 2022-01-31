import java.util.Scanner;

class swap
{
    public swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Numbers after swap in function: " + a + " and " + b);
    }
}
public class pass_by_value 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Numbers before swap: " + a + " and " + b);
        
        swap sp = new swap(a, b);
        System.out.println("Numbers after swap in main: " + a + " and " + b);
    }
}