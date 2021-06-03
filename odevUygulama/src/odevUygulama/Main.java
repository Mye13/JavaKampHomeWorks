package odevUygulama;

public class Main {

	public static void main(String[] args) {

		// Mini Proje5 - Sayý Bulma -----------------------------
		
//		int[] numbers = new int[] {1, 2, 5, 7, 9, 0};
//		int lookForNumber = 1;
//		
//		for (int number : numbers) {
//			if (number == lookForNumber) {
//				System.out.println("Aradýðýnýz sayýyý buldunuz.");
//				return;
//				}	
//			}
//		System.out.println("Aradýðýnýz sayý listede bulunmamaktadýr.");
		
	
		// Mini Proje4 - Arkadaþ Sayýlar ------------------------

//		int number1 = 2620;
//		int number2 = 2924;
//		int total1 = 0;
//		int total2 = 0;
//
//		for (int i = 1; i < number1; i++) {
//			if (number1 % i == 0) {
//				total1 = total1 + i;
//			}
//		}
//
//		for (int i = 1; i < number2; i++) {
//			if (number2 % i == 0) {
//				total2 = total2 + i;
//			}
//		}
//
//		if (total1 == number2 & total2 == number1) {
//			System.out.println("Girdiðiniz sayýlar arkadaþ sayýlardýr.");
//		} else {
//			System.out.println("Girdiðiniz sayýlar arkadaþ sayý deðildir.");
//		}

		// Mini Proje3 - Mükemmel Sayý ---------------------------

//		int number = -27;
//		int total = 0;
//		
//		if (number == 1) {
//			System.out.println("Girdiðiniz sayý mükemmel sayý deðildir.");
//			return;
//		}
//		
//		if (number < 1) {
//			System.out.println("Geçersiz sayý girdiniz.");
//			return;
//		}
//		
//		for (int i = 1; i < number; i++) {
//			if (number % i == 0) {
//				total = total + i;
//			}
//		}
//
//		if (total == number) {
//			System.out.println("Girdiðiniz sayý mükemmel sayýdýr.");
//		} else {
//			System.out.println("Girdiðiniz sayý mükemmel sayý deðildir");
//		}

		// Mini Proje2 - Sesli Harfler --------------------------

//		char harf = 'U';
//		
//		switch (harf) {
//		case 'A':
//		case 'I':
//		case 'O':
//		case 'U':
//		case 'a':
//		case 'ý':
//		case 'o':
//		case 'u':
//			System.out.println("Kalýn sesli harf.");
//			break;
//			default:
//				System.out.println("Ýnce sesli harf.");
//		}

		// Mini Proje - Sayý Asal Mý? ---------------------------

//		int number = 19;
//		int remainder;
//
//		boolean asalSayiMi = true;
//
//		if (number == 1) {
//			System.out.println("1 Sayýsý asal deðildir.");
//			return;
//		}
//
//		if (number < 1) {
//			System.out.println("Geçersiz sayý girdiniz.");
//			return;
//		}
//
//		for (int i = 2; i < number; i++) {
//			if (number % i == 0) {
//				asalSayiMi = false;
//			}
//		}
//
//		if (asalSayiMi) {  //boolean kulanýmýnda true false belirtilmezse otomatik olarak true seçilir.
//			System.out.println(number + " Sayýsý asaldýr.");
//		} else {
//			System.out.println(number + " Sayýsý asal deðildir.");
//		}

		// <Bu yöntem iþe yaramýyor>
//		for (int i = 2; i < 8; i++) {
//			remainder = number % i;
//			if (remainder == 0) {
//				System.out.println(number + " Asal sayýdýr.");
//				break;
//			}
//			else {
//				System.out.println(number + " Asal sayý deðildir.");
//				break;
//			}
//		}

		// Strings Demo ----------------------------

//		String mesaj = "Ben koronayým ama iyileþeceðim.";
//		System.out.println(mesaj);

//		System.out.println("Eleman sayýsý : " + mesaj.length());
//		System.out.println("5. eleman : " + mesaj.charAt(4));
//		System.out.println(mesaj.concat(" Ama iyileþmel üzereyim."));
//		System.out.println(mesaj.startsWith("C"));
//		System.out.println(mesaj.endsWith("."));
//		char[] karakterler = new char[5];
//		mesaj.getChars(0, 5, karakterler, 0); // -> mesajýn |0.| karakterinden |4.| karakterine kadar olan karakterleri |karakterler arrayine| ata ve karakterler arrayinin |0. elemanýndan| atamaya baþla. 
//		System.out.println(karakterler);
//		System.out.println(mesaj.indexOf("o"));
//		System.out.println(mesaj.lastIndexOf('o'));

//		String yeniMesaj = mesaj.replace(' ', '-');
//		System.out.println(mesaj.replace(' ', '-'));
//		System.out.println(mesaj.substring(4, 10));
//		
//		for (String kelime: mesaj.split(" ")) {
//			System.out.println(kelime);
//		}
//		
//		System.out.println(mesaj.toLowerCase());
//		System.out.println(mesaj.toUpperCase());
//		System.out.println(mesaj.trim());  //Eðer cümlenin baþýnda veya sonunda boþluk varsa bu komut boþluklarý siler.

		// Multi Dimensional Arrays ----------------
		// <Matris Örneði>

//		String[][] sehirler = new String[3][3];
//		sehirler[0][0] = "Tatvan";
//		sehirler[0][1] = "Ahlat";
//		sehirler[0][2] = "Mutki";
//		sehirler[1][0] = "Hizan";
//		sehirler[1][1] = "Adilcevaz";
//		sehirler[1][2] = "Merkez";
//		sehirler[2][0] = "Van";
//		sehirler[2][1] = "Siirt";
//		sehirler[2][2] = "Aðrý";
//		
//		for (int i = 0; i <= 2; i++) {
//			System.out.println("--------------------");
//			for (int j = 0; j <= 2 ; j++) {
//				System.out.println(sehirler[i][j]);
//			}
//		}

		// Recap2 ----------------------------------

//		double[] myList = { 1.2, 2.3, 8.4, 4.5, 5.6, 13.7 };
//		double total = 0;
//		double big = myList[0];
//		for (double number : myList) {
//			System.out.println(number);
//			total = total + number;
//			if (big < number) {
//				big = number;
//			}
//
//		}
//		System.out.println("Sayýlar toplamý: " + total);
//		System.out.println("En büyük sayý: " + big);

		// Arrays ----------------------------------

//		String[] ogrenciler = {"engin", "muharrem", "stefan", "robert"};
//		for (String ogrenci : ogrenciler) {
//			System.out.println(ogrenci);
//		}
//		for (int i = 0; i < ogrenciler.length; i++) {
//			System.out.println(ogrenciler[i]);
//		}

		// Do- While Loop --------------------------

//		int j = 1;
//		do {
//			System.out.println("j" + j);
//			j++;
//		}while(j<10);	

		// While Loop ------------------------------

//		int i = 1;
//		while(i<10) {
//			System.out.println(i);
//			i++;
//		}

		// For Loop --------------------------------

//		for (int i = 0; i < 10; i++) {
//			System.out.println("i 10 dan küçük olduðu sürece ekraný bu yazýyý yazdýr." + i);
//		}

		// Switch - Case ---------------------------

//		char grade = 'b';
//
//		switch (grade) {
//		case 'A':
//			System.out.println("Mükemmel Geçtin Dostum");
//			break;
//
//		case 'B':
//			System.out.println("Orta-Mük Geçtin Dostum");
//			break;
//
//		case 'C':
//			System.out.println("Ucundan Geçtin Dostum");
//			break;
//
//		case 'D':
//			System.out.println("Koþullu Geçtin Dostum");
//			break;
//
//		case 'F':
//			System.out.println("Kaldýn Dostum");
//			break;
//
//		default:
//			System.out.println("Geçersiz not girdiniz");
//
//		}

		// -----------------------------------------

//	 <Recap1>
//	 int sayi1 = 13;
//	 int sayi2 = 23;
//	 int enBuyuk = sayi1;

//	 if (enBuyuk < sayi2) {
//	 enBuyuk = sayi2;
//	 }

//	 if (enBuyuk < sayi3) {
//	 enBuyuk = sayi3;
//	 }

//	 System.out.println("En büyük sayý: " + enBuyuk);

//	 <Conditionals> --> Þart Bloklarý
//	 int yaziBoyutu = 34;
//	 if (yaziBoyutu < 34) {
//	 System.out.println("Yazý boyutu görünmeyecek kadar küçük!");
//	 }
//	 else {
//	 System.out.println("Yazý boyutu uygun büyüklüðe sahiptir.");
//	 }

		// ----------------------------------------

//	 <Data Types> -- Veri Türleri
//	 boolean dogruMu = true;
//	 char karakter = 'a';
//	 int sayi = 351334;
//	 String sehir = "Tatvan";
//	 double ondalikli = 12.315315;

		// --------------------------------------------

//	 <Deðiþkenler> Reusability --> yeniden kullanýlabilirlik
//	 String degiskenKurs = "mehabazda her saydafa ayný anda deðiþkenleri
//	 deðiþtirdim!";

//	 System.out.println(degiskenKurs);
//	 System.out.println(degiskenKurs);
//	 System.out.println(degiskenKurs);
//	 System.out.println(degiskenKurs);

		// -----------------------------------------

//	 Rahman ve Rahim olan Allah'ýn adýyla.
//	 System.out.println("Let's do it bro!");

//	 
	}
}
