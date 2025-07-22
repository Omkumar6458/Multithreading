package MultiThreading;
import java.util.*;
public class JoinTwo {
  public static void main(String[] args) throws InterruptedException {
    
 
    System.out.println("Main is call first  unaffected by join");

    Thread t1 = new Thread(  () ->{

      for(int i=0;i<5;i++)
      {
        System.out.println(Thread.currentThread().getName() +" -> "+ i);
      }
    } );



    Thread t2 = new Thread( () ->{

      for(int i =0;i<5;i++)
      {
        System.out.println(Thread.currentThread().getName() + " -> " + i);
      }

    });
   

    t1.start();
    t1.join();

    t2.start();

  }
}
