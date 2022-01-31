import java.util.ArrayDeque;

public class array_deque 
{
    public static void main(String[] args) 
    {
        ArrayDeque<Integer> adeque = new ArrayDeque<>();
        System.out.println("ArrayDeque from Front: ");
        for(int i = 0; i < 10; i++)
        {
            adeque.offerFirst(i);
        }
        System.out.println(adeque);
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Peek: " + adeque.getFirst());
            System.out.println("Remove: " + adeque.removeFirst());
        }
        System.out.println("ArrayDeque from Last: ");
        for(int i = 0; i < 10; i++)
        {
            adeque.offerLast(i);
        }
        System.out.println(adeque);
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Peek: " + adeque.getLast());
            System.out.println("Remove: " + adeque.removeLast());
        }
    }
}