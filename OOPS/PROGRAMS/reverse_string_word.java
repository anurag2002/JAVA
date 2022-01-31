import java.util.*;
class reverse
{
    String line, revline="", temp = "";
    int len;
    public void input(String l, int size)
    {
        this.line = l;
        this.len = size;
    }
    public void rev()
    {
        System.out.println("Initial String: " + line);
        for(int i = 0; i < len; i++)
        {
            if(line.charAt(i) == ' ')
            {
                revline = temp + " " + revline;
                temp = "";
            }
            else
            {
                temp = temp + Character.toString(line.charAt(i));
            }
        }
        revline = temp + " " + revline;
        System.out.println("Reversed String: " + revline);
    }
}
public class reverse_string_word 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String line = sc.nextLine();
        reverse re = new reverse();
        int len = line.length();
        re.input(line, len);
        re.rev();
    }
}