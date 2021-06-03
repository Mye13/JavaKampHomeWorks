package odevUygulama2;

public class VideoUygulama {

	public static void main(String[] args) {

		// <Method Overloading> ------------------------
		
//		DortIslemMethodOverloading dortIslemMethodOverloading = new DortIslemMethodOverloading();
//		System.out.println(dortIslemMethodOverloading.topla(2, 4));
//		System.out.println(dortIslemMethodOverloading.topla(2, 4, 6));
		
		// <Özellik Classlarý + Encapsulation>  ---------------------
		
//		Product product = new Product(330, "Laptop", "Lenovo Ýdeapad 330", 3100, 17, "Siyah");
//		product.setName("Laptop");
//		product.setId(330);
//		product.setDescription("Lenovo Ýdeapad 330");
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

//		String mesaj = "Bugün hava çok güzel";
//		String yeniMesaj = mesaj.substring(0,2);
//		System.out.println(yeniMesaj);
//		int sayi = topla(13, 34);
//		System.out.println(sayi);

		// <Methods> --------------------------------

//		sayiBulmaca();

	}

//	public static int topla2(int... sayilar) { // Buradaki int... sayilar ifadesi sayilar adýnda boþ bir int array
//												// oluþturur.
//		int toplam = 0;
//		for (int sayi : sayilar) {
//			toplam = toplam + sayi;
//		}
//		return toplam;
//	}

//	public static void add() {
//		System.out.println("Ekleme iþlemi halledildi.");
//	}
//
//	public static void delete() {
//		System.out.println("Silme iþlemi baþarýlý.");
//	}
//
//	public static void update() {
//		System.out.println("Güncelleme talebiniz alýndý.");
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
//				mesajVer("Aradýðýnýz sayýyý buldunuz. " + lookForNumber);
//				return;
//			}
//		}
//		System.out.println("Aradýðýnýz sayý listede bulunmamaktadýr. " + lookForNumber);
//
//	}
//
//	public static void mesajVer(String mesaj) {
//
//		System.out.println(mesaj);
//
//	}

}
