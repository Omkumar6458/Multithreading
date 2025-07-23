package MultiThreading.Synchronization;
import java.util.*;

public class Ticket {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
/* 
    System.out.println("enter available book ");

     int AvailableT = scn.nextInt();
  scn.nextLine();
    Counter c = new Counter();  // create a object of class 


    System.out.println("enter how many book ");
    int n = scn.nextInt();
   scn.nextLine();
   
    for(int i=0;i<n;i++){
 
    System.out.println("enter name of people ");
    String s = scn.nextLine();
      
     

    Thread th = new Thread( () ->{ 
      c.bookTicket(s, AvailableT);   // call method of class by object 
    });

      th.start();

      try {
        th.join();
      } catch (Exception e) {
        System.out.println(e);
      }
  }

      */

   
      Counter c = new Counter();

      int AvailableT=2;
      
      Thread t1 = new Thread( ()->{
       c.bookTicket("user1", 0);
      });


      Thread t2 = new Thread( ()->{
       c.bookTicket("user2", AvailableT);
      });


  Thread t3 = new Thread( ()->{
    c.bookTicket("user3", AvailableT);
  });



t1.start();
t2.start();
t3.start();



  }
  }



class Counter extends Ticket{


 synchronized public void  bookTicket(String name, int AvailableT)
  {
    if(AvailableT >0)
    {
      System.out.println(name + "is purchsed ");
      AvailableT--;
    }
    else{
      System.out.println("not available ");
    }

  }

}
