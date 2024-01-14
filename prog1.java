import java.util.Scanner;
 class Student {
    private String USN;
    private String Name;
    private String Branch;
    private String Phone;

   public Student(String USN, String Name, String Branch, String Phone) {
    this.USN=USN;
    this.Name=Name;
    this.Branch=Branch;
    this.Phone=Phone;

}
public void display(){
    System.out.println("USN"+USN);
    System.out.println("Name"+Name);
    System.out.println("Branch"+Branch);
    System.out.println("Phone"+Phone);
}
}

public class prog1 {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n=scanner.nextInt();
        Student students[]=new Student[n];
        for (int i=0;i<n;i++) {
            System.out.println("Enter details for student"+ (i+1));
            System.out.println("ENter USN");
            String USN=scanner.next();
            System.out.println("ENter Name");
            String Name=scanner.next();
            System.out.println("ENter Branch");
            String Branch=scanner.next();
            System.out.println("ENter Phone");
            String Phone=scanner.next();
            students[i]=new Student(USN,Name,Branch,Phone);
        
        }
        System.out.println("Details:");
        for(int i=0;i<n;i++) {
            students[i].display();
        }
scanner.close();

    }
}