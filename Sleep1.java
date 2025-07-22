package MultiThreading;
import java.util.*;
public class Sleep1 {
  public static void main(String[] args) {
    
    Thread th = Thread.currentThread();
    
    Runnable task = ()->{
      for(int i=0;i<6;i++)
      {
        System.out.println(th.getName()+ i);
      }
    };



    Thread t = Thread.currentThread();
    
    try{

     Thread.sleep(909);
     
    for(int i=0;i<6;i++)
    {
      System.out.println(t.getName()+ i);
    }
  }
  catch(Exception e){

     System.out.println(e);

  }
    

    Thread t1 = new Thread(task);

    try{
      t1.sleep(909);

    t1.start();
    }
    catch (Exception e)
    {
      System.out.println(e);
    }



  }
}
