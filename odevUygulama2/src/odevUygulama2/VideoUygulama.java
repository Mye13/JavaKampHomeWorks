package odevUygulama2;

public class VideoUygulama {

	public static void main(String[] args) {

		// <Method Overloading> ------------------------
		
//		DortIslemMethodOverloading dortIslemMethodOverloading = new DortIslemMethodOverloading();
//		System.out.println(dortIslemMethodOverloading.topla(2, 4));
//		System.out.println(dortIslemMethodOverloading.topla(2, 4, 6));
		
		// <�zellik Classlar� + Encapsulation>  ---------------------
		
//		Product product = new Product(330, "Laptop", "Lenovo �deapad 330", 3100, 17, "Siyah");
//		product.setName("Laptop");
//		product.setId(330);
//		product.setDescription("Lenovo �deapad 330");
//		product.setPrice(3100);
//		product.setStockAmount(17);
//		
//		System.out.println(product.getName());
//		System.out.println(product.getKod());
//		ProductManager productManager = new ProductManager();
//		productManager.Add(product);
		
		// <RecapDemoClass> -------------------------
		
//		DortIslem dortIslem = new DortIslem();
//		int sonuc = dortIslem.Carp(13, 3);
//		System.out.println(sonuc);
		
		// <Class> ----------------------------------

//		CustomerManager customerManager = new CustomerManager();
//		CustomerManager customerManager2 = new CustomerManager();
//		customerManager = customerManager2;
//		customerManager.Add();
//		customerManager.Delete();
//		customerManager.Update();

		// <Variable Arguments> ---------------------

//		int toplam = topla2(13, 7, 5);
//		System.out.println(toplam);

		// <Methods2> -------------------------------

//		String mesaj = "Bug�n hava �ok g�zel";
//		String yeniMesaj = mesaj.substring(0,2);
//		System.out.println(yeniMesaj);
//		int sayi = topla(13, 34);
//		System.out.println(sayi);

		// <Methods> --------------------------------

//		sayiBulmaca();

	}

//	public static int topla2(int... sayilar) { // Buradaki int... sayilar ifadesi sayilar ad�nda bo� bir int array
//												// olu�turur.
//		int toplam = 0;
//		for (int sayi : sayilar) {
//			toplam = toplam + sayi;
//		}
//		return toplam;
//	}

//	public static void add() {
//		System.out.println("Ekleme i�lemi halledildi.");
//	}
//
//	public static void delete() {
//		System.out.println("Silme i�lemi ba�ar�l�.");
//	}
//
//	public static void update() {
//		System.out.println("G�ncelleme talebiniz al�nd�.");
//	}
//
//	public static int topla(int sayi1, int sayi2) {
//		return sayi1 + sayi2;
//	}

//	public static void sayiBulmaca() {
//
//		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
//		int lookForNumber = 1;
//
//		for (int number : numbers) {
//			if (number == lookForNumber) {
//				mesajVer("Arad���n�z say�y� buldunuz. " + lookForNumber);
//				return;
//			}
//		}
//		System.out.println("Arad���n�z say� listede bulunmamaktad�r. " + lookForNumber);
//
//	}
//
//	public static void mesajVer(String mesaj) {
//
//		System.out.println(mesaj);
//
//	}

}
