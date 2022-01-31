import java.util.*;

public class stack_array_deque 
{
    public static void main(String[] args) 
    {
        ArrayDeque<Integer> stk1 = new ArrayDeque<>();
        ArrayDeque<Integer> stk2 = new ArrayDeque<>();
        System.out.println("Pushing in stack");
        for(int i = 0; i < 10; i++)
        {
            stk1.addLast(i);
            stk2.push(i);
        }
        System.out.println("Using Deque: " + stk1);
        System.out.println("Using Stack: " + stk2);
        System.out.println("Peeking and Poping");
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Peek: " + stk1.getLast());
            System.out.println("Peek: " + stk2.peek());
            System.out.println("Pop: " + stk1.removeLast());
            System.out.println("Pop: " + stk2.pop());
        }
    }
}
