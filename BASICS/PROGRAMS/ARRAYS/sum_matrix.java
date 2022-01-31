import java.util.Scanner;
public class sum_matrix
{
    public static void main(String args[])
    {
        int a[][],b[][],c[][],i,j;
        a = new int[100][100];
        b = new int[100][100];
        c = new int[100][100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the no of columns: ");
        int col = sc.nextInt();
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                System.out.print("Enter the element of matrix A: ");
                a[i][j] = sc.nextInt();
            }
        }
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                System.out.print("Enter the element of matrix B: ");
                b[i][j] = sc.nextInt();
            }
        }
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Entered Matrix A is: ");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Entered Matrix B is: ");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Sum of Matrix A and Matrix B is: ");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}