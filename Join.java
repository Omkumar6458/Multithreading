package MultiThreading;
import java.util.*;
public class Join {
  public static void main(String[] args) {
   joing j = new joing();
   j.start();
    

   for(int i=0;i<6;i++)
   {
    System.out.println("main "+ i);
   }
}
}


class joing extends Thread
{
  public void run()
  {
    try {
      

      for(int i=0;i<5;i++)
      {
       // Thread.sleep(679);
        System.out.println("thread "+ i);
      }

    } catch (Exception e) {
    System.out.println(e);
    }
  }
}




/*
 * 
 * 
 * THIS IS WITHOUT JION APPLY HERE ALL ARE PRINT RANDOM ONE BY ONE 
 */