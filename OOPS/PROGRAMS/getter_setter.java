import java.util.Scanner;

class get_set
{
    private String name;
    public String nameFunc()
    {
        return name;
    }
    public void nameAllot(String n)
    {
        this.name = n;
    }
}
public class getter_setter 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        sc.close();
        get_set gs = new get_set();
        gs.nameAllot(name);
        System.out.println("Name: " + gs.nameFunc());
    }
}