import java.util.*;

public class set
{
    public static void main(String[] args) 
    {
        Set<Integer> st = new TreeSet<>();

        for(int i = 0; i < 10; i++)
        {
            st.add(i);
        }
        System.out.println(st);

        for(int i = 0; i < 10; i++)
        {
            System.out.println(st.remove(i));
        }

        System.out.println(st);
    }
}