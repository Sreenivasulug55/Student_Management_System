import java.util.ArrayList;

public class Student_ManagementSystem {
    private ArrayList<Student> students;

    public Student_ManagementSystem() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void updateStudent(int rollNumber, double[] marks) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                student.setMarks(marks);
                return;
            }
        }
        System.out.println("No student found with the provided roll number.");
    }

    public void deleteStudent(int rollNumber) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRollNumber() == rollNumber) {
                students.remove(i);
                System.out.println("Student with roll number " + rollNumber + " has been deleted.");
                return;
            }
        }
        System.out.println("No student found with the provided roll number.");
    }

    public void printStudentDetails() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student student : students) {
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Roll Number: " + student.getRollNumber());
            double[] marks = student.getMarks();
            System.out.print("Marks: ");
            for (double mark : marks) {
                System.out.print(mark + ", ");
            }
            System.out.printf("\nPercentage: %.2f\n", student.calculatePercentage());
            System.out.println("Grade: " + student.Grade());
            System.out.println();
        }
    }
}
