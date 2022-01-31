import java.util.Scanner;

class triplets
{
    int arr[] = new int[100];
    int len, count = 0;
    public void input(int array[], int l)
    {
        this.arr = array;
        this.len = l;
    }
    public void tripletFind()
    {
        for(int i = 0; i < len-2; i++)
        {
            if((arr[i] + arr[i+1] + arr[i+2]) == 0)
            {
                System.out.println("Triplet " + (count+1) + " is: [" + arr[i] + ", " + arr[i+1] + ", " + arr[i+2] + "]");
                count++;
            }
        }
        if(count == 0)
        {
            System.out.println("No triplets found");
        }
    }
}

public class array_triplets 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements in array: ");
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        triplets tr = new triplets();
        tr.input(arr, size);
        tr.tripletFind();
    }
}