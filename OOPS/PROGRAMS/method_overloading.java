import java.util.*;

class overloading
{
    int a,b,c;
    public void multiple(int... integers)
    {
        for(int i : integers)
        {
            System.out.println(i);
        }
    }
    public int overloading(int x, int y, int z) 
    {
        this.a = x;
        this.b = y;
        this.c = z;    
        return a+b+c;
    }
    public int overloading(int x, int y) 
    {
        this.a = x;
        this.b = y;    
        return a+b;
    }
}
public class method_overloading 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        overloading ol = new overloading();
        System.out.println("Multiple parameter:");
        ol.multiple(1,2,3,5);
        ol.multiple(1,2,3,34,5);
        System.out.println("Using 2 variables: ");
        System.out.println(ol.overloading(a,b));
        System.out.println(ol.overloading(b,c));
        System.out.println(ol.overloading(c,a));
        System.out.println("Using 3 variables: ");
        System.out.println(ol.overloading(a,b,c));
    }
}