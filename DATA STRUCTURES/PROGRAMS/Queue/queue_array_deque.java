import java.util.ArrayDeque;

public class queue_array_deque 
{
    public static void main(String[] args) 
    {
        ArrayDeque<Integer> que = new ArrayDeque<>();
        for(int i = 0; i < 10; i++)
        {
            que.addLast(i);
        }
        System.out.println(que);
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Peek: " + que.getFirst());
            System.out.println("Pop: " + que.removeFirst());
        }
    }
}
