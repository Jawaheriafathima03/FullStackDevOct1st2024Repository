package com.gentech.threaddemo;
class MyClass2 implements Runnable
{
    @Override
    public void run() {
        showEvenNumbers();
    }

    void showEvenNumbers()
    {
           System.out.println("Display Even Numbers!!");
           try
           {
               for(int i=20;i<=40;i++)
               {
                   Thread.sleep(1000);
                   if(i%2==0)
                   {
                       System.out.println(Thread.currentThread().getName()+" Displays Even Number :"+i);
                   }
               }
           }catch(Exception e)
           {
               e.printStackTrace();
           }
    }
}
public class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable obj=new MyClass2();

        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        t1.setName("alpha");
        t2.setName("Omega");

        t1.start();
        t2.start();
    }
}
