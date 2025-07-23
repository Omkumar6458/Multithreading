package MultiThreading.Synchronization;
import java.util.*;
public class S1 {
  public static void main(String[] args) {
  
    Thread th = new Thread( () ->{

      for(int i=0;i<7;i++)
      {
        System.out.println(i);
      }
    });

    th.start();
  
   Test t1 = new Test();
   t1.start();

}
}


class Test extends Thread{


synchronized public void run()
  {
    System.out.println(" it get running under ");
  }

}




