package Main;

import java.time.LocalDate;

import Adapters.MernisVerification;
import Concrete.CampaignManager;
import Concrete.GamerManager;
import Concrete.Pazarlama;
import Entities.Gamer;
import Entities.Campaign;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer();
		gamer.setFirstName("Rag�p");
		gamer.setLastName("Karaso");
		gamer.setBirthDay(LocalDate.of(1999, 1, 1));
		gamer.setNationaltiyId("12345612389");
		
		Game game = new Game();
		game.setId(1);
		game.setName("Rust");
		game.setPrice(62);
		
		Campaign fakeCampaign = new Campaign();  // asl�nda bindirim oldu�u halde yalandan indirim varm�� gibi sjsjsj.
		fakeCampaign.setId(1);
		fakeCampaign.setName("Sepette y�zde 10 indirim!");
		fakeCampaign.setDiscountRate(0.01);
		
		Campaign campaign = new Campaign();
		campaign.setId(2);
		campaign.setName("�lk oyunda y�zde 50 indirim kampanyas�!");
		campaign.setDiscountRate(50);
		
		GamerManager gamerManager = new GamerManager(new MernisVerification());
		gamerManager.register(gamer);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign);
		
		Pazarlama pazarlama = new Pazarlama();
		pazarlama.sat�nAl(game, gamer, fakeCampaign);
		pazarlama.iadeEt(game, gamer);
		
	}

}
