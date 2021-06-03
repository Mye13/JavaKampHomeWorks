package Entities;

import java.time.LocalDate;

import Abstract.EntityGamerService;

public class Gamer implements EntityGamerService{

	private String firstName;
	private String lastName;
	private LocalDate birthDay;
	private String nationaltiyId;
	private String kod;

	public Gamer() {

	}

	public Gamer(String firstName, String lastName, LocalDate birthDay, String nationaltiyId) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
		this.nationaltiyId = nationaltiyId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public String getNationaltiyId() {
		return nationaltiyId;
	}

	public void setNationaltiyId(String nationaltiyId) {
		this.nationaltiyId = nationaltiyId;
	}

	public String getKod() {
		return this.firstName.substring(0, 1) + this.lastName.substring(0, 1) + nationaltiyId;
	}

}
