package MultiThreading;
import java.util.*;
public class Multiple {
  public static void main(String[] args) {
    
// NOW CREATE TWO OBJECT :
  Mythread1 m1 = new Mythread1();  // thread1   ka m1 obj
  m1.run();
  
  Mythread2 m2 = new Mythread2();  // thread2 

  m2.run();

  Mythread1 mt = new Mythread1();  // thread1 ka mt obj
  mt.run();



 // Mythread1 mt1 = new Mythread2();

  }
}

class Mythread1 extends Thread{
   
  public void run()
  {
    System.out.println("Thread1 is getting start ! ");
  }
}

class Mythread2 extends Thread{

  public void run()
  {
    System.out.println("Thread2 is getting start !");
    for(int i=0;i<10;i++)
    {
      System.out.println(i);
    }
  }
}