package DataStructures;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;

public class HashSetBasic
{
    public static void main(String[] args)
    {


    int[] arr={1,2,4,5,4};
    HashSet<Integer> set=new HashSet<>();

    for(int i=0;i<arr.length;i++)
    {
            set.add(arr[i]);
    }
    System.out.println(set);
}

}