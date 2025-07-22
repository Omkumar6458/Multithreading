package MultiThreading;
import java.util.*;
public class Join1 {
  public static void main(String[] args) throws InterruptedException{
  
  J j1 = new J();

  j1.start();
  j1.join();


   for(int i=0;i<6;i++)
    {
      System.out.println("main ::" + i);
    }


    
  }
}


class J extends Thread{
  public void run()
  {
    for(int i=0;i<6;i++)
    {
      System.out.println("run ::" + i);
    }
  }
}