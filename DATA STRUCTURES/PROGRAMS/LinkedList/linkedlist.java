import java.util.*;

public class linkedlist 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> linkedlist1 = new LinkedList<>();
        System.out.print("Enter the size of LinkedList: ");
        int size = sc.nextInt();
        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter the element in LinkedList: ");
            linkedlist1.add(sc.nextInt());
        }
        System.out.println("LinkedList: " + linkedlist1);
        sc.close();
    }
}