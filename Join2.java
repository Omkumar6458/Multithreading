package MultiThreading;
import java.util.*;
public class Join2 {
  public static void main(String[] args) throws InterruptedException {
    
    Runnable task = new Runnable() {
      public void run()
      {
        for(int i=0;i<6;i++)
        {
          System.out.println("task "+ i);
        }
        
      }
    };


    Thread t = new Thread(task);
    t.start();
    t.join();


    for(int i=0;i<7;i++)
    {
      System.out.println("main "+ i);
    }
  }
}
