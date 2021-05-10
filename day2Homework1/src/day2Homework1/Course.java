package day2Homework1;

public class Course {
	
	public Course() {
		
	}
	public Course(int id, String name, String instructorName, int progress) {
		this();
		this.id=id;
		this.name=name;
		this.instructorName=instructorName;
		this.progress=progress;
	}
	
	
	int id;
	String name;
	String instructorName;
	int progress;
}