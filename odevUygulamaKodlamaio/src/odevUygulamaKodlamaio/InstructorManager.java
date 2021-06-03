package odevUygulamaKodlamaio;

public class InstructorManager extends UserManager {

	public void add(Instructor instructor) {
		System.out.println("Eðitmen sisteme eklendi :" + " " + instructor.getFirstName());
	}

	public void delete(Instructor instructor) {
		System.out.println("Eðitmen sistemden silindi :" + " " + instructor.getFirstName());
	}

	public void update(Instructor instructor) {
		System.out.println("Eðitmen sistemde güncellendi :" + " " + instructor.getFirstName());
	}

}
