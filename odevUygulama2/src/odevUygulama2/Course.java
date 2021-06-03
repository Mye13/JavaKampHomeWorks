package odevUygulama2;

public class Course {

	public Course() {
		System.out.println("God have see you.");
	}
	
	public Course(int kursId, String kursAdi, String kursAciklamasi, int kursYüzdesi, String kursEgitmeni) {
		this();
		this.kursId = kursId;
		this.kursAdi = kursAdi;
		this.kursAciklamasi = kursAciklamasi;
		this.kursYüzdesi = kursYüzdesi;
		this.kursEgitmeni = kursEgitmeni;
		
	}
	
	int kursId;
	String kursAdi;
	String kursAciklamasi;
	String kursEgitmeni;
	int kursYüzdesi;
	
}
