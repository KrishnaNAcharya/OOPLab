interface resume{
    void biodata();
}
class Teacher implements resume{
  private String personalInfo;
  private String qualification;
  private String experience;
  private String achievements;
public Teacher(String personalInfo, String qualification, String experience, String achievements){
this.personalInfo = personalInfo;
        this.qualification = qualification;
        this.experience = experience;
        this.achievements = achievements;
    }
public void biodata(){
    System.out.println("Teacher Biodata:");
     System.out.println("Personal Information: " + personalInfo);
    System.out.println("Qualification: " + qualification);
    System.out.println("Experience: " + experience);
    System.out.println("Achievements: " + achievements);
    System.out.println("-------------------------");
}
}
class Student implements resume {
    private String personalInfo;
    private String result;
    private String discipline;

    // Constructor
    public Student(String personalInfo, String result, String discipline) {
        this.personalInfo = personalInfo;
        this.result = result;
        this.discipline = discipline;
    }

    // Implementing the biodata method from the Resume interface
    @Override
    public void biodata() {
        System.out.println("Student Biodata:");
        System.out.println("Personal Information: " + personalInfo);
        System.out.println("Result: " + result);
        System.out.println("Discipline: " + discipline);
        System.out.println("-------------------------");
    }
}
public class prog4 {
public static void main(String[] args) {
    Teacher teacher=new Teacher("A","A","A","A");
    Student student=new Student("A","A","A");
    teacher.biodata();
    student.biodata();
}
}