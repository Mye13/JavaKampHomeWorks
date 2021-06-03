package odevUygulamaStaticDemo;

public class ProductValidator {
	
	static { // birden fazla static yaz�labilir.
		System.out.println("Static yap�c� blo�u bu �ekilde �al���r");
	}
	
	public ProductValidator() {
		System.out.println("Constructor newlenince �al���r");
	}
	
	public static boolean isValid(Product product) {

		// ! i�areti de�ilse anlam�na gelir.
		// isEmpty -> bo�sa / !isEmpty -> bo� de�ilse
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
		
	}

	public void bisey() {
		System.out.println("Bi�ey yap");
	}
	
}
