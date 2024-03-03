
public class Student {
	private String name;
	private int rollNumber;
	private double[] marks;

	public Student(String name, int rollnumber, double[] marks) {
		this.name = name;
		this.rollNumber = rollnumber;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public double[] getMarks() {
		return marks;
	}

	public void setMarks(double[] marks) {
		this.marks = marks;
	}

	public double calculatePercentage() {
		double total = 0;
		for (double mark : marks) {
			total += mark;
		}
		return (total / marks.length);
	}

	public String Grade() {
		double percentage = calculatePercentage();
		if (percentage >= 90)
			return "A";
		else if (percentage >= 80)
			return "B";
		else if (percentage >= 70)
			return "C";
		else if (percentage >= 60)
			return "D";
		else
			return "Fail";
	}

}
