package odevUygulamaOverriding;

public class BaseKrediManager {

	public double hesapla(double tutar) { // public yazd�ktan sonra final yazarsan bu demektir ki di�er classlar bu metodu ezemez.
		return tutar * 1.18;
	}

}
