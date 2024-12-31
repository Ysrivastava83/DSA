package Stack;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class NearestSmallerNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < l; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println(solve(arr));
    }
        public static ArrayList<Integer> solve(ArrayList<Integer> arr)
        {
            ArrayList<Integer> ans=new ArrayList<>();
            Stack<Integer> stack=new Stack<>();

              for(int i=0;i<arr.size();i++)
              {
                  if (stack.isEmpty())
                  {
                      ans.add(-1);
                      stack.push(arr.get(i));
                  }
                  else
                  {
                      if (arr.get(i)>stack.peek())
                      {
                          ans.add(stack.peek());
                          stack.push(arr.get(i));
                      }
                      else
                      {
                          while(!stack.isEmpty() && arr.get(i)<=stack.peek())
                          {
                              stack.pop();
                          }
                          if(stack.isEmpty())
                          {
                              ans.add(-1);
                              stack.push(arr.get(i));
                          }
                          else
                          {
                              ans.add(stack.peek());
                              stack.push(arr.get(i));
                          }
                      }

                  }
              }


            return ans;
        }
}
