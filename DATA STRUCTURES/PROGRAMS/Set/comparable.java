import java.util.*;

class Student implements Comparable<Student>
{
    int rollNo, age;
    String Name;
    
    public Student(String Name_inp, int rollNo_inp, int age_inp)
    {
        this.Name = Name_inp;
        this.rollNo = rollNo_inp;
        this.age = age_inp;
    }

    public int compareTo(Student st)
    {
        if(rollNo == st.rollNo)
        {
            return 0;
        }
        else if(rollNo > st.rollNo)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}

public class comparable 
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
            System.out.println("Name: " + st.Name + " Roll No: " + st.rollNo + " Age: " + st.age);
        }

        Collections.sort(stdList);

        System.out.println("\nAfter sorting:\n");
        for(Student st : stdList)
        {
            System.out.println("Name: " + st.Name + " Roll No: " + st.rollNo + " Age: " + st.age);
        }
        sc.close();
    }
}
