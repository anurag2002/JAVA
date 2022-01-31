import java.util.*;

public class priority_queue 
{
    public static void main(String[] args) 
    {
        PriorityQueue<Integer> pque = new PriorityQueue<Integer>(Collections.reverseOrder());
        pque.add(100);
        pque.add(10);
        pque.add(30);
        pque.add(50);
        pque.add(20);
        System.out.println(pque);
        System.out.println(pque.remove());
        System.out.println(pque.remove());
        System.out.println(pque.remove());
        System.out.println(pque.remove());
        System.out.println(pque.remove());
        System.out.println(pque);
    }
}