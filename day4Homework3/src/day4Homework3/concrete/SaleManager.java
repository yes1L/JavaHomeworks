package day4Homework3.concrete;

import day4Homework3.abstracts.SaleService;
import day4Homework3.entities.Campaign;
import day4Homework3.entities.Game;
import day4Homework3.entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() + " oyunu satýn aldý. Oyun adý : " + game.getGameName() + " : " + game.getUnitPrice()+"$");
	}

	@Override
	public void campaignSale(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getFirstName() + " oyunu kampanya ile satýn aldý. Oyun adý : " +game.getGameName()+" Kampanya adý : "+campaign.getCampaignName());
		System.out.println(game.getGameName()+" oyunun kampanya sonrasý fiyatý : "+game.getAfterDiscountPrice()+"$");
	}
}
