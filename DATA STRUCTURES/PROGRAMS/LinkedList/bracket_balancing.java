import java.util.*;

public class bracket_balancing 
{
    public static void main(String[] args) 
    {
        Stack<Character> stk = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the bracket series: ");
        String series = sc.nextLine();
        int count = 0;
        for(int i = 0; i < series.length(); i++)
        {
            if(series.charAt(i) == '(' || series.charAt(i) == '{' || series.charAt(i) == '[')
            {
                stk.push(series.charAt(i));
            }
            else if(series.charAt(i) == ')' && stk.peek() == '(')
            {
                stk.pop();
                count++;
            }
            else if(series.charAt(i) == '}' && stk.peek() == '{')
            {
                stk.pop();
                count++;
            }
            else if(series.charAt(i) == ']' && stk.peek() == '[')
            {
                stk.pop();
                count++;
            }
        }
        if(count == (series.length()/2) && stk.empty())
        {
            System.out.println("All brackets are balanced");
        }
        else if(count == (series.length()/2) && !stk.empty())
        {
            System.out.println("All brackets are not balanced");
        }
        else
        {
            System.out.println("All brackets are not balanced");
        }
        sc.close();
    }
}
