package odevUygulamaOverriding;

public class BaseKrediManager {

	public double hesapla(double tutar) { // public yazdýktan sonra final yazarsan bu demektir ki diðer classlar bu metodu ezemez.
		return tutar * 1.18;
	}

}
