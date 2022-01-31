import linkedlist_package.doubly_linkedlist;
public class doubly_linkedlist_self 
{
    public static void main(String[] args) 
    {
        doubly_linkedlist<Integer> dll = new doubly_linkedlist<>();
        dll.add(1);
        dll.add(2);
        dll.add(3);
        dll.add(0,4);
        dll.display();
        dll.get(2);
        dll.set(3,5);
        dll.display();
    }
}