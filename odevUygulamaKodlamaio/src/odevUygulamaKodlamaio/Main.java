package odevUygulamaKodlamaio;

	// Burada kodlama.io sitesi bazý özellikleri bakýmýndan simüle edilmiþtir.
	// Sisteme eðitmen yada öðrenci; ekleme, silme, güncelleme komutlarý yazýlmýþtýr.
	// Kullanýcýlarýn eriþmemesi gereken özellikler olabileceði için getters ve setters
	// yapýsý kullanýlmýþtýr.
	// Ayný fonksiyonlara sahip sýnýflar kod karmaþasýný mininmum seviyede tutmak için
	// base sýnýflara inherit edilmiþtir.

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
