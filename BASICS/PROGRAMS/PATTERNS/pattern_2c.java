import java.util.Scanner;
public class pattern_2c
{
    public static void main(String args[])
    {
        int i,j,k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int n = sc.nextInt();
        int m = n/2;
        for(i = 1; i <= m; i++)
        {
            for(k = 1; k <= i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i = m+1; i <= n; i++)
        {
            for(k = i; k <= n; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}