import queue_package.queue;
public class queue_self 
{
    public static void main(String[] args) 
    {
        queue<Integer> que = new queue<>();
        for(int i = 0; i < 10; i++)
        {
            que.offer(i);
        }
        que.print();
        for(int i = 0; i < 10; i++)
        {
            que.peek();
            que.poll();
        }
        que.print();
    }
}
