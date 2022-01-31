import class_creation.*;
import java.util.*;
public class class_creation2 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        System.out.println("Printing using class function: ");
        
        class_creation create = new class_creation();
        create.print(name, age);
        System.out.println("Printing without using class function: ");
        System.out.println("Name is:"+name);
        System.out.println("Age is:"+age);
        sc.close();
    }
}