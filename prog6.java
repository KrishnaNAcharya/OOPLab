import java.util.*;
public class prog6 {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    try {
    System.out.println("ENteer the numher of integers");
    int n=scanner.nextInt();
    if(n<=0) {
        throw new InputMismatchException("Number greater than 0");
    }
    int arr[]=new int[n];
  System.out.println("Enter integers");
  for (int i=0;i<n;i++) {
    arr[i]=scanner.nextInt();
   
  }
  int small=arr[0];
  for (int i=1;i<n;i++) {
    if (small>arr[i]) {
        small=arr[i];
    } 
     if(arr[i]==0){
       throw new ArithmeticException("Cant divide by 0");
    }
  }
  for (int i=0;i<n;i++){
    System.out.println(arr[i]/small);
  }
  System.out.println("Enter the element to be accessed");
  int k=scanner.nextInt();
  if (k>n){
    throw new ArrayIndexOutOfBoundsException("Number greater than 0");
  }
   System.out.println(arr[k]);
    }
catch (InputMismatchException e) {
            System.out.println("Input mismatch. Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Index entered is out of bounds.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
    
}
scanner.close();
}
}