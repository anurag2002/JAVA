//Program to check if both the strings are anagram or not

import java.util.Scanner;
public class anagrams 
{
    public static void main(String args[])
    {
        int l1,l2,i,j,c1=0,c2=0,r1=0,r2=0,f=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the Second string: ");
        String s2 = sc.nextLine();
        l1 = s1.length();
        l2 = s2.length();
        if(l1 == l2)
        {
            for(i = 0; i<l1; i++)
            {
                String s = String.valueOf(s1.charAt(i));
                if(s2.contains(s))
                {
                    c1++;
                }
                String t = String.valueOf(s2.charAt(i));
                if(s1.contains(t))
                {
                    c2++;
                }

            }
            if(c1 == c2 && c1 == l1)
            {
                for(i = 0; i<l1; i++)
                {
                    for(j=0; j<l1; j++)
                    {
                        if(s1.charAt(i)==s1.charAt(j))
                        {
                            r1++;
                        }
                        if(s1.charAt(i)==s2.charAt(j))
                        {
                            r2++;
                        }
                    }
                    if(r1 != r2)
                    {
                        f++;
                    }
                    r1 = 0;
                    r2 = 0;
                }
                if(f == 0)
                {
                    System.out.println(s1 + " and " + s2 + " are anagrams.");
                }
                else
                {
                    System.out.println(s1 + " and " + s2 + " are not anagrams.");
                }
            }
            else
            {
                System.out.println("All characters don't match in both strings.");
            }
        }
        else
        {
            System.out.println("Length of both string is not same.");
        }
    }
}