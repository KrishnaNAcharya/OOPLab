class MessagePrinter {
    private final Object lock=new Object();
    synchronized void printMessage(String message) {
        synchronized(lock){
        System.out.print("[" + message + "] ");
        try {
            Thread.sleep(100); // Simulating some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
}

class ChildThread extends Thread {
    private MessagePrinter printer;
    private String message;

    public ChildThread(MessagePrinter printer, String message) {
        this.printer = printer;
        this.message = message;
    }

    @Override
    public void run() {
        final Object lock=new Object();
        synchronized(lock){
     printer.printMessage(message);
    }
} }

public class prog8_1 {
    public static void main(String[] args) {
        MessagePrinter printer = new MessagePrinter();

        // Without synchronization
        System.out.println("Without Synchronization:");
        Thread thread1 = new ChildThread(printer, "Learn");
        Thread thread2 = new ChildThread(printer, "Java");
        Thread thread3 = new ChildThread(printer, "Programming");

        thread1.start();
        thread2.start();
        thread3.start();

        // Ensure all threads finish before moving on
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // With synchronization
        System.out.println("\nWith Synchronization:");
        Thread syncThread1 = new ChildThread(printer, "Learn");
        Thread syncThread2 = new ChildThread(printer, "Java");
        Thread syncThread3 = new ChildThread(printer, "Programming");
        try {
            syncThread1.join();
            syncThread2.join();
            syncThread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        syncThread1.start();
        syncThread2.start();
        syncThread3.start();
    }
}
