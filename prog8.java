class PrintMessage{
    synchronized void printMsg(String message){
        System.out.print("[" + message + "] ");
        try {
            Thread.sleep(1000); // Simulating some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class tthread extends Thread{
    PrintMessage pm;
    String message;
    tthread( PrintMessage pm, String message){
        this.pm=pm;
        this.message=message;
    }
    public void run(){
       pm.printMsg(message);
    }
}
public class prog8{
public static void main(String[] args) {
    PrintMessage prtm=new PrintMessage();
    Thread thread1=new tthread(prtm,"LEarn");
    Thread thread2=new tthread(prtm,"Java");
    Thread thread3=new tthread(prtm,"Programming");
thread1.start();
thread2.start();
thread3.start();
    }
}