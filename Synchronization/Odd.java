import java.util.*;


/*
 * WANT TO PRINT : 1-10 
 * THREAD 1 : PRINT ODD AND THREAD 2 : PRINT EVEN NUMBER 
 * 
 * MAKE SURE THAT IT WILL PRINT IN ALTERNATIVE WAY 
 * 
 */
public class Odd{
  public static void main(String[] args) {
    OddEvenPrinter print = new OddEvenPrinter(); // create a object of OddEvenPrinter 

    Thread odd = new OddThread(print);
    Thread even = new EvenThread(print);
   
    odd.start();
    even.start();
  }
}

//CREATE SHARED CLASS 

class OddEvenPrinter{
  private int num =1;  // shared number to initialised 
  private int max = 10;
  private boolean isOddTurn = true;


  public synchronized void printOdd() throws InterruptedException{
    while(num <= max)
    {
      while(!isOddTurn) // while ko true hone ke liye isoddTurn ko false hone hoga : as it false --> it goes into wait condition
      {
        wait();
      }

      System.out.println("printing :"+ num);
      num++;
      isOddTurn = false; // here we make it false so that next turn goes to even: 
      notify(); // Here we call notify so that even term which is in wait get out of it 
    }
  }




  public synchronized void printEven() throws InterruptedException{
    while(num <= max)
    {
      while(isOddTurn)  // here isOddTurn is true means it's time to print odd hance goes to wait state 
      {
        wait();
      }
      System.out.println("print even"+ num);
      num++;
      isOddTurn = true; // time to go form Even thread 
      notify(); // call to even thread 
    }


  }

}


/*******************************************CREATE ODD EVEN CLASS THREAD **************************************** */


class OddThread extends Thread{
// take shared class object :

 OddEvenPrinter printer;

 OddThread(OddEvenPrinter printer)  // here constructor call 
 {
  this.printer = printer;  // ensure same shared object 
 }

 //to override:
 public void run(){
  try {
    printer.printOdd();  

  } catch (Exception e) {
    
   System.out.println(e);
  }
 }


}

class EvenThread extends Thread{
     OddEvenPrinter printer;

     EvenThread(OddEvenPrinter printer)
     {
      this.printer = printer;
     }

     public void run()
     {
      try {
        printer.printEven();
        
      } catch (Exception e) {
        System.out.println(e);
      }
     }

     }