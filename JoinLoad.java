package MultiThreading;
import java.util.*;
public class JoinLoad {
  public static void main(String[] args) throws InterruptedException{
    
    System.out.print("Loadding..");

    Thread t1 = new Thread( ()->{

      try {

      Thread.sleep(1000);
      System.out.print(".");
      Thread.sleep(500);
      System.out.print("..");
      Thread.sleep(200);
      System.out.println("..");

        
      } catch (Exception e) {
        

      }

    });

    t1.start();
    t1.join(10000);
    System.out.println("App get Started !");
  }
}
