package odevUygulama2;

public class Main {

	public static void main(String[] args) {
		
		// ---------------------------- Kodlama.io sitesi kurslar sim�le edildi. -----------------------------
		
		Course course1 = new Course(1, "Kampa giri� kursu", "Kursa �n haz�rl�k yapmak i�in �nce bu bu kursu bitiriniz", 100, "Engin Demiro�");
		
		Course course2 = new Course();
		course2.kursId = 2;
		course2.kursAdi = "C++ Yaz�l�m Geli�tirme Kamp�";
		course2.kursAciklamasi = "Bu kursa sayesinde sekt�re iyi yere geleceksiniz :)";
		course2.kursY�zdesi = 45;
		course2.kursEgitmeni = "Engin Demiro�";
		
		Course course3 = new Course();
		course3.kursId = 3;
		course3.kursAdi = "Java Yaz�l�m Geli�tirme Kamp�";
		course3.kursAciklamasi = "Bu kursa sayesinde sekt�re iyi yerlere gelmeye ba�lad�n�z :)";
		course3.kursY�zdesi = 8;
		course3.kursEgitmeni = "Engin Demiro�";
	
		Course[] courses = {course1, course2, course3};
		
		for (Course course : courses) {
			System.out.println(course.kursAdi);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course3);
		
	}

}
