//Program to sort an array using Bubble Sort

import java.util.Scanner;
public class bubble_sort 
{
    public static void main(String args[])
    {
        int i,j,arr[];
        arr = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        for(i = 0; i<n; i++)
        {
            System.out.print("Enter the element of array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Unsorted Array is: ");
        System.out.print("[");
        for(i=0; i<n-1; i++)
        {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[i] + "]");
        for(i = 0; i<n; i++)
        {
            for(j=0; j<n-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\nSorted Array is: ");
        System.out.print("[");
        for(i=0; i<n-1; i++)
        {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[i] + "]");
    }
}