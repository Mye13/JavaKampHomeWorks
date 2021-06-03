package odevUygulama2;

public class Main {

	public static void main(String[] args) {
		
		// ---------------------------- Kodlama.io sitesi kurslar simüle edildi. -----------------------------
		
		Course course1 = new Course(1, "Kampa giriþ kursu", "Kursa ön hazýrlýk yapmak için önce bu bu kursu bitiriniz", 100, "Engin Demiroð");
		
		Course course2 = new Course();
		course2.kursId = 2;
		course2.kursAdi = "C++ Yazýlým Geliþtirme Kampý";
		course2.kursAciklamasi = "Bu kursa sayesinde sektöre iyi yere geleceksiniz :)";
		course2.kursYüzdesi = 45;
		course2.kursEgitmeni = "Engin Demiroð";
		
		Course course3 = new Course();
		course3.kursId = 3;
		course3.kursAdi = "Java Yazýlým Geliþtirme Kampý";
		course3.kursAciklamasi = "Bu kursa sayesinde sektöre iyi yerlere gelmeye baþladýnýz :)";
		course3.kursYüzdesi = 8;
		course3.kursEgitmeni = "Engin Demiroð";
	
		Course[] courses = {course1, course2, course3};
		
		for (Course course : courses) {
			System.out.println(course.kursAdi);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course3);
		
	}

}
