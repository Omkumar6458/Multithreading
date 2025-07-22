package MultiThreading;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Executor1 {
  public static void main(String[] args) {
    ExecutorService ex = Executors.newFixedThreadPool(3); // create a threadpool of size 3 

    Runnable task =()->{

      for(int i=0;i<8;i++)
      {
        System.out.println("thread1 "+ i);
      }
    };

    Runnable task1 = ()->{

      for(int i=0;i<7;i++)
      {
        System.out.println("thread2 "+ i);
      }
    };

    ex.submit(task1);
    ex.submit(task);

    ex.shutdown();

  }
}
