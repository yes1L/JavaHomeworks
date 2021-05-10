package day2Homework1;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course();
		course1.id = 1;
		course1.name = "C# + ANGULAR";
		course1.instructorName = "Engin Demiroð";
		course1.progress = 43;
		
		Course course2 = new Course(2, "JAVA + REACT", "Engin Demiroð", 24);
		
		Course course3 = new Course();
		course3.id = 3;
		course3.name = "C++";
		course3.instructorName = "Engin Demiroð";
		course3.progress = 0;
		
		
		
		
		Course[] courses = {course1, course2};
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course3);
		
		
		for (Course course:courses) {
			System.out.println("Kurs Adý : "+course.name);
		}
	}

}