import java.util.*;

public class group_anagrams 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        List<String> stringArray = new ArrayList<>();
        List<TreeSet<String>> anagrams = new ArrayList<TreeSet<String>>();
        Set<String> anagram_group = new TreeSet<>();
        System.out.print("Enter the number of strings: ");
        int size = sc.nextInt();
        
        System.out.print("Enter the strings: ");
        for(int i = 0; i < size; i++)
        {
            stringArray.add(sc.next());
        }
        System.out.println("String List: " + stringArray);
        
        int j = 0;
        for(String s1 : stringArray)
        {
            for(String s2 : stringArray)
            {
                if(s1.length() == s2.length()) 
                {
                    int count = 0;
                    for(char c : s1.toCharArray())
                    {
                        if(s2.contains(String.valueOf(c)))
                        {
                            count++;
                        }
                    }
                    if(count == s1.length())
                    {
                        anagram_group.add(s1);
                        anagram_group.add(s2);
                    }
                }
            }
            if(!anagrams.contains(anagram_group))
            {
                anagrams.add(new TreeSet<String>());
                anagrams.get(j).addAll(anagram_group);
                j++;
            }
            anagram_group.clear();
        }
        System.out.println("Group Anagrams: " + anagrams);
        sc.close();
    }
}