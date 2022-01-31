import java.util.*;
import java.lang.Math;

public class merge_linkedlist 
{
    public static void main(String[] args) 
    {
        List<Integer> ll1 = new LinkedList<>();
        List<Integer> ll2 = new LinkedList<>();
        List<Integer> ll3 = new LinkedList<>();
        List<Integer> ll4 = new LinkedList<>();

        long start, end;

        PriorityQueue<Integer> llc = new PriorityQueue<>();

        ll1.add(1);
        ll1.add(3);
        ll1.add(5);
        ll1.add(8);
        ll1.add(10);
        ll1.add(12);
        ll1.add(15);

        ll2.add(2);
        ll2.add(4);
        ll2.add(6);
        ll2.add(13);
        ll2.add(14);
        ll2.add(17);
        ll2.add(19);
        
        ll3.add(0);
        ll3.add(7);
        ll3.add(9);
        ll3.add(11);
        ll3.add(16);
        ll3.add(18);
        ll3.add(20);
        
        System.out.println("Initial Queue are:");
        System.out.println(ll1);
        System.out.println(ll2);
        System.out.println(ll3);
        
        
        int i=0,j=0,k=0;
        start = System.currentTimeMillis();
        while(i < 7 && j < 7 && k < 7)
        {
            int min = Math.min(ll1.get(i), Math.min(ll2.get(j), ll3.get(k)));
            if(min == ll1.get(i))
            {
                i++;
            }
            else if(min == ll2.get(j))
            {
                j++;
            }
            else
            {
                k++;
            }
            ll4.add(min);
        }
        while(j < 7 && k < 7)
        {
            int min = Math.min(ll2.get(j), ll3.get(k));
            if(min == ll2.get(j))
            {
                j++;
            }
            else
            {
                k++;
            }
            ll4.add(min);
        }
        while(j < 7 && i < 7)
        {
            int min = Math.min(ll2.get(j), ll1.get(i));
            if(min == ll2.get(j))
            {
                j++;
            }
            else
            {
                i++;
            }
            ll4.add(min);
        }
        while(i < 7 && k < 7)
        {
            int min = Math.min(ll1.get(i), ll3.get(k));
            if(min == ll1.get(i))
            {
                i++;
            }
            else
            {
                k++;
            }
            ll4.add(min);
        }
        while(i < 7)
        {
            ll4.add(ll1.get(i));
            i++;
        }
        while(j < 7)
        {
            ll4.add(ll2.get(j));
            j++;
        }
        while(k < 7)
        {
            ll4.add(ll3.get(k));
            k++;
        }
        end = System.currentTimeMillis();
        
        System.out.println("Without priority queue: ");
        System.out.println("Sorted Queue: " + ll4);
        System.out.println("Time: " + (end - start));
        
        llc.addAll(ll1);
        llc.addAll(ll2);
        llc.addAll(ll3);
        
        System.out.println("Using Priority Queue: ");
        System.out.print("Sorted Queue: ");

        System.out.print("[");
        start = System.currentTimeMillis();
        for(int x = 0; x < 20; x++)
        {
            System.out.print(llc.remove() + ", ");
        }
        System.out.println(llc.remove() + "]");
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start));
        
    }
}
