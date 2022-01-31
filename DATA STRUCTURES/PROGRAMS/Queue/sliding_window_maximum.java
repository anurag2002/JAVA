import java.util.*;

public class sliding_window_maximum 
{
    public static void main(String[] args) 
    {
        List<Integer> array = new ArrayList<>();
        PriorityQueue<Integer> window = new PriorityQueue<>(Collections.reverseOrder());
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements in array: ");
        for(int i = 0; i < size; i++)
        {
            array.add(sc.nextInt());
        }

        System.out.print("Enter the size of winodw: ");
        int k = sc.nextInt();

        for(int x = 0; x < (k-1); x++)
        {
            window.add(array.get(x));
        }
        
        int x = k-1;
        while(x < size)
        {
            window.add(array.get(x));
            System.out.println(window.remove());
            x++;
        }
        sc.close();
        
    }
}
