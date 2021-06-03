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
			System.out.println("Kay�t ba�ar�l� : " + gamer.getFirstName());
		}else {
			System.out.println("Kullan�c� bulunamad� : " + gamer.getFirstName());
		}
		
	}
	
	public void update(Gamer gamer) {
		System.out.println("G�ncelleme ba�ar�l� : " + gamer.getFirstName());
	}
	
	public void delete(Gamer gamer) {
		System.out.println("Kay�t silindi : " + gamer.getFirstName());
	}
	
}
