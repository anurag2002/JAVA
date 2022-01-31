import java.util.*; 
import java.lang.Math;

public class merge_interval 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        List <Integer> intervals = new ArrayList<>();
        ArrayList <ArrayList <Integer> > mainInterval = new ArrayList<ArrayList<Integer>>();
        System.out.print("Enter total intervals: ");
        int totalIntervals = sc.nextInt();
        for(int i = 0; i < totalIntervals; i++)
        {
            System.out.print("Enter the interval: ");
            mainInterval.add(new ArrayList<Integer>(Arrays.asList(sc.nextInt(),sc.nextInt())));
        }
        System.out.println("Main Interval: " + mainInterval);
        System.out.print("Enter the interval to be inserted: ");
        intervals.add(sc.nextInt());
        intervals.add(sc.nextInt());
        System.out.println("Interval to inserted: " + intervals);
        sc.close();
        int i = 0, j=0, t, x = 0;
        while(i < totalIntervals)
        {
            t = i;
            for(int k = mainInterval.get(i).get(0); k <= mainInterval.get(i).get(1); k++)
            {
                if(k == intervals.get(0) || k == intervals.get(1))
                {
                    if(intervals.get(1) <= mainInterval.get(i).get(1))
                    {
                        mainInterval.get(j).set(1, Math.max(mainInterval.get(i).get(1), intervals.get(1)));
                        i = totalIntervals;
                        break;
                    }
                    else if(x == 0)
                    {
                        mainInterval.get(i).set(0, Math.min(mainInterval.get(i).get(0), intervals.get(0)));
                        j = i;
                        x = 1;
                        i++;
                        break;
                    }
                }
                else if(mainInterval.get(i).get(0) > intervals.get(0) && mainInterval.get(i).get(1) < intervals.get(1))
                {
                    mainInterval.remove(i);
                    t = 0;
                    break;
                }
                else if(mainInterval.get(i).get(0) > intervals.get(0) && mainInterval.get(i).get(1) > intervals.get(1))
                {
                    if(mainInterval.get(i).get(0) > intervals.get(1))
                    {
                        mainInterval.get(j).set(1, Math.min(mainInterval.get(i).get(1), intervals.get(1)));
                    }
                    else
                    {
                        mainInterval.get(j).set(1, Math.max(mainInterval.get(i).get(1), intervals.get(1)));
                        mainInterval.remove(i);
                    }
                    i = totalIntervals;
                    break;
                }
            }
            if(t == i)
            {
                i++;
            }
        }
        System.out.println("Final List: " + mainInterval);
        sc.close();
    }
}