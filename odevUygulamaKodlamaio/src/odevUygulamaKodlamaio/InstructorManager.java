package odevUygulamaKodlamaio;

public class InstructorManager extends UserManager {

	public void add(Instructor instructor) {
		System.out.println("E�itmen sisteme eklendi :" + " " + instructor.getFirstName());
	}

	public void delete(Instructor instructor) {
		System.out.println("E�itmen sistemden silindi :" + " " + instructor.getFirstName());
	}

	public void update(Instructor instructor) {
		System.out.println("E�itmen sistemde g�ncellendi :" + " " + instructor.getFirstName());
	}

}
