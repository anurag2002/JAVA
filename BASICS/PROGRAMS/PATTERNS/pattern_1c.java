import java.util.Scanner;
public class pattern_1c
{
    public static void main(String args[])
    {
        int i,j,k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows and columns: ");
        int n = sc.nextInt();
        for(i = 1; i <= n; i++)
        {
            for(k = 1; k <i; k++)
            {
                System.out.print(" ");
            }
            for(j = n-i+1; j >=1; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}