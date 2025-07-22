package MultiThreading;
import java.util.*;
public class Main1 {
  public static void main(String[] args) {
    

    //CURRENT THREADS :
    Thread current = Thread.currentThread();

    System.out.println("Current "+ current);  // current thread :

      System.out.println("Thread ID: " + current.getId());
        System.out.println("Thread Priority: " + current.getPriority());
        System.out.println("Thread Group: " + current.getThreadGroup().getName());

      current.setName("om");
      
      System.out.println(current );
  }
}
