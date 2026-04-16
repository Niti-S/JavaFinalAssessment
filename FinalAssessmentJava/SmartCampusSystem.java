import java.util.*;

//Creating a class that will manage student's details

    class Student{
        int StudentId;
        String Name;
        String Email;

//creating constructor for student class to initialize objects

    public Student(int StudentId, String Name, String Email){
        this.StudentId = StudentId;
        this.Name = Name;
        this.Email = Email;

    }
  public String toString() {
        return "ID: " + StudentId + ", Name: " + Name + ", Email: " + Email;
    }

    }

//creating a class that will manage student's course details

    class Course{
        int CourseId;
        String CourseName;
        double Fee;

//creating constructor for course class to initialize objects
    
    public Course( int CourseId, String CourseName, double Fee){
        this.CourseId = CourseId;
        this.CourseName = CourseName;
        this.Fee = Fee;
    }

     public String toString() {
        return "ID: " + CourseId + ", Course: " + CourseName + ", Fee: " + Fee;
    }
    }
 
//custom exception
     
     class InvalidFeeException extends Exception {
    public InvalidFeeException(String message) {
        super(message);
    }
}

//creating thread class for enrollment
    
   class EnrollmentProcessor extends Thread {
    public void run() {
        System.out.println("Processing enrollment loading...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }
        System.out.println("Enrollment processed successfully!");
    }
}

public class SmartCampusSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Course> courses = new ArrayList<>();
    static HashMap<Integer, ArrayList<Integer>> enrollments = new HashMap<>();

    static Scanner sc = new Scanner(System.in);

//creating another class for adding students

    public static void AddStudent() {
        try {
            System.out.print("Enter Student ID: ");
            int Id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String Name = sc.nextLine();

            System.out.print("Enter Email: ");
            String Email = sc.nextLine();

             students.add(new Student(Id, Name, Email));
            System.out.println("Student added successfully!");

        } catch (Exception e) {
            System.out.println("Invalid input!");
            sc.nextLine();
        }
    }

//creating the class to add course

    public static void AddCourse() {
        try {
            System.out.print("Enter Course ID: ");
            int Id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Course Name: ");
            String Name = sc.nextLine();

            System.out.print("Enter Fee: ");
            double Fee = sc.nextDouble();

            courses.add(new Course(Id, Name, Fee));
            System.out.println("Course added successfully!");

        } catch (Exception e) {
            System.out.println("Invalid input!");
            sc.nextLine();
        }
    }

//creating class to enroll students

    public static void EnrollStudent(){
        try{
            System.out.println("Enter Student Id: ");
            int sId = sc.nextInt();

            System.err.println("Enter Course Id: ");
            int cId = sc.nextInt();

            if(!enrollments.containsKey(sId)){
                enrollments.put(sId, new ArrayList<>());
            }

        enrollments.get(sId).add(cId);

        System.out.println("Enrollment Succesfull!");

        } catch(Exception e){
            System.out.println("Invalid input!");

        sc.nextLine();
        }
  }

//for viewing students

    public static void ViewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student nits : students) {
            System.out.println(nits);
        }
    }

//for viewing course

     public static void ViewCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses found.");
            return;
        }

        for (Course c1: courses) {
            System.out.println(c1);
        }
    }

//for enrolling students

public static void viewEnrollments() {
        if (enrollments.isEmpty()) {
            System.out.println("No enrollments found.");
            return;
        }

        for (Integer sid : enrollments.keySet()) {
            System.out.println("Student ID " + sid + " enrolled in courses: " + enrollments.get(sid));
        }
    }

//for enrollment process

    public static void processEnrollment() {
        EnrollmentProcessor thread = new EnrollmentProcessor();
        thread.start();
    }

//for main menu

    public static void main(String[] args) {

        while (true) {
            System.out.println("SMART CAMPUS MENU");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Enroll Student");
            System.out.println("4. View Students");
            System.out.println("5. View Courses");
            System.out.println("6. View Enrollments");
            System.out.println("7. Process Enrollment");
            System.out.println("8. Exit");

         System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    AddStudent();
                    break;
                case 2:
                    AddCourse();
                    break;
                case 3:
                    EnrollStudent();
                    break;
                case 4:
                    ViewStudents();
                    break;
                case 5:
                    ViewCourses();
                    break;
                  case 6:
                    viewEnrollments();
                    break;
                case 7:
                    processEnrollment();
                    break;
                 case 8:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
    }   }

}
