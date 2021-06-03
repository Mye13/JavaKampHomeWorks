package Concrete;

import Abstract.EntityGamerService;
import Abstract.GamerCheckService;
import Entities.Gamer;

public class GamerManager implements EntityGamerService{
	
	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}
	
	public void register(Gamer gamer) {
		if(gamerCheckService.CheckIsRealPerson(gamer)) {
			System.out.println("Kayýt baþarýlý : " + gamer.getFirstName());
		}else {
			System.out.println("Kullanýcý bulunamadý : " + gamer.getFirstName());
		}
		
	}
	
	public void update(Gamer gamer) {
		System.out.println("Güncelleme baþarýlý : " + gamer.getFirstName());
	}
	
	public void delete(Gamer gamer) {
		System.out.println("Kayýt silindi : " + gamer.getFirstName());
	}
	
}
