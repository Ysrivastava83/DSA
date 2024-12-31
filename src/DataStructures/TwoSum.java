package DataStructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum
{
    public static void main(String[] args)
    {
        int n=10;
        List<Integer> list= Arrays.asList(4,5,6,1,2,3,8,7,2,1,4,1);
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i:list)
        {
            System.out.println(i);

            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else
            map.put(i,1);
        }
        System.out.println(map);

        for(int i:list)
        {
            if(map.containsKey(n-map.get(i))) {
                System.out.println(i + " " + (n - i));
            }
        }
        System.out.println("Exit");
    }
}
