package MultiThreading;

public class DaemonExample {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread running...");
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        });

        daemonThread.setDaemon(true);  // Must be before start()
        daemonThread.start();

        Thread userThread = new Thread(() -> {
            System.out.println("User thread running...");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            System.out.println("User thread finished.");
        });

        userThread.start();
    }
}

