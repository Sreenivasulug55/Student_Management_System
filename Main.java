import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Student_ManagementSystem StdManagement = new Student_ManagementSystem();
        Scanner sc = new Scanner(System.in);

        // Adding sample Students data
//      StdManagement.addStudent(new Student("Vamshi", 101, new double[] { 75, 59.90 }));
//      StdManagement.addStudent(new Student("Rajesh", 102, new double[] { 87, 65, 93 }));

        // the loop is executed infinite because we perform continuous Operations
        // if we want to terminate the loop choose the option 5 it terminates
        while (true) {
            System.out.println("Student Management System:\n"
                    + "1. Add Student\n"
                    + "2. Update Student\n"
                    + "3. Delete Student\n"
                    + "4. Show Students Details\n"
                    + "5. Exit\n"
                    + "Choose an option:");

            int option = sc.nextInt();
            sc.nextLine(); // Consume newline character
            switchCases(StdManagement, sc, option);
        }

    }

    public static void switchCases(Student_ManagementSystem StdManagement, Scanner scanner, int option) {
        switch (option) {
            case 1:
                // take user manual inputs
                System.out.println("Enter Student Name:");
                String name = scanner.nextLine();
                System.out.println("Enter Student RollNumber:");
                int rollNumber = scanner.nextInt();
                System.out.println("Enter marks Separated by Space:");
                scanner.nextLine(); // Consume newline character

                // i want to store marks in string format after i will convert string to double
                // and separated each mark by space

                String[] markstr = scanner.nextLine().split(" ");
                double[] marks = new double[markstr.length];
                for (int i = 0; i < markstr.length; i++) {
                    marks[i] = Double.parseDouble(markstr[i]);
                }
                StdManagement.addStudent(new Student(name, rollNumber, marks));
                break;

            case 2:
                System.out.println("Enter Rollnumber:");
                int rollUpdate = scanner.nextInt();
                System.out.println("Enter Marks Separated by Space:");
                scanner.nextLine(); // Consume newline character
                String[] markstrUpdate = scanner.nextLine().split(" ");
                double[] newMarks = new double[markstrUpdate.length];
                for (int i = 0; i < newMarks.length; i++) {
                    newMarks[i] = Double.parseDouble(markstrUpdate[i]);
                }
                StdManagement.updateStudent(rollUpdate, newMarks);
                break;

            case 3:
                System.out.println("Enter RollNumber of Student Delete: ");
                int removeStdRoll = scanner.nextInt();
                StdManagement.deleteStudent(removeStdRoll);
                break;

            case 4:
                StdManagement.printStudentDetails();
                break;

            case 5:
                System.out.println("Exiting...!");
                System.exit(0);
            default:
                System.out.println("Choose Valid Option: ");

        }
    }

}
