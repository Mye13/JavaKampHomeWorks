package odevUygulamaKodlamaio;

public class StudentManager extends UserManager {

	public void add(Student student) {
		System.out.println("��renci sisteme eklendi :" + " " + student.getFirstName());
	}

	public void delete(Student student) {
		System.out.println("��renci sistemden silindi :" + " " + student.getFirstName());
	}

	public void update(Student student) {
		System.out.println("��renci sistemde g�ncellendi :" + " " + student.getFirstName());
	}

}
