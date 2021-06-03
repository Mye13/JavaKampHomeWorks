package odevUygulamaKodlamaio;

public class StudentManager extends UserManager {

	public void add(Student student) {
		System.out.println("Öðrenci sisteme eklendi :" + " " + student.getFirstName());
	}

	public void delete(Student student) {
		System.out.println("Öðrenci sistemden silindi :" + " " + student.getFirstName());
	}

	public void update(Student student) {
		System.out.println("Öðrenci sistemde güncellendi :" + " " + student.getFirstName());
	}

}
