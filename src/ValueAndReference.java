public class ValueAndReference
{
    public static void main(String[] args)
    {
        int x=10;
        int y=10;
        PassByValue pv=new PassByValue(x,y);
        System.out.println(x+" "+ y);
        PassByReference pr=new PassByReference(x,y);
        PassByReference pr1=new PassByReference(pr);
        System.out.println(pr.x+" "+pr.y);
    }
}
 class PassByValue
{
    int x,y;
    PassByValue(int x,int y)
    {
        x=x+10;
         y=y+10;
    }
}
 class PassByReference
{
    int x,y;
    PassByReference(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    PassByReference(PassByReference pr)
    {
        pr.x= pr.x+1;
    }
}
