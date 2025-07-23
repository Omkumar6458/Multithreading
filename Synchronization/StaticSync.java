package MultiThreading.Synchronization;

public class StaticSync {
    public static void main(String[] args) {
        Threadx t = new Threadx();     // Thread subclass
        Thready t2 = new Thready();    // Thread subclass

        t.start();
        t2.start();
    }
}

class Table {
    public static synchronized void display(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

class Threadx extends Thread {
    public void run() {
      
        Table.display(9);  // Static method call — OK
    }
}

class Thready extends Thread {
    public void run() {
        Table.display(8);  // Static method call — OK
    }
}
