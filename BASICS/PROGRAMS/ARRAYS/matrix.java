//Program to enter a matrix

import java.util.Scanner;
public class matrix 
{
    public static void main(String args[])
    {
        int mat[][],i,j;
        mat = new int[100][100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the no of columns: ");
        int col = sc.nextInt();
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                System.out.print("Enter the element of matrix: ");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Entered Matrix is: ");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
}