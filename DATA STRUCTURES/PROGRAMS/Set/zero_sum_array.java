import java.util.*;

public class zero_sum_array 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();
        List<Integer> array1 = new ArrayList<>();
        List<Integer> subarray = new ArrayList<>();
        
        System.out.print("Enter the size of array: ");
        int count = 0, sum = 0, size = sc.nextInt();

        System.out.print("Enter the elements in array: ");
        for(int i = 0; i < size; i++)
        {
            array.add(sc.nextInt());
        }
        array1.addAll(array);
        System.out.println("Array: " + array);

        for(int i = 1; i < size; i++)
        {
            for(int j = 0; j < (size-i+1); j++)
            {
                subarray=array.subList(j, j+i);
                for(int e : subarray)
                {
                    sum = sum + e;
                }
                if(sum == 0)
                {
                    count++;
                    System.out.println("SubArray " + count + ": " + subarray);
                }
                sum = 0;
                subarray.clear();
                array.clear();
                array.addAll(array1);
            }
        }
        for(int e : array)
        {
            sum = sum + e;
        }
        if(sum == 0)
        {
            count++;
            System.out.println("SubArray " + count + ": " + array);
        }
        sc.close();
    }
}
