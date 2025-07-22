package MultiThreading;
import java.util.*;
public class Runnable1 {
  public static void main(String[] args) {
  

    MyThread my = new MyThread();

    my.run();  // HERE WE NOT APPLY MULTITHREADING : JUST SIMPLE CALL BY MAIN THREAD : 
    
    Thread th = new Thread(my);  // here we pass interace child object as , we can't make interface object : 
    
    th.start();  // here it invoked my obj ka run method()
 
 // THIS (MY) ACT AS RUNNABLE KA OBJECT :  



  }
}





class MyThread implements Runnable  // implements Runnable interface 
{

  public  void run()
  {
    for(int i=0;i<5;i++)
    {
      System.out.println("values"+ i);
    }
  }
}
