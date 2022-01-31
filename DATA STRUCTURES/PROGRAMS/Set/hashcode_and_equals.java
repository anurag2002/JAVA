class Geek
{
    String name;
    int age;
    Geek(String name1, int age1)
    {
        this.name = name1;
        this.age = age1;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
        {
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass())
        {
            return false;
        }
        Geek geek = (Geek) obj;
        return(geek.name == this.name && geek.age == this.age);
    }

    @Override
    public int hashCode()
    {
        return this.age;
    }

}
public class hashcode_and_equals 
{
    public static void main(String[] args) 
    {
        Geek g1 = new Geek("Anurag", 20);
        Geek g2 = new Geek("Anurag", 20);
        Geek g3 = new Geek("Raushan", 27);
        
        if(g1.hashCode() == g2.hashCode())
        {
            if(g1.equals(g2))
            {
                System.out.println("Objects are equal");
            }
            else
            {
                System.out.println("Objects are not equal");
            }
        }
        else
        {
            System.out.println("Objects are not equal");
        }
        if(g1.hashCode() == g3.hashCode())
        {
            if(g1.equals(g3))
            {
                System.out.println("Objects are equal");
            }
            else
            {
                System.out.println("Objects are not equal");
            }
        }
        else
        {
            System.out.println("Objects are not equal");
        }
    }
}
