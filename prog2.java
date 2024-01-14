package OOPlab;

 class Staff {
    private String StaffId;
    private String Name;
    private String Phone;
    private String Salary;
 public Staff(String StaffId,String Name,String Phone,String Salary) {
    this.StaffId=StaffId;
    this.Name=Name;
    this.Phone=Phone;
    this.Salary=Salary;
 }
  public void display(){
    System.out.println("Staff ID"+ StaffId);
    System.out.println("Name"+ Name);
    System.out.println("Phone"+ Phone);
    System.out.println("Salary"+ Salary);
 }
    
}
class Teaching extends Staff {
    private String Domain;
    private String publications;
    Teaching(String Domain,String publications,String Name,String StaffId,String Phone,String Salary){
        super( StaffId,Phone,Name,Salary);
        this.Domain=Domain;
    this.publications=publications;
    }
    public void display(){
        super.display();
    System.out.println("Domain"+ Domain);
    System.out.println("Publictions"+ publications);
    }
}
