package DataStructures;

public class StringBufferExample
{
    public static void main(String[] args)
    {
        String str="Hello";
        String ans="";
        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse().toString());

        for(int i=0;i<str.length();i++)
        {
            ans=str.charAt(i)+ans;
        }
        System.out.println(ans);
    }
}
