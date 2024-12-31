package Stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class EvaluateExpression
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();

        int len=sc.nextInt();
        sc.nextLine();  //consume the leftover newline

        for(int i=0;i<len;i++)
        {
            str.add(sc.nextLine());
        }

        System.out.println(evalRPN(str));
    }

    public static int evalRPN(ArrayList<String> A)
    {
        Stack<Integer> stack=new Stack<>();
        int a,b,c,ans=0;

        for(String s:A)
        {
            if(s.equals("+"))
            {
                a=stack.pop();
                b=stack.pop();
                c=a+b;
                stack.push(c);
            }

           else if(s.equals("*"))
            {
                a=stack.pop();
                b=stack.pop();
                c=a*b;
                stack.push(c);
            }

           else if(s.equals("-"))
            {
                a=stack.pop();
                b=stack.pop();
                c=b-a;
                stack.push(c);
            }

           else if(s.equals("/"))
            {
                a=stack.pop();
                b=stack.pop();
                c=b/a;
                stack.push(c);
            }

            else if(s.equals("%"))
            {
                a=stack.pop();
                b=stack.pop();
                c=a%b;
                stack.push(c);
            }
            else
                stack.push(Integer.parseInt(s));
        }
        return stack.peek();
    }
}
