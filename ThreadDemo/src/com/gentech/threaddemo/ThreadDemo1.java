package com.gentech.threaddemo;
class MyClass implements Runnable
{
    public void run(){
        System.out.println("It is an entry point for Threads!!!!");
    }
}
public class ThreadDemo1 {
    public static void main(String[] args) {
        MyClass obj=new MyClass();

        Thread t1=new Thread(obj);
        t1.setName("alpha");
        t1.start();
    }
}
