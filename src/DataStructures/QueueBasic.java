package DataStructures;

import javax.management.Query;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueBasic
{
    public static void main(String[] args)
    {
        List<Integer> list= Arrays.asList(4,5,6,1,2,3,8,7,2,1,4,1);
        Queue<Integer> queue=new LinkedList<>();

        for(int i:list)
        {
            queue.add(i);
            System.out.println(queue);
            if(queue.peek()%2==0) {
                queue.remove(i);
            }
        }
    }
}
