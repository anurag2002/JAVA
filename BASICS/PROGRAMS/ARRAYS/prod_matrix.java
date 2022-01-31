//Program to find the Product of two matrix

import java.util.Scanner;
public class prod_matrix 
{
    public static void main(String args[])
    {
        int a[][],b[][],c[][],i1,j1,i2,j2;
        a = new int[100][100];
        b = new int[100][100];
        c = new int[100][100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows in Matrix A: ");
        int row1 = sc.nextInt();
        System.out.print("Enter the no of columns in Matrix A: ");
        int col1 = sc.nextInt();
        System.out.print("Enter the no of rows in Matrix B: ");
        int row2 = sc.nextInt();
        System.out.print("Enter the no of columns in Matrix B: ");
        int col2 = sc.nextInt();
        if(row2 == col1)
        {
            for(i1 = 0; i1 < row1; i1++)
            {
                for(j1 = 0; j1 < col1; j1++)
                {
                    System.out.print("Enter the element of matrix A: ");
                    a[i1][j1] = sc.nextInt();
                }
            }
            for(i2 = 0; i2 < row2; i2++)
            {
                for(j2 = 0; j2 < col2; j2++)
                {
                    System.out.print("Enter the element of matrix B: ");
                    b[i2][j2] = sc.nextInt();
                }
            }
            System.out.println("Entered Matrix A is: ");
            for(i1 = 0; i1 < row1; i1++)
            {
                for(j1 = 0; j1 < col1; j1++)
                {
                    System.out.print(a[i1][j1] + "\t");
                }
                System.out.println();
            }
            System.out.println("Entered Matrix B is: ");
            for(i2 = 0; i2 < row2; i2++)
            {
                for(j2 = 0; j2 < col2; j2++)
                {
                    System.out.print(b[i2][j2] + "\t");
                }
                System.out.println();
            }
            System.out.println("Product of Matrix A and Matrix B is: ");
            for(i1 = 0; i1 < row1; i1++)
            {
                for(j2 = 0; j2 < col2; j2++)
                {
                    c[i1][j2] = 0;
                    for(int t = 0; t < row2; t++)
                    {
                        c[i1][j2] = c[i1][j2] + a[i1][t]*b[t][j2];
                    }
                    System.out.print(c[i1][j2] + "\t");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("No of rows in Matrix B not equal to no of columns in Matrix A");
        }
    }
}