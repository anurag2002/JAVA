public class table_till_20 
{
    public static void main(String args[])
    {
        int i,j;
        for (i = 1; i <= 10; i++)
        {
            for(j = 1; j <= 20; j++)
            {
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
}