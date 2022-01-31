import java.util.Scanner;
public class pattern_2b
{
    public static void main(String args[])
    {
        int i,j,k,count=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int n = sc.nextInt();
        for(i = 1; i <= n; i++)
        {
            for(j = n-i; j >=1; j--)
            {
                System.out.print(" ");
            }
            for(k = 1; k <= i; k++)
            {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }    
}