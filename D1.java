package MultiThreading;
import java.util.*;
public class D1 implements Runnable{
  public static void main(String[] args) {
    D1 d = new D1();
    Thread check = new Thread(d);
    check.setDaemon(true); // after this we don't recieve any output, as you want to printdemon , at least one thread should be in this.
    check.start();

    System.out.println("check user ");// if i remove it demon will not print :
  }

  public void run()
  {
    System.out.println("checker running ! ");
  }

}


/*
 * 
 * 
JVM MANAGE TWO PRIMARY THREAD , 1 DEMON AND NON DEMON ,

JVM WAIT FOR ALL USER THREAD TO GET TERMINATED WHILE DEAMON NOT 


CASH MEMORY :  HANDLE DEMON (IT CAN TERMINATE AT MIDDLE )

CAN'T MODIFY THE USER THRER AFTER GET START 


 */