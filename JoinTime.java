package MultiThreading;
import java.util.*;
public class JoinTime {
  public static void main(String[] args) throws InterruptedException {
    
    Thread t1 = new Thread( ()->
    {
      try {

        Thread.sleep(240);
        for(int i=0;i<5;i++)
        {
          System.out.println("thread "+ i);
        }
      

      } catch (Exception e) {
        System.out.println(e);
      }
     
    });

          t1.start();
        t1.join(899);

        System.out.println("total time takes ");

  }
}
