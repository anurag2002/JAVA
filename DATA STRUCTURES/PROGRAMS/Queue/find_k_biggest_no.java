import java.util.*;

public class find_k_biggest_no 
{
    public static void main(String[] args) 
    {
        PriorityQueue<Integer> pque = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> maxpque = new PriorityQueue<>(Collections.reverseOrder());
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements in queue: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in queue: ");
        for(int i = 0; i < n; i++)
        {
            pque.add(sc.nextInt());
        }
        System.out.println("The queue is: " + pque);
        maxpque.addAll(pque);
        System.out.println("3 Largest Elements of the queue is: [" + maxpque.remove() + ", " + maxpque.remove() + ", " + maxpque.remove() + "]");
        sc.close();
    }
}
