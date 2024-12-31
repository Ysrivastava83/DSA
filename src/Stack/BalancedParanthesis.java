package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println(solve(str));
    }
    public static int solve(String str)
    {
        Stack<Character>  stack=new Stack<>();

        for(int i=0;i<str.length();i++)
        {
            System.out.println(stack);
            if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='[')
            stack.push(str.charAt(i));

            else if(str.charAt(i)==')')
            {
                if(!stack.isEmpty()) {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else
                        return 0;
                }
                else return 0;
            }
            else if(str.charAt(i)=='}' )
            {
                if(!stack.isEmpty()) {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else
                        return 0;
                }
                else
                    return 0;
            }

            else if(str.charAt(i)==']')
            {
                if(!stack.isEmpty()) {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else
                        return 0;
                }
                else
                    return 0;
            }

        }
        if(stack.isEmpty())
            return 1;
        return 0;
    }
}
