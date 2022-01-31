import java.util.*;

public class arraylist
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> ArrayList1 = new ArrayList<>();
        System.out.print("Enter the size of ArrayList: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in ArrayList: ");
        for(int i = 0; i < n; i++)
        {
            int x = sc.nextInt();
            ArrayList1.add(x);
        }
        System.out.println("ArrayList: " + ArrayList1);
        ArrayList1.set(sc.nextInt(), sc.nextInt());
        System.out.println("ArrayList: " + ArrayList1);
        sc.close();
    }
}