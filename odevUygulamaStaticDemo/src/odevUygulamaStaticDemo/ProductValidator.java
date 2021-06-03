package odevUygulamaStaticDemo;

public class ProductValidator {
	
	static { // birden fazla static yazýlabilir.
		System.out.println("Static yapýcý bloðu bu þekilde çalýþýr");
	}
	
	public ProductValidator() {
		System.out.println("Constructor newlenince çalýþýr");
	}
	
	public static boolean isValid(Product product) {

		// ! iþareti deðilse anlamýna gelir.
		// isEmpty -> boþsa / !isEmpty -> boþ deðilse
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
		
	}

	public void bisey() {
		System.out.println("Biþey yap");
	}
	
}
