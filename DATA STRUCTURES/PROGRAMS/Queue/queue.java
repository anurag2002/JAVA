import java.util.*;
public class queue 
{
    public static void main(String[] args) 
    {
        Queue<Integer> que = new LinkedList<>();
        for(int i = 0; i < 10; i++)
        {
            que.add(i);
        }
        System.out.println("Queue: " + que);
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Peek: " + que.element());
            System.out.println("Remove: " + que.remove());
        }
    }
}
