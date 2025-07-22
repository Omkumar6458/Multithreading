package MultiThreading;
import java.util.*;
public class Anonymous {
  public static void main(String[] args) {
    
 
    Runnable task = new Runnable(){
      public void run()
      {
        for(int i=0;i<8;i++)
        System.out.println(i);
      }
    };

    Thread t1 = new Thread(task);

    t1.run();   // normal execution , not create a new thread 
    t1.start();
   // t1.task();

  }
}
