import java.util.Scanner;

abstract class class1
{
    public abstract void input();
    public abstract void print();
}
class class2 extends class1
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
        System.out.println("Age: " + age);
    }
}
class class3 extends class2
{
    Scanner sc = new Scanner(System.in);
    String name;
    int rollNo;
    public void rollInput()
    {
        System.out.print("Enter the Roll No: ");
        this.rollNo = sc.nextInt();
    }
    public void rollPrint()
    {
        System.out.println("Roll No: " + rollNo);
    }
}
public class abstract_class 
{
    public static void main(String[] args)
    {
        class3 c = new class3();
        c.input();
        c.rollInput();
        c.print();
        c.rollPrint();
    }
}