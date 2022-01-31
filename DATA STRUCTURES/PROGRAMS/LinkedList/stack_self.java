import linkedlist_package.stack;
public class stack_self 
{
    public static void main(String[] args) 
    {
        stack<Integer> stk = new stack<>();
        for(int i = 0; i < 10; i++)
        {
            stk.push(i);
        }
        stk.print();
        if(stk.empty())
        {
            System.out.println("Empty Stack");
        }
        else
        {
            System.out.println("Non Empty Stack");
        }
        for(int i = 0; i < 10; i++)
        {
            stk.peek();
            stk.pop();
        }
        if(stk.empty())
        {
            System.out.println("Empty Stack");
        }
        else
        {
            System.out.println("Non Empty Stack");
        }
    }
}
