import java.util.Scanner;
public class pattern_1d
{
    public static void main(String args[])
    {
        int i,j,k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows and columns: ");
        int n = sc.nextInt();
        for(i = 1; i <= n; i++)
        {
            for(k = n-i; k >=1; k--)
            {
                System.out.print(" ");
            }
            for(j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}