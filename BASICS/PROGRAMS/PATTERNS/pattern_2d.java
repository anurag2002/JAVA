import java.util.Scanner;
public class pattern_2d
{
    public static void main(String args[])
    {
        int i,j,k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int n = sc.nextInt();
        for(i = 1; i < n; i++)
        {
            System.out.print("* ");
            for(k = 3; k <= i; k++)
            {
                System.out.print("  ");
            }
            if(i > 1)
            {    
                System.out.print("* ");
            }
            System.out.println();
        }
        for(k = 1; k <= i; k++)
        {
            System.out.print( "* ");
        }
    }    
}