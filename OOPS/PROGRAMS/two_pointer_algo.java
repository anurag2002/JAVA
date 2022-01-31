import java.util.*;

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
            count = twoPointerAlgo(arr, i, count);
        }
        if(count == 0)
        {
            System.out.println("No triplets found");
        }
    }
    public int twoPointerAlgo(int arr[], int i, int count)
    {
        int j = i+1, k = len-1;
        while(j < k)
        {
            if(arr[j] + arr[k] < (0-arr[i]))
            {
                j++;
            }
            else if(arr[j] + arr[k] > (0-arr[i]))
            {
                k--;
            }
            else
            {
                System.out.println("Triplet " + (count+1) + ": [" + arr[i] + ", " + arr[j] + ", " + arr[k] + "]");
                count++;
                break;
            }
        }
        return count;
    }
}
public class two_pointer_algo 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        triplets tr = new triplets();
        tr.input(arr, size);
        tr.tripletFind();
    }
}
