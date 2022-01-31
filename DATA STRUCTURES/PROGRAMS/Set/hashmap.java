import java.util.*;

public class hashmap 
{
    public static void main(String[] args) 
    {
        Map<String,Integer> mp = new HashMap<>();
        mp.put("Apple", 5);
        mp.put("Banana", 6);
        mp.put("Map", 3);
        mp.put("Code", 4);
        mp.put("Morning", 7);
        mp.putIfAbsent("Morning", 7);
        mp.putIfAbsent("Eighteen", 8);
        mp.replace("Map", 2);
        System.out.println("Map: " + mp);
        mp.replace("Map", 4, 3);
        System.out.println("Map: " + mp);
        mp.replace("Map", 2, 3);
        System.out.println("Map: " + mp);
        System.out.println(mp.get("Apple"));
    }
}