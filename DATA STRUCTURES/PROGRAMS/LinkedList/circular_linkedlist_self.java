import linkedlist_package.circular_linkedlist;
public class circular_linkedlist_self 
{
    public static void main(String[] args) 
    {
        circular_linkedlist<Integer> cll = new circular_linkedlist<>();
        cll.add(1);
        cll.add(2);
        cll.add(3);
        cll.add(4);
        cll.set(4,5);
        cll.display();
        cll.size();
        cll.get(0);
    }
}
