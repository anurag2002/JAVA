import linkedlist_package.linkedlist;

public class linkedlist_self 
{
    public static void main(String[] args) 
    {
        linkedlist<Integer> ll1 = new linkedlist<>();
        ll1.add(1);
        ll1.add(2);
        ll1.add(5);
        ll1.add(0,4);
        // ll1.set(1,5);
        ll1.add(5);
        ll1.set(1,6);
        ll1.contains(10);
        ll1.displayLL();
        System.out.println();
        ll1.get(2);
        ll1.removeAll(5);
        ll1.displayLL();
        System.out.println();
        ll1.size();
    }
}