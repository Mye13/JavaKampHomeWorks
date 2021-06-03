package odevUygulamaKodlamaio;

	// Burada kodlama.io sitesi baz� �zellikleri bak�m�ndan sim�le edilmi�tir.
	// Sisteme e�itmen yada ��renci; ekleme, silme, g�ncelleme komutlar� yaz�lm��t�r.
	// Kullan�c�lar�n eri�memesi gereken �zellikler olabilece�i i�in getters ve setters
	// yap�s� kullan�lm��t�r.
	// Ayn� fonksiyonlara sahip s�n�flar kod karma�as�n� mininmum seviyede tutmak i�in
	// base s�n�flara inherit edilmi�tir.

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.setId(1);
		student.setFirstName("Malik");
		student.setLastName("Karabasan");
		student.setGsm("05684213658");
		student.setEmail("malik.com");

		Instructor instructor = new Instructor();
		instructor.setFirstName("Cabbar");

		StudentManager studentManager = new StudentManager();
		studentManager.add(student);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.delete(instructor);
	}

}
