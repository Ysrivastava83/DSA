package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Main2
{
    public static void main(String[] args)
    {
        ExecutorService es1= Executors.newCachedThreadPool();
        ExecutorService es2=Executors.newFixedThreadPool(5);
        Lock lock=new ReentrantLock();

        lock.lock();
        for(int i=1;i<10;i++)
        {

            ExxecutorExxxample ex = new ExxecutorExxxample(i);
            es1.execute(ex);

        }
        lock.unlock();


        for(int i=11;i<20;i++)
        {

            ExxecutorExxxample ex = new ExxecutorExxxample(i);
            es2.execute(ex);

        }
    }
}
public class ExxecutorExxxample implements Runnable
{
     int i;

    ExxecutorExxxample(int i){
        this.i=i;
    }
    @Override
    public void run()
    {
        System.out.println("Number:"+i+" Thread:"+Thread.currentThread().getName());
    }
}
