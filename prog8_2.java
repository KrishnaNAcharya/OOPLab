class primess extends Thread{
static Object lock= new Object();
String s;
primess(String s){
this.s=s;
}

   public void run(){
   synchronized(lock){
   System.out.println("["+s+"]");
   }
   }
}

public class prog8_2{
  public static void main(String args[]){
     primess t1=new primess("Learn");
     primess t2=new primess("JAVA");
     primess t3=new primess("Programming");
     try{
     t1.start();
     t1.join();
     t2.start();
     t2.join();
     t3.start();
     t3.join();
  }
  catch(Exception e){
   e.printStackTrace();
  }
}
}