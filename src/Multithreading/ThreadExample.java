package Multithreading;

class dddMain1
{
    public static void main(String[] args)
    {
        for(int i=1;i<=10;i++) {
            ThreadExample tx = new ThreadExample(i);
            Thread th=new Thread(tx);
            th.start();
        }
    }
}
class ThreadExample implements Runnable
{
    int i;
    ThreadExample(int i)
    {
        this.i=i;

    }
    @Override
    public void run()
    {
        System.out.println("Number:"+i+"  Thread:"+Thread.currentThread().getName());
    }
}
