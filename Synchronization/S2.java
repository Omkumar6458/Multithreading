package MultiThreading.Synchronization;
import java.util.*;
public class S2 {
  public static void main(String[] args) {
    
    Table table = new Table();

  Thread1 thread1 = new Thread1(table);

  Thread2 thread2 = new Thread2(table);

  thread1.start();
  thread2.start();


  }
}


class Table{  // create a table 
  synchronized void display(int n )  // method is synchronized 
   {
    for(int i=1;i<10;i++)
    System.out.println(n*i);
   }
}


class Thread1 extends Thread{ // inherit thred 
  Table t;

  public Thread1(Table t)
  {
    this.t = t; // Assigns the recieve Table obj to instance variable t.
                 // thread can access same Table object 
  }

  public void run() //here pre define method to override 
  {
    t.display(6);  // it call to define class object method 
  }
}



class Thread2 extends Thread{

  Table t;

  public Thread2(Table t)
  {
  this.t = t;
  }

  public void run()
  {
    t.display(5);
  }

}