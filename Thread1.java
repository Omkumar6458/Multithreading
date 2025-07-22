package MultiThreading;
import java.util.*;
public class Thread1 {
  public static void main(String[] args) {
    
    Mythread m = new Mythread();
    m.start();
  }
}

//CREATE CLASS SO THAT YOU CAN RUN AND START :

class Mythread extends Thread{  // HERE WE EXTENDS THREAD : 

  public void run()
  {
    System.out.println("NOW IT OVERRIDDEN WITH RUN() : INSIDE THREAD ");
  }
}


/*
 INSIDE THREAD :

    PUBLIC VOID START()
    {
    ----------------------------
    ---------------------------
    ---------------------------
    ---------------------------
    ---------------------------
    ---------------------------
    ---------------------------
     RUN();

    }

    PUBLIC VOID RUN()
    {
    
    ---> THIS IS EMPTY  AND THIS ONE IS OVERRIDEN IN MAIN: 
    
    }

 * 
 *
 * 
 * 
 * 
 * 
 * 
 */