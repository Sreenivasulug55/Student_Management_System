import java.util.*;

public class Student_ManagementSystem {
	ArrayList<Student> students = new ArrayList<>();

	public Student_ManagementSystem() {
		students = new ArrayList<>();
	}
	public void Add_std(Student std) {
		students.add(std);
	}
	public void UpdateStudent(int rollnumber,double[] marks) {
		for (Student std : students) {
			if(std.getRollNumber() == rollnumber) {
				std.setMarks(marks);
				return;
			}
		}
		System.out.println("Enter Valid RollNumber:");
	}
	public void DeleteStudent(int rollnumber) {
		for (int i=0;i<students.size();i++) {
			if(students.get(i).getRollNumber() == rollnumber) {
				students.remove(i);
			}
		}
		System.out.println("Enter Valid RollNumber");
	}
	
	public void printStudentDetails() {
		
		for (Student std : students) {
			System.out.println("studentName:"+std.getName());
			System.out.println("StudentRollnumber:"+std.getRollNumber());
			double[] marks = std.getMarks();
			System.out.print("Marks:");
			for (double mark : marks) {
				System.out.print(mark+", ");
			}
			System.out.printf("\nPercentage:%.2f\n",std.calculatePercentage());
			System.out.println("Grade: "+std.Grade());
			
		}
	}

}
