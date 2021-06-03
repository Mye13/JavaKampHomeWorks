package odevUygulama2;

public class CourseManager {

	public CourseManager() {
		System.out.println("Catch me!");
	}
	
	public void addCourse(Course course) {
		System.out.println(course.kursAdi + " Kurslara eklendi.");
	}
	
	public void deleteCourse(Course course) {
		System.out.println(course.kursAdi + " Kurs listeden kaldırıldı.");
	}
	
}
