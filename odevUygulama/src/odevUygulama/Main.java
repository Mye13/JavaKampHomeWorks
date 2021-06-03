package odevUygulama;

public class Main {

	public static void main(String[] args) {

		// Mini Proje5 - Say� Bulma -----------------------------
		
//		int[] numbers = new int[] {1, 2, 5, 7, 9, 0};
//		int lookForNumber = 1;
//		
//		for (int number : numbers) {
//			if (number == lookForNumber) {
//				System.out.println("Arad���n�z say�y� buldunuz.");
//				return;
//				}	
//			}
//		System.out.println("Arad���n�z say� listede bulunmamaktad�r.");
		
	
		// Mini Proje4 - Arkada� Say�lar ------------------------

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
//			System.out.println("Girdi�iniz say�lar arkada� say�lard�r.");
//		} else {
//			System.out.println("Girdi�iniz say�lar arkada� say� de�ildir.");
//		}

		// Mini Proje3 - M�kemmel Say� ---------------------------

//		int number = -27;
//		int total = 0;
//		
//		if (number == 1) {
//			System.out.println("Girdi�iniz say� m�kemmel say� de�ildir.");
//			return;
//		}
//		
//		if (number < 1) {
//			System.out.println("Ge�ersiz say� girdiniz.");
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
//			System.out.println("Girdi�iniz say� m�kemmel say�d�r.");
//		} else {
//			System.out.println("Girdi�iniz say� m�kemmel say� de�ildir");
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
//		case '�':
//		case 'o':
//		case 'u':
//			System.out.println("Kal�n sesli harf.");
//			break;
//			default:
//				System.out.println("�nce sesli harf.");
//		}

		// Mini Proje - Say� Asal M�? ---------------------------

//		int number = 19;
//		int remainder;
//
//		boolean asalSayiMi = true;
//
//		if (number == 1) {
//			System.out.println("1 Say�s� asal de�ildir.");
//			return;
//		}
//
//		if (number < 1) {
//			System.out.println("Ge�ersiz say� girdiniz.");
//			return;
//		}
//
//		for (int i = 2; i < number; i++) {
//			if (number % i == 0) {
//				asalSayiMi = false;
//			}
//		}
//
//		if (asalSayiMi) {  //boolean kulan�m�nda true false belirtilmezse otomatik olarak true se�ilir.
//			System.out.println(number + " Say�s� asald�r.");
//		} else {
//			System.out.println(number + " Say�s� asal de�ildir.");
//		}

		// <Bu y�ntem i�e yaram�yor>
//		for (int i = 2; i < 8; i++) {
//			remainder = number % i;
//			if (remainder == 0) {
//				System.out.println(number + " Asal say�d�r.");
//				break;
//			}
//			else {
//				System.out.println(number + " Asal say� de�ildir.");
//				break;
//			}
//		}

		// Strings Demo ----------------------------

//		String mesaj = "Ben koronay�m ama iyile�ece�im.";
//		System.out.println(mesaj);

//		System.out.println("Eleman say�s� : " + mesaj.length());
//		System.out.println("5. eleman : " + mesaj.charAt(4));
//		System.out.println(mesaj.concat(" Ama iyile�mel �zereyim."));
//		System.out.println(mesaj.startsWith("C"));
//		System.out.println(mesaj.endsWith("."));
//		char[] karakterler = new char[5];
//		mesaj.getChars(0, 5, karakterler, 0); // -> mesaj�n |0.| karakterinden |4.| karakterine kadar olan karakterleri |karakterler arrayine| ata ve karakterler arrayinin |0. eleman�ndan| atamaya ba�la. 
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
//		System.out.println(mesaj.trim());  //E�er c�mlenin ba��nda veya sonunda bo�luk varsa bu komut bo�luklar� siler.

		// Multi Dimensional Arrays ----------------
		// <Matris �rne�i>

//		String[][] sehirler = new String[3][3];
//		sehirler[0][0] = "Tatvan";
//		sehirler[0][1] = "Ahlat";
//		sehirler[0][2] = "Mutki";
//		sehirler[1][0] = "Hizan";
//		sehirler[1][1] = "Adilcevaz";
//		sehirler[1][2] = "Merkez";
//		sehirler[2][0] = "Van";
//		sehirler[2][1] = "Siirt";
//		sehirler[2][2] = "A�r�";
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
//		System.out.println("Say�lar toplam�: " + total);
//		System.out.println("En b�y�k say�: " + big);

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
//			System.out.println("i 10 dan k���k oldu�u s�rece ekran� bu yaz�y� yazd�r." + i);
//		}

		// Switch - Case ---------------------------

//		char grade = 'b';
//
//		switch (grade) {
//		case 'A':
//			System.out.println("M�kemmel Ge�tin Dostum");
//			break;
//
//		case 'B':
//			System.out.println("Orta-M�k Ge�tin Dostum");
//			break;
//
//		case 'C':
//			System.out.println("Ucundan Ge�tin Dostum");
//			break;
//
//		case 'D':
//			System.out.println("Ko�ullu Ge�tin Dostum");
//			break;
//
//		case 'F':
//			System.out.println("Kald�n Dostum");
//			break;
//
//		default:
//			System.out.println("Ge�ersiz not girdiniz");
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

//	 System.out.println("En b�y�k say�: " + enBuyuk);

//	 <Conditionals> --> �art Bloklar�
//	 int yaziBoyutu = 34;
//	 if (yaziBoyutu < 34) {
//	 System.out.println("Yaz� boyutu g�r�nmeyecek kadar k���k!");
//	 }
//	 else {
//	 System.out.println("Yaz� boyutu uygun b�y�kl��e sahiptir.");
//	 }

		// ----------------------------------------

//	 <Data Types> -- Veri T�rleri
//	 boolean dogruMu = true;
//	 char karakter = 'a';
//	 int sayi = 351334;
//	 String sehir = "Tatvan";
//	 double ondalikli = 12.315315;

		// --------------------------------------------

//	 <De�i�kenler> Reusability --> yeniden kullan�labilirlik
//	 String degiskenKurs = "mehabazda her saydafa ayn� anda de�i�kenleri
//	 de�i�tirdim!";

//	 System.out.println(degiskenKurs);
//	 System.out.println(degiskenKurs);
//	 System.out.println(degiskenKurs);
//	 System.out.println(degiskenKurs);

		// -----------------------------------------

//	 Rahman ve Rahim olan Allah'�n ad�yla.
//	 System.out.println("Let's do it bro!");

//	 
	}
}
