package P02T01;

public class GradeBook {
	
	private String courseName;
	
	
	public GradeBook(String string) {
		courseName = string;
	}


	public void displayMessage() {
		System.out.printf("gradeBook course name is: %s", getCourseName());
	}
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String name) {
		this.courseName = name;
	}

}
