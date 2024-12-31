package Stack;

import java.util.Scanner;
import java.util.Stack;

public class DoubleCharTrouble
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(solve(str));
    }
    public static String solve(String A)
    {
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<A.length();i++)
        {
            if (!stack.isEmpty())
            {
                if (stack.peek() != A.charAt(i))
                    stack.push(A.charAt(i));
                else
                    stack.pop();
            }
            else
                stack.push(A.charAt(i));

           // System.out.println(stack);
        }
        StringBuffer sb=new StringBuffer();
        for(Character c:stack)
        {
            sb.append(c);
        }
        String str=sb.toString();
        return str;
    }
}
