package Stack;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Stream;

public class PassingGame
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        ArrayList<Integer> c=new ArrayList<>();

        for(int i=0;i<a;i++)
        {
            c.add(sc.nextInt());
        }
        System.out.println(solve(a,b,c));
    }

    public static int solve(int A, int B, ArrayList<Integer> C)
    {
        Stack<Integer> stack=new Stack<>();
        if(A==0)
            return B;

        for (int i=0;i<A;i++)
        {
            if(C.get(i)!=0)
                stack.push(C.get(i));
            else
                stack.pop();

            System.out.println(stack);
        }

        if(stack.isEmpty()==true)
            return B;
        return stack.peek();
    }
}
