package Concrete;

import Abstract.EntityCampaignService;
import Abstract.EntityGameService;
import Abstract.EntityGamerService;
import Entities.Game;
import Entities.Gamer;
import Entities.Campaign;

public class Pazarlama implements EntityGamerService, EntityGameService, EntityCampaignService {
	
	public void satýnAl(Game game, Gamer gamer, Campaign campaign) {
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.useCampaign(game, campaign);
		System.out.println(gamer.getFirstName() + " " + "Tebrikler artýk bu oyuna sahipsin :" + " " + game.getName());
	}

	public void iadeEt(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + "Oyundan memnun kalmadýðýn için üzgünüz :(" + " " + game.getName() + " " + "Ýade alýndý ücret geri ödemesi gerçekleþtirildi.");
	}
	
}
