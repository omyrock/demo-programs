package com.example.demo.service.MultiThreading;

public class PrintingElements {
    public static void main(String[] args) {
        Example odd= new Example(1);
        Example even = new Example(0);
        Thread oddNum= new Thread(odd,"odd");
        Thread evenNum= new Thread(even,"even");
        oddNum.start();
        evenNum.start();

    }
}
class Example implements Runnable{
    int remainder;
    static Object lock= new Object();
    Example(int remainder){
        this.remainder=remainder;
    }
     static int count=0;
    public void printing(){
        synchronized (Example.class) {
            System.out.println(Thread.currentThread().getName() + " " + count++);
        }
    }

    @Override
    public void run() {
        for(int i=0 ; i<10; i++){
            synchronized (lock) {
                while (count % 2!= remainder) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                printing();
                lock.notify();
            }
        }

    }
}