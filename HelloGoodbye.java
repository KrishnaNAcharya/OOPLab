
public class HelloGoodbye {
    public static void main(String[] args) 
    {
        if (args.length < 2) {
            System.out.println("Please provide at least two names as command-line arguments.");
            return;
        }
        String n1=args[0];
         String n2=args[1];
         System.out.println("Hello "+ n1 + " and " + n2+ ".");
         System.out.println("Goodbye "+ n2 + " and " + n1+".");


    }

    
}
