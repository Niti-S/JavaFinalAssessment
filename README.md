# JavaFinalAssessment
PROBLEM:

As an Admin, 
The problem was to manage students and courses details, 
So  that enrollments can track efficiently. 
As a System, 
The problem was to handle errors and process requests asynchronously, 
So that the application is reliable.

FEATURES:

1. The Smart Campus System stores the student's data efficiently.
2. The Smart Campus System stores the course opt by students, as well as map them togther.
3. The Smart Campus System has the feature to view the student details as well as view the course details of a student by thier student Ids.
4. The Smart Campus System gives the reliability of viewing student enrollment status and process enrollment.

OUTPUTS:

1. Add Student
2. Add Course
3. Enroll Student
4. View Students
5. View Courses
6. View Enrollments
7. Process Enrollment
8. Exit
Enter choice: 1
Enter Student ID: 18
Enter Name: Niti Shree
Enter Email: nitishree406@gmail.com
Student added successfully!

Enter choice: 2
Enter Course ID: 21
Enter Course Name: Btech
Enter Fee: 121000 
Course added successfully!

Enter choice: 3
Enter Student Id: 
18
Enter Course Id: 
21
Enrollment Succesfull!

Enter choice: 4
ID: 18, Name: Niti Shree, Email: nitishree406@gmail.com

Enter choice: 5
ID: 21, Course: Btech, Fee: 121000.0

Enter choice: 6
Student ID 18 enrolled in courses: [21]



ANSWERS OF MCQS:
MCQ 1: Collections Design 
A developer is implementing student enrollments where each student can enroll in multiple 
courses. The system should allow quick lookup of a student and their enrolled courses. 
Which is the most optimal data structure? 

ANS: HashMap<Student, ArrayList<Course>> 


MCQ 2: Exception Handling Scenario 
During enrollment, a student enters a negative course fee, causing incorrect processing. The 
developer wants to ensure invalid data is handled properly. 
What is the best approach?

ANS: Throw a custom exception like InvalidFeeException


MCQ 3: Multithreading Use Case 
The system simulates enrollment processing using a thread. However, multiple threads are 
accessing the same enrollment list, causing inconsistent results. 
What should be done?

ANS: Use synchronized block or thread-safe collection 


MCQ 4: OOP Design Decision 
A developer wants to enforce a rule that every type of course must implement a method 
calculateFee() but allow different implementations. 
Which concept should be used?

ANS: Interface
