package MultiThreading.Synchronization;
import java.util.*;

public class ATM {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("enter how many times money sent");

    int n = scn.nextInt();


    Amount a1 = new Amount();

    System.out.println("emter money");
   while(n>0){
    
  
    int t = scn.nextInt();

    Thread t1 = new Thread( ()->{
     a1.withdraw(t);
    },"user2");
    
    t1.start();
    

    Thread t2 = new Thread( ()->{
      a1.withdraw(t);
    },"user1");

    t2.start();


    
 n--;
 
  }
  
  }
}

class Amount {
  private int balance = 10000;

 
  synchronized public void withdraw(int amount)
   {
    if(amount <= balance)
    {
      balance = balance-amount;
      System.out.println("withdraw by  " + Thread.currentThread().getName() +" "+  balance);

    }else{
      System.out.println("no balance ");
      
    }
   }
}

// here use sleep , jion , try catch for better handle to race condition : 