package DataStructures;

import java.util.Stack;

public class StackBasic
{
    public static void main(String[] args)
    {
        int[] arr={1,2,4,5,4};
        Stack<Integer> stack=new Stack<>();
        for(int i:arr)
        {
            stack.push(i);
        }
        for(int i:arr)
        {
            System.out.println(stack.pop());
            System.out.println(stack);
        }
    }
}
