import java.util.*;

public class stack
{
    public static void main(String[] args) 
    {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < 10; i++)
        {
            st.push(i);
        }
        System.out.println(st);
        if(st.empty())
        {
            System.out.println("Empty");
        }
        else
        {
            System.out.println("Not Empty");
        }
        for(int i = 0; i < 10; i++)
        {
            System.out.println("peek: " + st.peek());
            System.out.println("pop: " + st.pop());
        }
    }
}