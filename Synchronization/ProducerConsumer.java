import java.util.*;

public class ProducerConsumer {
  public static void main(String[] args) {
    

    sharedDATA s = new sharedDATA();
    Producer p = new Producer(s);
    Consumer c = new Consumer(s);

    p.start();  // any thread get alloted first 
    c.start();

  }
}

/*
 *    CREATE THREE CLASS : 1. CLASS PRODUCER 
 *                         2. CLASS CONSUMER
 *                         3. CLASS SHARED CLASS
 */


  class sharedDATA{
   private int data;

   private  boolean writable = true; // Here create a semaphore variale 


   // ek hi object se consume and produce method ko call krna hai : so that synchronized get achevied :
   public synchronized  void produce(int x) throws InterruptedException
   {
    while(!writable )
    {
      wait();
    }
          data = x;
          writable = false;
          System.out.println("producer value " + data);
          notify();
   }
  
   public synchronized int consume()throws InterruptedException{
   {
    while(writable)
    {
      wait();
    }
    writable = true;
    notify();
    return data;
   }
  }
}






     
  








 class Producer extends Thread{

  sharedDATA share;

  Producer(sharedDATA share)
  {
    this.share = share;
  }

  // use overriden : run

  public void run()
  {
    try {
      
      for(int i=0;i<10;i++)
      {
        share.produce(i);
        Thread.sleep(500);
      }
      
    } catch (Exception e) {
      System.out.println(e);
    }
  }

 }




 class Consumer extends Thread{
  sharedDATA share;

  Consumer(sharedDATA share)
  {
    this.share = share;
  }

  public void run()
  {
    try {
       
      for(int i=0;i<10;i++)
      {
      System.out.println( "consumend value :"+share.consume());
           Thread.sleep(1000);
      }
      
    } catch (Exception e) {
       System.out.println(e);
    }
  }

 }



