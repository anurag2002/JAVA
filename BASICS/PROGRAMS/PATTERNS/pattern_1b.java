import java.util.Scanner;
public class pattern_1b 
{
    public static void main(String args[])
    {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows and columns: ");
        int n = sc.nextInt();
        for(i = n; i >= 1; i--)
        {
            for(j = i; j >= 1; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}