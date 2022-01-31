import java.util.*;

public class time_taken_linkedlist_arraylist 
{
    public static void main(String[] args) 
    {
        List<Integer> linkedlist = new LinkedList<>();
        List<Integer> arraylist = new ArrayList<>();
        long start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++)
        {
            linkedlist.add(0, i);
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Time Taken by LinkedList: " + time);
        start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++)
        {
            arraylist.add(0, i);
        }
        end = System.currentTimeMillis();
        time = end - start;
        System.out.println("Time Taken by ArrayList: " + time);
    }
}