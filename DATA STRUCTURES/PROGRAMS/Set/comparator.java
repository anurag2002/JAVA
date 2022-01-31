import java.util.*;

class Student
{
    int age, rollNo;
    String Name;
    
    public Student(String Name_inp, int rollNo_inp, int age_inp)
    {
        this.Name = Name_inp;
        this.rollNo = rollNo_inp;
        this.age = age_inp;
    }
}

class AgeComparator implements Comparator<Student>
{
    public int compare(Student st1, Student st2)
    {
        if(st1.age == st2.age)
        {
            return 0;
        }
        else if(st1.age > st2.age)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}

class NameComparator implements Comparator<Student>
{
    public int compare(Student st1, Student st2)
    {
        return st1.Name.compareTo(st2.Name);
    }
}
public class comparator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        List<Student> stdList = new ArrayList<Student>();
        System.out.print("Enter the total number of students: ");
        int size = sc.nextInt();

        for(int i = 0; i < size; i++)
        {
            System.out.print("Name of Student" + (i+1) + ": ");
            String Name = sc.next();
            System.out.print("Roll No of Student" + (i+1) + ": ");
            int rollNo = sc.nextInt();
            System.out.print("Age of Student" + (i+1) + ": ");
            int age = sc.nextInt();
            stdList.add(new Student(Name, rollNo, age));
        }

        System.out.println("\nBefore sorting:\n");
        for(Student st : stdList)
        {
            System.out.println("Name: " + st.Name + " \nRoll No: " + st.rollNo + " \nAge: " + st.age);
        }

        Collections.sort(stdList, new AgeComparator());

        System.out.println("\nAfter sorting Using Age:\n");
        for(Student st : stdList)
        {
            System.out.println("Name: " + st.Name + " \nRoll No: " + st.rollNo + " \nAge: " + st.age);
        }

        Collections.sort(stdList, new NameComparator());

        System.out.println("\nAfter sorting Using Name:\n");
        for(Student st : stdList)
        {
            System.out.println("Name: " + st.Name + " \nRoll No: " + st.rollNo + " \nAge: " + st.age);
        }

        sc.close();
    }
}
