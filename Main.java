import java.util.*;

public class Main {

	public static void main(String[] args) {

		Student_ManagementSystem StdManagement = new Student_ManagementSystem();
		Scanner sc = new Scanner(System.in);

		// Adding sample Students data

//		StdManagement.Add_std(new student("Vamshi", 101, new double[] { 75, 59.90 }));
//		StdManagement.Add_std(new student("Rajesh", 102, new double[] { 87, 65, 93 }));

		// the loop is executed infinite because we perform continus Operations
		// if we want to terminate the loop choose the option 5 it terminate
		while (true) {
			System.out.println("Student Management System:\r\n"
					+ "1.Add Student\r\n"
					+ "2.Update Student\r\n"
					+ "3.Delete Student:\r\n"
					+ "4.Show Students Details\r\n"
					+ "5.Exit ....!\r\n"
					+ "Choose Valid Option:");

			int option = sc.nextInt();
			sc.nextLine();
			Cases(StdManagement, sc, option);

		}

	}

	public static void Cases(Student_ManagementSystem StdManagement, Scanner scanner, int option) {
		switch (option) {
		case 1:
			// take user manual inputs
			System.out.println("Enter Student Name:");
			String name = scanner.nextLine();
			System.out.println("Enter Student RollNumber:");
			int rollnumber = scanner.nextInt();
			System.out.println("Enter marks Separated by Space:");

			// i want to store marks in string format after i will convert string to double
			// and separated each mark by space

			String[] markstr = scanner.nextLine().split(" ");
			double[] marks = new double[markstr.length];
			for (int i = 0; i < markstr.length; i++) {
				marks[i] = Double.parseDouble(markstr[i]);
			}
			StdManagement.Add_std(new Student(name, rollnumber, marks));
			break;

		case 2:
			System.out.println("Enter Rollnumber:");
			int rollUpdate = scanner.nextInt();
			System.out.println("Enter Marks Separated by Space:");
			String[] markstrUpdate = scanner.nextLine().split(" ");
			double[] NewMarks = new double[markstrUpdate.length];
			for (int i = 0; i < NewMarks.length; i++) {
				NewMarks[i] = Double.parseDouble(markstrUpdate[i]);
			}
			StdManagement.UpdateStudent(rollUpdate, NewMarks);
			break;

		case 3:
			System.out.println("Enter RollNumber of Student Delete: ");
			int RemoveStdRoll = scanner.nextInt();
			StdManagement.DeleteStudent(RemoveStdRoll);
			break;

		case 4:
			StdManagement.printStudentDetails();
			;
			break;

		case 5:
			System.out.println("Exiting...!");
			System.exit(0);
		default:
			System.out.println("Choose Valid Option: ");

		}
	}

}
