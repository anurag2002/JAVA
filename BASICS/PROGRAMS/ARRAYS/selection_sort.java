//Program to sort an array using selection sort

import java.util.Scanner;
public class selection_sort 
{
    public static void main(String args[])
    {
        int i,j,arr[],min,ind=0;
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
        for(i = 0; i<n-1; i++)
        {
            min = arr[i+1];
            ind = i+1;
            for(j=i+2; j<n; j++)
            {
                if(min > arr[j])
                {
                    min = arr[j];
                    ind = j;
                }
            }
            if(min < arr[i])
            {
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
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