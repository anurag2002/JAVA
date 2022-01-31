import queue_package.arraydeque;

public class arraydeque_self 
{
    public static void main(String[] args) 
    {
        arraydeque<Integer> adq = new arraydeque<>();
        for(int i = 0; i < 10; i++)
        {
            adq.addFirst(i);
        }
        adq.removeFirst();
        adq.removeLast();
        adq.getFirst();
        adq.getLast();
        adq.print();
    }
}