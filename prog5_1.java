import java.util.Random;
 class NumGen implements Runnable{
    Random random=new Random();
    int num;
    public void run() {
        while(true){
    num=random.nextInt(100);
    System.out.println("Generated Number: " + num);
 try{
    Thread.sleep(1000);
 }
 catch(Exception e){
    e.printStackTrace();
 }
 }
    }
    public int getnum(){
        return num;
    }
}
class sqgen implements Runnable{
    NumGen numgen;
    sqgen(NumGen numgen){
        this.numgen=numgen;
    }
  public void run(){
    while(true){
        int num=numgen.getnum();
        int square=num*num*num;
         System.out.println("Square: " + square);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class cubgen implements Runnable{
     NumGen numgen;
     cubgen(NumGen numgen){
        this.numgen=numgen;
     }
  public void run(){
    while(true){
        int num=numgen.getnum();
        int cube=num*num*num;
         System.out.println("Cube"+cube);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class prog5_1{
    public static void main(String[] args) {
        NumGen numgen=new NumGen();
        Thread thread1=new Thread(numgen);
        Thread thread2=new Thread(new sqgen(numgen));
        Thread thread3=new Thread(new cubgen(numgen));
        thread1.start();
        thread2.start();
        thread3.start();

                    
    }
}