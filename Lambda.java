package MultiThreading;
import java.util.*;
public class Lambda {
  
  public static void main(String[] args) {
    
    Runnable task =() ->{
      for(int i=0;i<4;i++)
      {
        System.out.println(" "+ i);
      }
    };

    //create a thread
    Thread t = new Thread(task);
    
      t.start();
    

  }
}
