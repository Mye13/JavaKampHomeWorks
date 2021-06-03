package Concrete;

import java.text.DecimalFormat;

import Abstract.CampaignService;
import Abstract.EntityCampaignService;
import Abstract.EntityGameService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements EntityGameService, EntityCampaignService, CampaignService{
	
	public void addCampaign(Campaign campaign) {
		System.out.println("Kampanya eklendi." + " " + campaign.getName());
	}
	
	public void UpdateCampaign(Campaign campaign) {
		System.out.println("Kampanya güncellendi." + " " + campaign.getName());
	}
	
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Kampanya silindi." + " " + campaign.getName());
	}
	
	public void useCampaign(Game game, Campaign campaign) {
		double price = game.getPrice()-game.getPrice()*campaign.getDiscountRate()/100;
		DecimalFormat formatter = new DecimalFormat("##.##");
		System.out.println("Satýn aldýðýnýz oyunun fiyatý indirimle" + " " + formatter.format(price) + " " + "TL ye inmiþtir. Ödediðiniz fazla ücret cüzdanýnýza geri ödenmiþtir.");
	}

}
