import java.util.Scanner;

class  parent
{
    String name;
    Scanner sc = new Scanner(System.in);
    public void input()
    {
        System.out.print("Enter the name: ");
        this.name = sc.nextLine();
    }
}
class child extends parent
{
    public void print()
    {
        System.out.println("Name: " + name);
    }
}
public class inheritance 
{
    public static void main(String args[])
    {
        child c = new child();
        c.input();
        c.print();
    }
}