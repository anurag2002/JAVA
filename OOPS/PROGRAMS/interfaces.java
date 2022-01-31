import java.util.Scanner;

abstract interface class1
{
    abstract void input();
}
abstract interface class2
{
    abstract void print();
}
class class3 implements class1, class2
{
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    public void input()
    {
        System.out.print("Enter the name: ");
        this.name = sc.nextLine();
        System.out.print("Enter the age: ");
        this.age = sc.nextInt();
    }
    public void print()
    {
        System.out.println("Name: " + name);
        System.out.println(("Age: " + age));
    }
}
public class interfaces 
{
    public static void main(String args[])
    {
        class3 c = new class3();
        c.input();
        c.print();
    }
}
